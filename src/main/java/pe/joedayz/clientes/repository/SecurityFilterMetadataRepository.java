package pe.joedayz.clientes.repository;


import pe.joedayz.clientes.entity.SecurityFilterMetadata;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SecurityFilterMetadataRepository extends JpaRepository<SecurityFilterMetadata, Integer> {
}
