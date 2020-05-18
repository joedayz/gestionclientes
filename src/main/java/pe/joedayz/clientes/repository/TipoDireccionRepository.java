package pe.joedayz.clientes.repository;


import pe.joedayz.clientes.entity.TipoDireccion;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoDireccionRepository extends JpaRepository<TipoDireccion, String> {
}
