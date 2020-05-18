package pe.joedayz.clientes.repository;


import pe.joedayz.clientes.entity.Role;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
