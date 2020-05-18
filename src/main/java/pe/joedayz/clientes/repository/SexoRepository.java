package pe.joedayz.clientes.repository;


import pe.joedayz.clientes.entity.Sexo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SexoRepository extends JpaRepository<Sexo, String> {
}
