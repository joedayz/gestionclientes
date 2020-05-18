package pe.joedayz.clientes.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

@Entity
@Table(name = "Role")
public class Role  implements Serializable {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Integer Id;

	@Column(name = "Nom_Role")
	private String nombreRole;

	@ManyToMany(fetch = FetchType.EAGER, mappedBy = "roles")
	private Set<Usuario> usuarios;


	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getNombreRole() {
		return nombreRole;
	}

	public void setNombreRole(String nombreRole) {
		this.nombreRole = nombreRole;
	}

	public Set<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
