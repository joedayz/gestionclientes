package pe.joedayz.clientes.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "Usuarios")
@NamedQueries({
		@NamedQuery(name = "Usuario.findAll", query = "SELECT t FROM Usuario t")})
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@Column(name = "Cod_Usuario")
	private String codUsuario;
	@Column(name = "Nom_Usuario")
	private String nomUsuario;
	@Column(name = "Password_Usuario")
	private String passwordUsuario;
	@Column(name = "Fecha_Ingreso")
	@Temporal(TemporalType.DATE)
	private Date fechaIngreso;
	@Column(name = "Menu_Inicial")
	private Integer menuInicial;
	@Column(name = "Grupo_Menus")
	private String grupoMenus;
	@Basic(optional = false)
	@Column(name = "Active")
	private boolean active;
	@Basic(optional = false)
	@Column(name = "Id_Role")
	private String idRole;

	public Usuario() {
	}

	public Usuario(String codUsuario) {
		this.codUsuario = codUsuario;
	}

	public Usuario(String codUsuario, boolean active, String idRole) {
		this.codUsuario = codUsuario;
		this.active = active;
		this.idRole = idRole;
	}

	public String getCodUsuario() {
		return codUsuario;
	}

	public void setCodUsuario(String codUsuario) {
		this.codUsuario = codUsuario;
	}

	public String getNomUsuario() {
		return nomUsuario;
	}

	public void setNomUsuario(String nomUsuario) {
		this.nomUsuario = nomUsuario;
	}

	public String getPasswordUsuario() {
		return passwordUsuario;
	}

	public void setPasswordUsuario(String passwordUsuario) {
		this.passwordUsuario = passwordUsuario;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Integer getMenuInicial() {
		return menuInicial;
	}

	public void setMenuInicial(Integer menuInicial) {
		this.menuInicial = menuInicial;
	}

	public String getGrupoMenus() {
		return grupoMenus;
	}

	public void setGrupoMenus(String grupoMenus) {
		this.grupoMenus = grupoMenus;
	}

	public boolean getActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getIdRole() {
		return idRole;
	}

	public void setIdRole(String idRole) {
		this.idRole = idRole;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (codUsuario != null ? codUsuario.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Usuario)) {
			return false;
		}
		Usuario other = (Usuario) object;
		if ((this.codUsuario == null && other.codUsuario != null) || (this.codUsuario != null && !this.codUsuario.equals(other.codUsuario))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Usuario[ codUsuario=" + codUsuario + " ]";
	}

}