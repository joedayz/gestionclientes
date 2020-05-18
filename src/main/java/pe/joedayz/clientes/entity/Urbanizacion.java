package pe.joedayz.clientes.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "Urbanizacion")
@NamedQueries({
		@NamedQuery(name = "Urbanizacion.findAll", query = "SELECT t FROM Urbanizacion t")})
public class Urbanizacion implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@Column(name = "Codigo")
	private String codigo;
	@Column(name = "Descripcion")
	private String descripcion;

	public Urbanizacion() {
	}

	public Urbanizacion(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (codigo != null ? codigo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof Urbanizacion)) {
			return false;
		}
		Urbanizacion other = (Urbanizacion) object;
		if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "pe.com.siacoopapp.entity.Urbanizacion[ codigo=" + codigo + " ]";
	}

}
