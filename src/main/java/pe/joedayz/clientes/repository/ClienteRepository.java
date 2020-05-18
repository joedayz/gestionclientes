package pe.joedayz.clientes.repository;



import pe.joedayz.clientes.entity.Cliente;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author : JoeDayz
 * @since : 21/03/20
 */
public interface ClienteRepository extends PagingAndSortingRepository<Cliente, Integer> {

	Page<Cliente> findByCodSocioContainingOrNomCompletoContainingOrRazonSocialContainingAllIgnoreCase(
			String codSocio,
			String nomCompleto,
			String razonSocial,
			Pageable pageable);
}
