package pe.joedayz.clientes.repository;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import pe.joedayz.clientes.dto.Menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
@CacheConfig(cacheNames={"menues"})
public class MenuRepository {


	@Autowired
	private DataSource dataSource;

	private NamedParameterJdbcTemplate jdbcTemplate;

	@PostConstruct
	private void postConstruct() {
		jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);

	}

	private static final String MENU_SQL = "SELECT\n"
			+ "    p.Cod_Menu as Parent_Id,\n"
			+ "    p.Descripcion as Parent_Name,\n"
			+ "    c1.Cod_Menu as Child_Id,\n"
			+ "    c1.Descripcion as Child_Name,\n"
			+ "    c1.Url as Child_Url\n"
			+ "FROM \n"
			+ "    menus p\n"
			+ "LEFT JOIN `Menus` c1\n"
			+ "    ON c1.padre = p.Cod_Menu and c1.activo=1\n"
			+ "WHERE\n"
			+ "    p.padre=0 and p.activo=1";

	@Cacheable
	public List<Menu> getMenues() throws DataAccessException {

		MapSqlParameterSource parameters = new MapSqlParameterSource();

		List<Menu> menues =  jdbcTemplate.query( MENU_SQL, new MenuMapper());
		return menues;
	}
	private static class MenuMapper implements RowMapper<Menu> {
		@Override
		public Menu mapRow(ResultSet rs, int rowNum) throws SQLException {
			Menu menu = new Menu();
			menu.setParentId(rs.getInt("Parent_Id"));
			menu.setParentName(rs.getString("Parent_Name"));
			menu.setChildId(rs.getInt("Child_Id"));
			menu.setChildName(rs.getString("Child_Name"));
			menu.setUrl(rs.getString("Child_Url"));
			return menu;
		}
	}
}
