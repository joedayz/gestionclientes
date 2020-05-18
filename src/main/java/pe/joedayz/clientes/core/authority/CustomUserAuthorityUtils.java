package pe.joedayz.clientes.core.authority;

import java.util.Collection;

import java.util.Set;
import java.util.stream.Collectors;


import pe.joedayz.clientes.entity.Role;
import pe.joedayz.clientes.entity.Usuario;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;


public class CustomUserAuthorityUtils {

	public static Collection<? extends GrantedAuthority> createAuthorities(Usuario usuario) {
		Set<Role> roles = usuario.getRoles();
		String strRoles = roles.stream()
				.map(Role::getNombreRole)
				.collect(Collectors.joining(","));
		return AuthorityUtils.createAuthorityList(strRoles);
	}

	private CustomUserAuthorityUtils() {
	}
}
