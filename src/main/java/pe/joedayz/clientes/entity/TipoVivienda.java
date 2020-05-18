package pe.joedayz.clientes.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "Tipos_Vivienda")
@NamedQueries({
		@NamedQuery(name = "TipoVivienda.findAll", query = "SELECT t FROM TipoVivienda t")})
public class TipoVivienda implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "Codigo")
	private Integer codigo;
	@Column(name = "Descripcion")
	private String descripcion;

	public TipoVivienda() {
	}

	public TipoVivienda(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
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

		if (!(object instanceof TipoVivienda)) {
			return false;
		}
		TipoVivienda other = (TipoVivienda) object;
		if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "pe.com.siacoopapp.entity.TipoVivienda[ codigo=" + codigo + " ]";
	}

}
