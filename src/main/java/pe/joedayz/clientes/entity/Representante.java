package pe.joedayz.clientes.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Representantes")
@NamedQueries({
		@NamedQuery(name = "Representante.findAll", query = "SELECT t FROM Representante t")})
public class Representante implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Basic(optional = false)
	@Column(name = "Cod_Representante")
	private Integer codRepresentante;
	@Basic(optional = false)
	@Column(name = "Nro_Documento")
	private String nroDocumento;
	@Column(name = "Tipo_Documento")
	private String tipoDocumento;
	@Column(name = "Ape_Paterno")
	private String apePaterno;
	@Column(name = "Ape_Materno")
	private String apeMaterno;
	@Column(name = "Nombres")
	private String nombres;
	@Column(name = "Cargo")
	private Short cargo;


	@Column(name = "Fecha_Cargo")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date fechaCargo;

	@Column(name = "Fecha_Registro")
	@Temporal(TemporalType.DATE)
	private Date fechaRegistro;
	@Column(name = "Usuario_Registro")
	private String usuarioRegistro;
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


	@Column(name="Nom_Cargo")
	private String nomCargo;

	@ManyToOne
	@JoinColumn(name = "Cod_Socio", nullable = false)
	private Cliente cliente;

	public Representante() {
	}

	public Representante(Integer codRepresentante) {
		this.codRepresentante = codRepresentante;
	}

	public Representante(String nroDocumento, String tipoDocumento, String apePaterno, String apeMaterno, String nombres, Short cargo,
			Date fechaCargo,  String nomCargo, Cliente cliente) {
		this.nroDocumento = nroDocumento;
		this.tipoDocumento = tipoDocumento;
		this.apePaterno = apePaterno;
		this.apeMaterno = apeMaterno;
		this.nombres = nombres;
		this.cargo = cargo;
		this.fechaCargo = fechaCargo;

		this.nomCargo = nomCargo;
		this.cliente = cliente;
	}

	public String getNroDocumento() {
		return nroDocumento;
	}

	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getApePaterno() {
		return apePaterno;
	}

	public void setApePaterno(String apePaterno) {
		this.apePaterno = apePaterno;
	}

	public String getApeMaterno() {
		return apeMaterno;
	}

	public void setApeMaterno(String apeMaterno) {
		this.apeMaterno = apeMaterno;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public Short getCargo() {
		return cargo;
	}

	public void setCargo(Short cargo) {
		this.cargo = cargo;
	}

	public Date getFechaCargo() {
		return fechaCargo;
	}

	public void setFechaCargo(Date fechaCargo) {
		this.fechaCargo = fechaCargo;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String getUsuarioRegistro() {
		return usuarioRegistro;
	}

	public void setUsuarioRegistro(String usuarioRegistro) {
		this.usuarioRegistro = usuarioRegistro;
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Integer getCodRepresentante() {
		return codRepresentante;
	}

	public void setCodRepresentante(Integer codRepresentante) {
		this.codRepresentante = codRepresentante;
	}


	public String getNomCargo() {
		return nomCargo;
	}

	public void setNomCargo(String nomCargo) {
		this.nomCargo = nomCargo;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (codRepresentante != null ? codRepresentante.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof Representante)) {
			return false;
		}
		Representante other = (Representante) object;
		if ((this.codRepresentante == null && other.codRepresentante != null) || (this.codRepresentante != null && !this.codRepresentante.equals(other.codRepresentante))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "pe.com.siacoopapp.entity.Tm003Representantes[ codRepresentante=" + codRepresentante + " ]";
	}
}
