package pe.joedayz.clientes.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Clientes")
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Cod_Socio")
	private Integer codSocio;
	@Column(name = "Tipo_Persona")
	private String tipoPersona;
	@Column(name = "Tipo_Documento")
	private String tipoDocumento;
	@NotEmpty
	@Column(name = "Nro_Documento")
	private String nroDocumento;
	@Column(name = "Ape_Paterno")
	private String apePaterno;
	@Column(name = "Ape_Materno")
	private String apeMaterno;
	@Column(name = "Nombres")
	private String nombres;
	@Column(name = "Nom_Completo")
	private String nomCompleto;

	@Past
	@Column(name = "Fecha_Nacimiento")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date fechaNacimiento;

	@Column(name = "Nacionalidad")
	private String nacionalidad;
	@Column(name = "Sexo")
	private String sexo;
	@Column(name = "Estado_Civil")
	private String estadoCivil;
	@Column(name = "Educacion")
	private String educacion;
	@Column(name = "Condicion_Laboral")
	private String condicionLaboral;
	@Column(name = "CIIU")
	private String ciiu;
	@Column(name = "Profesion")
	private String profesion;
	@Column(name = "Tip_Doc_Conyuge")
	private String tipDocConyuge;
	@Column(name = "Doc_Conyuge")
	private String docConyuge;
	@Column(name = "Ape_Pat_Conyuge")
	private String apePatConyuge;
	@Column(name = "Ape_Mat_Conyuge")
	private String apeMatConyuge;
	@Column(name = "Nom_Conyuge")
	private String nomConyuge;

	@NotEmpty
	@Column(name = "Telefono_Fijo")
	private String telefonoFijo;
	@NotEmpty
	@Column(name = "Telefono_Celular")
	private String telefonoCelular;


	@Email(message = "Correl Electronico es invalido")
	@NotEmpty
	@Column(name = "Correo_Electronico")
	private String correoElectronico;

	@Past
	@Column(name = "Fecha_Apertura")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date fechaApertura;

	@Column(name = "Carga_Familiar")
	private Integer cargaFamiliar;
	@Column(name = "Tipo_Vivienda")
	private String tipoVivienda;
	@Column(name = "Ruc_Laboral")
	private String rucLaboral;
	@Column(name = "Centro_Laboral")
	private String centroLaboral;
	@Column(name = "Cargo")
	private String cargo;

	@Past
	@Column(name = "Fecha_Ingreso")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date fechaIngreso;

	@Column(name = "Telefono_Laboral")
	private String telefonoLaboral;
	@Column(name = "Razon_Social")
	private String razonSocial;

	@Past
	@Column(name = "Fecha_Constitucion")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date fechaConstitucion;

	@Column(name = "Tipo_Empresa")
	private String tipoEmpresa;
	@Column(name = "RRPP")
	private String rrpp;
	@Column(name = "Tamano_Empresa")
	private Integer tamanoEmpresa;
	@Column(name = "Cal_Interna")
	private String calInterna;
	@Column(name = "Cal_Externa")
	private String calExterna;

	@Column(name = "Activo")
	private Integer activo;

	@Column(name = "Usuario_Registro")
	private String usuarioRegistro;

	@Column(name = "Fecha_Registro")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date fechaRegistro;

	@Column(name = "Hora_Registro")
	@Temporal(TemporalType.TIME)
	private Date horaRegistro;
	@Column(name = "Usuario_Modifica")
	private String usuarioModifica;
	@Column(name = "Fecha_Modifica")

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date fechaModifica;

	@Column(name = "Hora_Modifica")
	@Temporal(TemporalType.TIME)
	private Date horaModifica;

	@Column(name = "Nom_Tipo_Persona")
	private String nomTipoPersona;
	@Column(name = "Nom_Tipo_Documento")
	private String nomTipoDocumento;

	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Direccion> direccionList = new ArrayList<>();

	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Representante> representanteList = new ArrayList<>();

	public Cliente() {
	}

	public Cliente(Integer codSocio) {
		this.codSocio = codSocio;
	}


	public String getNomTipoPersona() {
		return nomTipoPersona;
	}

	public void setNomTipoPersona(String nomTipoPersona) {
		this.nomTipoPersona = nomTipoPersona;
	}

	public String getNomTipoDocumento() {
		return nomTipoDocumento;
	}

	public void setNomTipoDocumento(String nomTipoDocumento) {
		this.nomTipoDocumento = nomTipoDocumento;
	}

	public Integer getCodSocio() {
		return codSocio;
	}

	public void setCodSocio(Integer codSocio) {
		this.codSocio = codSocio;
	}


	public String getTipoPersona() {
		return tipoPersona;
	}

	public void setTipoPersona(String tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}


	public String getNroDocumento() {
		return nroDocumento;
	}

	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
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

	public String getNomCompleto() {
		return nomCompleto;
	}

	public void setNomCompleto(String nomCompleto) {
		this.nomCompleto = nomCompleto;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getEducacion() {
		return educacion;
	}

	public void setEducacion(String educacion) {
		this.educacion = educacion;
	}

	public String getCondicionLaboral() {
		return condicionLaboral;
	}

	public void setCondicionLaboral(String condicionLaboral) {
		this.condicionLaboral = condicionLaboral;
	}

	public String getCiiu() {
		return ciiu;
	}

	public void setCiiu(String ciiu) {
		this.ciiu = ciiu;
	}


	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public String getTipDocConyuge() {
		return tipDocConyuge;
	}

	public void setTipDocConyuge(String tipDocConyuge) {
		this.tipDocConyuge = tipDocConyuge;
	}


	public String getDocConyuge() {
		return docConyuge;
	}

	public void setDocConyuge(String docConyuge) {
		this.docConyuge = docConyuge;
	}

	public String getApePatConyuge() {
		return apePatConyuge;
	}

	public void setApePatConyuge(String apePatConyuge) {
		this.apePatConyuge = apePatConyuge;
	}

	public String getApeMatConyuge() {
		return apeMatConyuge;
	}

	public void setApeMatConyuge(String apeMatConyuge) {
		this.apeMatConyuge = apeMatConyuge;
	}

	public String getNomConyuge() {
		return nomConyuge;
	}

	public void setNomConyuge(String nomConyuge) {
		this.nomConyuge = nomConyuge;
	}

	public String getTelefonoFijo() {
		return telefonoFijo;
	}

	public void setTelefonoFijo(String telefonoFijo) {
		this.telefonoFijo = telefonoFijo;
	}


	public String getTelefonoCelular() {
		return telefonoCelular;
	}

	public void setTelefonoCelular(String telefonoCelular) {
		this.telefonoCelular = telefonoCelular;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public Date getFechaApertura() {
		return fechaApertura;
	}

	public void setFechaApertura(Date fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	public Integer getCargaFamiliar() {
		return cargaFamiliar;
	}

	public void setCargaFamiliar(Integer cargaFamiliar) {
		this.cargaFamiliar = cargaFamiliar;
	}

	public String getTipoVivienda() {
		return tipoVivienda;
	}

	public void setTipoVivienda(String tipoVivienda) {
		this.tipoVivienda = tipoVivienda;
	}

	public String getRucLaboral() {
		return rucLaboral;
	}

	public void setRucLaboral(String rucLaboral) {
		this.rucLaboral = rucLaboral;
	}

	public String getCentroLaboral() {
		return centroLaboral;
	}

	public void setCentroLaboral(String centroLaboral) {
		this.centroLaboral = centroLaboral;
	}


	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}


	public String getTelefonoLaboral() {
		return telefonoLaboral;
	}

	public void setTelefonoLaboral(String telefonoLaboral) {
		this.telefonoLaboral = telefonoLaboral;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public Date getFechaConstitucion() {
		return fechaConstitucion;
	}

	public void setFechaConstitucion(Date fechaConstitucion) {
		this.fechaConstitucion = fechaConstitucion;
	}

	public String getTipoEmpresa() {
		return tipoEmpresa;
	}

	public void setTipoEmpresa(String tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
	}

	public String getRrpp() {
		return rrpp;
	}

	public void setRrpp(String rrpp) {
		this.rrpp = rrpp;
	}

	public Integer getTamanoEmpresa() {
		return tamanoEmpresa;
	}

	public void setTamanoEmpresa(Integer tamanoEmpresa) {
		this.tamanoEmpresa = tamanoEmpresa;
	}

	public String getCalInterna() {
		return calInterna;
	}

	public void setCalInterna(String calInterna) {
		this.calInterna = calInterna;
	}

	public String getCalExterna() {
		return calExterna;
	}

	public void setCalExterna(String calExterna) {
		this.calExterna = calExterna;
	}

	public Integer getActivo() {
		return activo;
	}

	public void setActivo(Integer activo) {
		this.activo = activo;
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


	public List<Direccion> getDireccionList() {
		return direccionList;
	}

	public void setDireccionList(List<Direccion> direccionList) {
		this.direccionList = direccionList;
	}

	public List<Representante> getRepresentanteList() {
		return representanteList;
	}

	public void setRepresentanteList(List<Representante> representanteList) {
		this.representanteList = representanteList;
	}


	@Transient
	private Direccion direccionNueva = new Direccion();


	public Direccion getDireccionNueva() {
		return direccionNueva;
	}

	public void setDireccionNueva(Direccion direccionNueva) {
		this.direccionNueva = direccionNueva;
	}

	@Transient
	private Representante representanteNuevo = new Representante();


	public Representante getRepresentanteNuevo() {
		return representanteNuevo;
	}

	public void setRepresentanteNuevo(Representante representanteNuevo) {
		this.representanteNuevo = representanteNuevo;
	}



	@Override
	public int hashCode() {
		int hash = 0;
		hash += (codSocio != null ? codSocio.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof Cliente)) {
			return false;
		}
		Cliente other = (Cliente) object;
		if ((this.codSocio == null && other.codSocio != null) || (this.codSocio != null && !this.codSocio.equals(other.codSocio))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "pe.com.siacoopapp.entity.Cliente[ codSocio=" + codSocio + " ]";
	}

}
