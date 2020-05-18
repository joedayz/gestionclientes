package pe.joedayz.clientes.repository;


import pe.joedayz.clientes.entity.EstadoCivil;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoCivilRepository  extends JpaRepository<EstadoCivil, Short> {
}
