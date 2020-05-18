package pe.joedayz.clientes.repository;


import pe.joedayz.clientes.entity.Nacionalidad;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NacionalidadRepository extends JpaRepository<Nacionalidad, String> {
}
