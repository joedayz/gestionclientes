package pe.joedayz.clientes.repository;

import java.util.List;

import pe.joedayz.clientes.entity.Ubigeo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UbigeoRepository extends JpaRepository<Ubigeo, String> {

	@Query("SELECT u FROM Ubigeo u WHERE u.codProvincia = '00' and u.codDistrito = '00'")
	List<Ubigeo> findDepartamentos();

	@Query("SELECT u FROM Ubigeo u WHERE u.codDpto= :codDpto and u.codProvincia <> '00' and u.codDistrito = '00'")
	List<Ubigeo> findProvincias(@Param("codDpto") String codDpto);

	@Query("SELECT u FROM Ubigeo u WHERE u.codDpto= :codDpto and u.codProvincia = :codProvincia and u.codDistrito <> '00'")
	List<Ubigeo> findDistritos(@Param("codDpto") String codDpto, @Param("codProvincia") String codProvincia);
}
