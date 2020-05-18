package pe.joedayz.clientes.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "Menus")
@NamedQueries({
		@NamedQuery(name = "Menu.findAll", query = "SELECT t FROM Menu t")})
public class Menu implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "Cod_Menu")
	private Integer codMenu;
	@Column(name = "Descripcion")
	private String descripcion;
	@Column(name = "Padre")
	private Integer padre;
	@Column(name = "Orden")
	private Integer orden;
	@Column(name = "Activo")
	private Integer activo;

	public Menu() {
	}

	public Menu(Integer codMenu) {
		this.codMenu = codMenu;
	}

	public Integer getCodMenu() {
		return codMenu;
	}

	public void setCodMenu(Integer codMenu) {
		this.codMenu = codMenu;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getPadre() {
		return padre;
	}

	public void setPadre(Integer padre) {
		this.padre = padre;
	}

	public Integer getOrden() {
		return orden;
	}

	public void setOrden(Integer orden) {
		this.orden = orden;
	}

	public Integer getActivo() {
		return activo;
	}

	public void setActivo(Integer activo) {
		this.activo = activo;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (codMenu != null ? codMenu.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof Menu)) {
			return false;
		}
		Menu other = (Menu) object;
		if ((this.codMenu == null && other.codMenu != null) || (this.codMenu != null && !this.codMenu.equals(other.codMenu))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "pe.com.siacoopapp.entity.Menu[ codMenu=" + codMenu + " ]";
	}

}
