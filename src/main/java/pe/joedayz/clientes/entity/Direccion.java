package pe.joedayz.clientes.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.*;

@Entity
@Table(name = "Direcciones")
@NamedQueries({
		@NamedQuery(name = "Direccion.findAll", query = "SELECT t FROM Direccion t")})
public class Direccion implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Basic(optional = false)
	@Column(name = "Cod_Direccion")
	private Integer codDireccion;
	@Basic(optional = false)
	@Column(name = "Tipo_Direccion")
	private String tipoDireccion;
	@Column(name = "Tipo_Calle")
	private String tipoCalle;
	@Column(name = "Direcci\u00f3n")
	private String direccion;
	@Column(name = "Nro_direccion")
	private String nrodireccion;
	@Column(name = "Interior_Dpto")
	private String interiorDpto;
	@Column(name = "Mz_Direccion")
	private String mzDireccion;
	@Column(name = "Lote_Dreccion")
	private String loteDreccion;
	@Column(name = "Tipo_Agrupacion")
	private String tipoAgrupacion;
	@Column(name = "Lugar")
	private String lugar;

	@Column(name = "Usuario_Registro")
	private String usuarioRegistro;
	@Column(name = "Fecha_Registro")
	@Temporal(TemporalType.DATE)
	private Date fechaRegistro;
	@Column(name = "Hora_Registro")
	@Temporal(TemporalType.TIME)
	private Date horaRegistro;
	@Column(name = "Usuario_Modifica")
	private String usuarioModifica;
	@Column(name = "Fecha_Modifica")
	@Temporal(TemporalType.DATE)
	private Date fechaModifica;
	@Column(name = "Hora_Modifica")
	@Temporal(TemporalType.TIME)
	private Date horaModifica;

	@ManyToOne
	@JoinColumn(name = "Cod_Socio", nullable = false)
	private Socio socio;

	@Column(name="Nombre_Tipo_Direccion")
	private String nombreTipoDireccion;

	@Column(name="Departamento")
	private String departamento;
	@Column(name="Provincia")
	private String provincia;
	@Column(name="Distrito")
	private String distrito;

	@Column(name="Cod_Dpto")
	private String codDpto;
	@Column(name="Cod_Provincia")
	private String codProvincia;
	@Column(name="Cod_Distrito")
	private String codDistrito;


	public Direccion() {
	}

	public Direccion(String tipoDireccion, String nombreTipoDireccion, String tipoCalle, String direccion,
			String nrodireccion, String interiorDpto, String mzDireccion,
			String loteDreccion, String tipoAgrupacion, String lugar, Socio socio,
			String departamento, String provincia, String distrito, String codDpto, String codProvincia, String codDistrito) {

		this.tipoDireccion = tipoDireccion;
		this.nombreTipoDireccion = nombreTipoDireccion;
		this.tipoCalle = tipoCalle;
		this.direccion = direccion;
		this.nrodireccion = nrodireccion;
		this.interiorDpto = interiorDpto;
		this.mzDireccion = mzDireccion;
		this.loteDreccion = loteDreccion;
		this.tipoAgrupacion = tipoAgrupacion;
		this.lugar = lugar;
		this.socio = socio;

		this.departamento = departamento;
		this.provincia = provincia;
		this.distrito = distrito;
		this.codDpto = codDpto;
		this.codProvincia = codProvincia;
		this.codDistrito = codDistrito;
	}



	public String getTipoCalle() {
		return tipoCalle;
	}

	public void setTipoCalle(String tipoCalle) {
		this.tipoCalle = tipoCalle;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String dirección) {
		this.direccion = dirección;
	}

	public String getNrodireccion() {
		return nrodireccion;
	}

	public void setNrodireccion(String nrodireccion) {
		this.nrodireccion = nrodireccion;
	}

	public String getInteriorDpto() {
		return interiorDpto;
	}

	public void setInteriorDpto(String interiorDpto) {
		this.interiorDpto = interiorDpto;
	}

	public String getMzDireccion() {
		return mzDireccion;
	}

	public void setMzDireccion(String mzDireccion) {
		this.mzDireccion = mzDireccion;
	}

	public String getLoteDreccion() {
		return loteDreccion;
	}

	public void setLoteDreccion(String loteDreccion) {
		this.loteDreccion = loteDreccion;
	}

	public String getTipoAgrupacion() {
		return tipoAgrupacion;
	}

	public void setTipoAgrupacion(String tipoAgrupacion) {
		this.tipoAgrupacion = tipoAgrupacion;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}


	public String getUsuarioRegistro() {
		return usuarioRegistro;
	}

	public void setUsuarioRegistro(String usuarioRegistro) {
		this.usuarioRegistro = usuarioRegistro;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Date getHoraRegistro() {
		return horaRegistro;
	}

	public void setHoraRegistro(Date horaRegistro) {
		this.horaRegistro = horaRegistro;
	}

	public String getUsuarioModifica() {
		return usuarioModifica;
	}

	public void setUsuarioModifica(String usuarioModifica) {
		this.usuarioModifica = usuarioModifica;
	}

	public Date getFechaModifica() {
		return fechaModifica;
	}

	public void setFechaModifica(Date fechaModifica) {
		this.fechaModifica = fechaModifica;
	}

	public Date getHoraModifica() {
		return horaModifica;
	}

	public void setHoraModifica(Date horaModifica) {
		this.horaModifica = horaModifica;
	}

	public Socio getSocio() {
		return socio;
	}

	public void setSocio(Socio socio) {
		this.socio = socio;
	}



	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public String getNombreTipoDireccion() {
		return nombreTipoDireccion;
	}

	public void setNombreTipoDireccion(String nombreTipoDireccion) {
		this.nombreTipoDireccion = nombreTipoDireccion;
	}

	public Integer getCodDireccion() {
		return codDireccion;
	}

	public void setCodDireccion(Integer codDireccion) {
		this.codDireccion = codDireccion;
	}

	public String getTipoDireccion() {
		return tipoDireccion;
	}

	public void setTipoDireccion(String tipoDireccion) {
		this.tipoDireccion = tipoDireccion;
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

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (codDireccion != null ? codDireccion.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof Direccion)) {
			return false;
		}
		Direccion other = (Direccion) object;
		if ((this.codDireccion == null && other.codDireccion != null) || (this.codDireccion != null && !this.codDireccion.equals(other.codDireccion))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "pe.com.siacoopapp.entity.TM002Direcciones[ codDireccion=" + codDireccion + " ]";
	}
}
