package pe.joedayz.clientes.repository;

import pe.joedayz.clientes.entity.TipoDocumento;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : JoeDayz
 * @since : 22/03/20
 */
public interface TipoDocumentoRepository extends JpaRepository<TipoDocumento, Integer> {
}
