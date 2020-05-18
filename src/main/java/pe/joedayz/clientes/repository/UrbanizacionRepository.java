package pe.joedayz.clientes.repository;


import pe.joedayz.clientes.entity.Urbanizacion;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UrbanizacionRepository extends JpaRepository<Urbanizacion, String> {
}
