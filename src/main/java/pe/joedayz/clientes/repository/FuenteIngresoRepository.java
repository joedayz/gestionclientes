package pe.joedayz.clientes.repository;


import pe.joedayz.clientes.entity.FuenteIngreso;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FuenteIngresoRepository extends JpaRepository<FuenteIngreso, String> {
}
