package pe.joedayz.clientes.dto;

import java.util.List;

public class MenuItem {

	private String name;

	private String url;

	private MenuItem parent;

	private List<MenuItem> children;

	public MenuItem() {}

	public MenuItem(String name,List<MenuItem> children) {
		this.name = name;
		this.children = children;
	}

	public MenuItem(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public MenuItem getParent() {
		return parent;
	}

	public List<MenuItem> getChildren() {
		return children;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setParent(MenuItem parent) {
		this.parent = parent;
	}

	public void setChildren(List<MenuItem> children) {
		this.children = children;
	}
}