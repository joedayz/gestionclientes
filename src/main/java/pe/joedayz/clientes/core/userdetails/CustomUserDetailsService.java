package pe.joedayz.clientes.core.userdetails;

import java.util.Collection;


import pe.joedayz.clientes.core.authority.CustomUserAuthorityUtils;
import pe.joedayz.clientes.entity.Usuario;
import pe.joedayz.clientes.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {


	@Autowired
	UsuarioRepository usuarioRepository;


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = usuarioRepository.findByCodUsuario(username);
		if (usuario == null) {
			throw new UsernameNotFoundException("Usuario/Password invalidos!");
		}
		return new CustomUserDetails(usuario);
	}

	private final class CustomUserDetails extends Usuario implements UserDetails {
		CustomUserDetails(Usuario usuario) {
			setId(usuario.getId());
			setCodUsuario(usuario.getCodUsuario());
			setPasswordUsuario(usuario.getPasswordUsuario());
			setActive(usuario.isActive());
		}

		@Override
		public Collection<? extends GrantedAuthority> getAuthorities() {
			return CustomUserAuthorityUtils.createAuthorities(this);
		}

		@Override
		public String getPassword() {
			return getPasswordUsuario();
		}

		@Override
		public String getUsername() {
			return getCodUsuario();
		}

		@Override
		public boolean isAccountNonExpired() {
			return true;
		}

		@Override
		public boolean isAccountNonLocked() {
			return true;
		}

		@Override
		public boolean isCredentialsNonExpired() {
			return true;
		}

		@Override
		public boolean isEnabled() {
			return isActive();
		}

		private static final long serialVersionUID = 3384436451564509032L;
	}
}
