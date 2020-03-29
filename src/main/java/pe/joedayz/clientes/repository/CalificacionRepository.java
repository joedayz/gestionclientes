package pe.joedayz.clientes.repository;

import pe.joedayz.clientes.entity.Calificacion;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CalificacionRepository extends JpaRepository<Calificacion, String> {
}
