package pe.joedayz.clientes.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;


import pe.joedayz.clientes.dto.Menu;
import pe.joedayz.clientes.dto.MenuItem;
import pe.joedayz.clientes.entity.Usuario;
import pe.joedayz.clientes.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class Util {


	@Autowired
	private UsuarioRepository usuarioRepository;


	public List<MenuItem> agruparMenus(List<Menu> menues) {

		String grupoMenus = getGrupoMenusDeUsuario();

		List<MenuItem> menuItems = new ArrayList<>();
		Integer parentId = 0;
		MenuItem menuItemPadre = new MenuItem();
		Integer childId = 0;
		List<MenuItem> hijos = new ArrayList<>();

		for (Menu menu : menues) {
			if (parentId != menu.getParentId()) {

				if(menuEstaDisponible(menu.getParentId(), grupoMenus)) {
					hijos = new ArrayList<>();
					menuItemPadre = new MenuItem(menu.getParentName(), hijos);
					parentId = menu.getParentId();
					menuItems.add(menuItemPadre);
				}
			}

			if(menuEstaDisponible(menu.getChildId(), grupoMenus)) {
				MenuItem menuItemHijo = new MenuItem();
				menuItemHijo.setName(menu.getChildName());
				menuItemHijo.setUrl(menu.getUrl());
				menuItemHijo.setParent(menuItemPadre);
				menuItemPadre.getChildren().add(menuItemHijo);
			}
		}


		return menuItems;
	}

	private boolean menuEstaDisponible(Integer menuId, String grupoMenus) {

		int[] resultado= Stream.of(grupoMenus.split("\\D+")).mapToInt(Integer::parseInt).toArray();

		if (IntStream.of(resultado).anyMatch(myValue -> myValue == menuId)){
			return true;
		}else{
			return false;
		}

	}

	private String getGrupoMenusDeUsuario() {
		String username = "";

		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		username = ((Usuario)principal).getCodUsuario();


		Usuario usuario = usuarioRepository.findByCodUsuario(username);


		return usuario.getGrupoMenus();
	}
}
