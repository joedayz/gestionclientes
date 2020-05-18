package pe.joedayz.clientes.config;

import java.util.Arrays;
import java.util.List;

import pe.joedayz.clientes.authentication.CustomUserAuthenticationProvider;
import pe.joedayz.clientes.repository.UsuarioRepository;
import pe.joedayz.clientes.web.access.expression.CustomWebSecurityExpressionHandler;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Description;
import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDecisionVoter;
import org.springframework.security.access.vote.AuthenticatedVoter;
import org.springframework.security.access.vote.ConsensusBased;
import org.springframework.security.access.vote.RoleVoter;
import org.springframework.security.access.vote.UnanimousBased;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.access.expression.WebExpressionVoter;

@Configuration
public class CustomAuthorizationConfig
{

	@Description("ConsensusBased AccessDecisionManager for Authorization voting")
	@Bean
	public AccessDecisionManager accessDecisionManager(
			CustomWebSecurityExpressionHandler customWebSecurityExpressionHandler) {
		List<AccessDecisionVoter<? extends Object>> decisionVoters
				= Arrays.asList(
				new WebExpressionVoter(){{
					setExpressionHandler(customWebSecurityExpressionHandler);
				}}
		);
		return new ConsensusBased(decisionVoters);
	}


	@Description("AuthenticationManager that will generate an authentication token unlike {PreAuthenticatedAuthenticationProvider}")
	@Bean @DependsOn({"usuarioRepository"})
	public CustomUserAuthenticationProvider calendarUserAuthenticationProvider(
			UsuarioRepository usuarioRepository,
			PasswordEncoder passwordEncoder){
		return new CustomUserAuthenticationProvider(usuarioRepository, passwordEncoder);
	}

}