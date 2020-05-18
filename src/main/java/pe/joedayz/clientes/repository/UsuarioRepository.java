package pe.joedayz.clientes.repository;


import pe.joedayz.clientes.entity.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {

	Usuario findByCodUsuario(String username);
}
