package pe.joedayz.clientes.repository;

import pe.joedayz.clientes.entity.Socio;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author : JoeDayz
 * @since : 21/03/20
 */
public interface SocioRepository extends PagingAndSortingRepository<Socio, Integer> {

	Page<Socio> findByCodSocioOrApePaternoOrApeMaternoOrNomCompletoAllIgnoreCase(String codSocio,
			String apePaterno,
			String apeMaterno,
			String nomCompleto,
			Pageable pageable);
}
