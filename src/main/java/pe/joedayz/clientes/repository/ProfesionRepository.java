package pe.joedayz.clientes.repository;


import pe.joedayz.clientes.entity.Profesion;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesionRepository extends JpaRepository<Profesion, Integer> {
}
