package pe.joedayz.clientes.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.joedayz.clientes.authentication.CustomUserAuthenticationProvider;
import pe.joedayz.clientes.web.access.expression.CustomWebSecurityExpressionHandler;
import pe.joedayz.clientes.web.access.intercept.FilterInvocationServiceSecurityMetadataSource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Import;
import org.springframework.core.annotation.Order;
import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;

/**
 * @author : JoeDayz
 * @since : 12/03/20
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, proxyTargetClass = true)
@Import({CustomAuthorizationConfig.class})
// Thymeleaf needs to use the Thymeleaf configured FilterSecurityInterceptor
// and not the default Filter from AutoConfiguration.
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
public class SecurityConfig extends WebSecurityConfigurerAdapter {



	private static final Logger logger = LoggerFactory
			.getLogger(SecurityConfig.class);


	@Autowired
	private CustomUserAuthenticationProvider customUserAuthenticationProvider;

	@Autowired
	private AccessDecisionManager accessDecisionManager;

	@Autowired
	private CustomWebSecurityExpressionHandler customWebSecurityExpressionHandler;

	@Autowired
	private FilterInvocationServiceSecurityMetadataSource metadataSource;


	@Override
	public void configure(final AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(customUserAuthenticationProvider);
	}


	@Description("Standard PasswordEncoder")
	@Bean
	public PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder(4);
	}


	@Override
	protected void configure(final HttpSecurity http) throws Exception {

		// Access Decision Manager:
		http.authorizeRequests().accessDecisionManager(accessDecisionManager)
		;

		// Web Expression Handler:
		http.authorizeRequests()
				.expressionHandler(customWebSecurityExpressionHandler);

		// Login
		http.formLogin()
				.loginPage("/login")
				.failureUrl("/login-error")
				.permitAll();


		// Logout
		http.logout()
				.logoutUrl("/logout")
				.logoutSuccessUrl("/login?logout").deleteCookies("JSESSIONID").invalidateHttpSession(true)
				.permitAll();


		// CSRF is enabled by default, with Java Config
		http.csrf().disable();


		// Enable <frameset> in order to use H2 web console
		http.headers().frameOptions().disable();
	}



	@Override
	public void configure(final WebSecurity web) throws Exception {

		// Ignore static resources and webjars from Spring Security
		web.ignoring()
				.antMatchers("/js/**")
				.antMatchers("/img/**")
				.antMatchers("/css/**")
				.antMatchers("/fonts/**")
		;

		// Thymeleaf needs to use the Thymeleaf configured FilterSecurityInterceptor
		// and not the default Filter from AutoConfiguration.
		final HttpSecurity http = getHttp();
		web.postBuildAction(() -> {

			FilterSecurityInterceptor fsi = http.getSharedObject(FilterSecurityInterceptor.class);
			fsi.setSecurityMetadataSource(metadataSource);
			web.securityInterceptor(fsi);
		});
	}
}
