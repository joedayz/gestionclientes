package pe.joedayz.clientes.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "Ubigeo")
@NamedQueries({
		@NamedQuery(name = "Ubigeo.findAll", query = "SELECT t FROM Ubigeo t")})
public class Ubigeo implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@Column(name = "Codigo")
	private String codigo;
	@Column(name = "Cod_Dpto")
	private String codDpto;
	@Column(name = "Cod_Provincia")
	private String codProvincia;
	@Column(name = "Cod_Distrito")
	private String codDistrito;
	@Column(name = "Descripcion")
	private String descripcion;


	public Ubigeo() {
	}

	public Ubigeo(String codigo, String descripcion) {
		this.codigo = codigo;
		this.descripcion = descripcion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCodDpto() {
		return codDpto;
	}

	public void setCodDpto(String codDpto) {
		this.codDpto = codDpto;
	}

	public String getCodProvincia() {
		return codProvincia;
	}



	public void setCodProvincia(String codProvincia) {
		this.codProvincia = codProvincia;
	}

	public String getCodDistrito() {
		return codDistrito;
	}

	public void setCodDistrito(String codDistrito) {
		this.codDistrito = codDistrito;
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

		if (!(object instanceof Ubigeo)) {
			return false;
		}
		Ubigeo other = (Ubigeo) object;
		if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "pe.com.siacoopapp.entity.Ubigeo[ codigo=" + codigo + " ]";
	}

}
