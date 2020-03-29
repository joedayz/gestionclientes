package pe.joedayz.clientes.repository;

import pe.joedayz.clientes.entity.Cargo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CargoRepository extends JpaRepository<Cargo, Short> {
}
