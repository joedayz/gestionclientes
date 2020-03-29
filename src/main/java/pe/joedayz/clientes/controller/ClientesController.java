package pe.joedayz.clientes.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import pe.joedayz.clientes.entity.Calificacion;
import pe.joedayz.clientes.entity.Calle;
import pe.joedayz.clientes.entity.Cargo;
import pe.joedayz.clientes.entity.Ciiu;
import pe.joedayz.clientes.entity.Direccion;
import pe.joedayz.clientes.entity.EstadoCivil;
import pe.joedayz.clientes.entity.FuenteIngreso;
import pe.joedayz.clientes.entity.Nacionalidad;
import pe.joedayz.clientes.entity.NivelEducacion;
import pe.joedayz.clientes.entity.Profesion;
import pe.joedayz.clientes.entity.Representante;
import pe.joedayz.clientes.entity.Sexo;
import pe.joedayz.clientes.entity.Socio;
import pe.joedayz.clientes.entity.TipoDireccion;
import pe.joedayz.clientes.entity.TipoDocumento;
import pe.joedayz.clientes.entity.TipoEmpresa;
import pe.joedayz.clientes.entity.TipoPersona;
import pe.joedayz.clientes.entity.TipoVivienda;
import pe.joedayz.clientes.entity.Ubigeo;
import pe.joedayz.clientes.entity.Urbanizacion;
import pe.joedayz.clientes.repository.CalificacionRepository;
import pe.joedayz.clientes.repository.CalleRepository;
import pe.joedayz.clientes.repository.CargoRepository;
import pe.joedayz.clientes.repository.CiiuRepository;
import pe.joedayz.clientes.repository.EstadoCivilRepository;
import pe.joedayz.clientes.repository.FuenteIngresoRepository;
import pe.joedayz.clientes.repository.NacionalidadRepository;
import pe.joedayz.clientes.repository.NivelEducacionRepository;
import pe.joedayz.clientes.repository.ProfesionRepository;
import pe.joedayz.clientes.repository.SexoRepository;
import pe.joedayz.clientes.repository.SocioRepository;
import pe.joedayz.clientes.repository.TipoDireccionRepository;
import pe.joedayz.clientes.repository.TipoDocumentoRepository;
import pe.joedayz.clientes.repository.TipoEmpresaRepository;
import pe.joedayz.clientes.repository.TipoPersonaRepository;
import pe.joedayz.clientes.repository.TipoViviendaRepository;
import pe.joedayz.clientes.repository.UbigeoRepository;
import pe.joedayz.clientes.repository.UrbanizacionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import static java.util.stream.Collectors.toList;
import static org.codehaus.groovy.runtime.DefaultGroovyMethods.collect;

/**
 * @author : JoeDayz
 * @since : 18/03/20
 */
@Controller
public class ClientesController {

	private static final String AJAX_HEADER_NAME = "X-Requested-With";

	private static final String AJAX_HEADER_VALUE = "XMLHttpRequest";

	private SocioRepository socioRepository;

	private TipoPersonaRepository tipoPersonaRepository;

	private TipoDocumentoRepository tipoDocumentoRepository;

	private FuenteIngresoRepository fuenteIngresoRepository;

	private CiiuRepository ciiuRepository;

	private ProfesionRepository profesionRepository;

	private NacionalidadRepository nacionalidadRepository;

	private TipoViviendaRepository tipoViviendaRepository;

	private SexoRepository sexoRepository;

	private CalificacionRepository calificacionRepository;

	private EstadoCivilRepository estadoCivilRepository;

	private NivelEducacionRepository nivelEducacionRepository;

	private TipoEmpresaRepository tipoEmpresaRepository;

	private TipoDireccionRepository tipoDireccionRepository;

	private CalleRepository calleRepository;

	private UrbanizacionRepository urbanizacionRepository;

	private UbigeoRepository ubigeoRepository;

	private CargoRepository cargoRepository;

	@Autowired
	public ClientesController(
			CargoRepository cargoRepository,
			UbigeoRepository ubigeoRepository,
			UrbanizacionRepository urbanizacionRepository,
			CalleRepository calleRepository,
			TipoDireccionRepository tipoDireccionRepository,
			TipoEmpresaRepository tipoEmpresaRepository,
			NivelEducacionRepository nivelEducacionRepository,
			EstadoCivilRepository estadoCivilRepository,
			CalificacionRepository calificacionRepository,
			SexoRepository sexoRepository,
			TipoViviendaRepository tipoViviendaRepository,
			NacionalidadRepository nacionalidadRepository,
			ProfesionRepository profesionRepository,
			CiiuRepository ciiuRepository,
			FuenteIngresoRepository fuenteIngresoRepository,
			TipoDocumentoRepository tipoDocumentoRepository,
			TipoPersonaRepository tipoPersonaRepository,
			SocioRepository socioRepository) {
		this.tipoPersonaRepository = tipoPersonaRepository;
		this.socioRepository = socioRepository;
		this.tipoDocumentoRepository = tipoDocumentoRepository;
		this.fuenteIngresoRepository = fuenteIngresoRepository;
		this.ciiuRepository = ciiuRepository;
		this.profesionRepository = profesionRepository;
		this.nacionalidadRepository = nacionalidadRepository;
		this.tipoViviendaRepository = tipoViviendaRepository;
		this.sexoRepository = sexoRepository;
		this.calificacionRepository = calificacionRepository;
		this.estadoCivilRepository = estadoCivilRepository;
		this.nivelEducacionRepository = nivelEducacionRepository;
		this.tipoEmpresaRepository = tipoEmpresaRepository;
		this.tipoDireccionRepository = tipoDireccionRepository;
		this.calleRepository = calleRepository;
		this.urbanizacionRepository = urbanizacionRepository;
		this.ubigeoRepository = ubigeoRepository;
		this.cargoRepository = cargoRepository;
	}


	@GetMapping("/clientes/list")
	public ModelMap getAll(@PageableDefault(size = 5) Pageable pageable, @RequestParam(name = "value", required = false) String value, Model model) {
		if (value != null) {
			model.addAttribute("key", value);
			return new ModelMap().addAttribute("clientes", socioRepository.findByCodSocioOrApePaternoOrApeMaternoOrNomCompletoAllIgnoreCase(value,
					value, value, value, pageable));
		}
		else {
			return new ModelMap().addAttribute("clientes", socioRepository.findAll(pageable));
		}
	}


	@GetMapping("/clientes/form")
	public ModelMap getById(@RequestParam(value = "id", required = false) Socio socio) {
		if (socio == null) {
			socio = new Socio();
		}
		return new ModelMap("socio", socio);
	}


	@Transactional
	@PostMapping("/clientes/form")
	public String saveSocio(@Valid @ModelAttribute("socio") Socio socio, BindingResult errors, SessionStatus status) {
		if (errors.hasErrors()) {
			return "clientes/form";
		}
		establecerNomCompleto(socio);
		asociarColeccionesConSocio(socio);
		socioRepository.save(socio);
		status.setComplete();
		return "redirect:/clientes/list";
	}

	private void establecerNomCompleto(Socio socio) {
		StringBuilder sb = new StringBuilder();
		sb.append(socio.getApePaterno()).append(" ").append(socio.getApeMaterno()).append(" ").append(socio.getNombres());
		socio.setNomCompleto(sb.toString().toUpperCase());
	}

	private void asociarColeccionesConSocio(Socio socio) {
		socio.getDireccionList().forEach(d -> d.setSocio(socio));
		socio.getRepresentanteList().forEach(r -> r.setSocio(socio));
	}


	@GetMapping("/clientes/delete")
	public ModelMap deleteConfirm(@RequestParam(value = "id", required = true) Socio socio) {
		return new ModelMap("socio", socio);
	}


	@PostMapping("/clientes/delete")
	public Object delete(@ModelAttribute Socio socio, SessionStatus status) {
		try {
			socioRepository.delete(socio);
		}
		catch (DataIntegrityViolationException exception) {
			status.setComplete();
			return new ModelAndView("error/errorHapus")
					.addObject("entityId", socio.getCodSocio())
					.addObject("entityName", "Socio")
					.addObject("errorCause", exception.getRootCause().getMessage())
					.addObject("backLink", "/clientes/list");
		}
		status.setComplete();
		return "redirect:/clientes/list";
	}


	// Ajax Methods

	@PostMapping(params = "addRepresentante", path = { "/clientes/form/ajax/representantes", "/clientes/form/ajax/representantes/{codSocio}" })
	public String addRepresentante(Socio socio, HttpServletRequest request) {

		addRepresentanteASocio(socio);

		if (AJAX_HEADER_VALUE.equals(request.getHeader(AJAX_HEADER_NAME))) {

			return "/clientes/form::#representantes";
		}
		else {
			return "/clientes/form";
		}
	}

	private void addRepresentanteASocio(Socio socio) {

		socio.getRepresentanteList().add(new Representante(
				socio.getRepresentanteNuevo().getNroDocumento(),
				socio.getRepresentanteNuevo().getTipoDocumento(),
				socio.getRepresentanteNuevo().getApePaterno(),
				socio.getRepresentanteNuevo().getApeMaterno(),
				socio.getRepresentanteNuevo().getNombres(),
				socio.getRepresentanteNuevo().getCargo(),
				socio.getRepresentanteNuevo().getFechaCargo(),
				socio.getRepresentanteNuevo().getNomCargo(),
				socio
		));
	}


	@PostMapping(params = "addDireccion", path = { "/clientes/form/ajax/direcciones", "/clientes/form/ajax/direcciones/{codSocio}" })
	public String addDireccion(Socio socio, HttpServletRequest request) {

		addDireccionASocio(socio);

		if (AJAX_HEADER_VALUE.equals(request.getHeader(AJAX_HEADER_NAME))) {

			return "/clientes/form::#direcciones";
		}
		else {
			return "/clientes/form";
		}
	}

	private void addDireccionASocio(Socio socio) {
		socio.getDireccionList().add(new Direccion(
				socio.getDireccionNueva().getTipoDireccion(),
				socio.getDireccionNueva().getNombreTipoDireccion(),
				socio.getDireccionNueva().getTipoCalle(),
				socio.getDireccionNueva().getDireccion(),
				socio.getDireccionNueva().getNrodireccion(),
				socio.getDireccionNueva().getInteriorDpto(),
				socio.getDireccionNueva().getMzDireccion(),
				socio.getDireccionNueva().getLoteDreccion(),
				socio.getDireccionNueva().getTipoAgrupacion(),
				socio.getDireccionNueva().getLugar(),
				socio,
				socio.getDireccionNueva().getDepartamento(),
				socio.getDireccionNueva().getProvincia(),
				socio.getDireccionNueva().getDistrito(),
				socio.getDireccionNueva().getCodDpto(),
				socio.getDireccionNueva().getCodProvincia(),
				socio.getDireccionNueva().getCodDistrito()
		));
	}

	@PostMapping(params = "removeRepresentante", path = { "/clientes/form/ajax/representantes", "/clientes/form/ajax/representantes/{codSocio}" })
	public String removeRepresentante(Socio socio, @RequestParam("removeRepresentante") Integer index, HttpServletRequest request) {

		removeRepresentanteByIndex(socio, index);

		if (AJAX_HEADER_VALUE.equals(request.getHeader(AJAX_HEADER_NAME))) {

			return "/clientes/form::#representantes";
		}
		else {
			return "/clientes/form";
		}
	}

	private void removeRepresentanteByIndex(Socio socio, Integer index) {
		List<Representante> filteredList =
				IntStream.range(0, socio.getRepresentanteList().size())
						.filter(i -> i != index)
						.mapToObj(socio.getRepresentanteList()::get)
						.collect(toList());
		socio.setRepresentanteList(filteredList);
	}

	@PostMapping(params = "removeDireccion", path = { "/clientes/form/ajax/direcciones", "/clientes/form/ajax/direcciones/{codSocio}" })
	public String removeDireccion(Socio socio, @RequestParam("removeDireccion") Integer index, HttpServletRequest request) {

		removeDireccionByIndex(socio, index);

		if (AJAX_HEADER_VALUE.equals(request.getHeader(AJAX_HEADER_NAME))) {

			return "/clientes/form::#direcciones";
		}
		else {
			return "/clientes/form";
		}
	}


	@PostMapping(params = "editRepresentante", path = { "/clientes/form/ajax/representantes", "/clientes/form/ajax/representantes/{codSocio}" })
	public String editRepresentante(Socio socio, @RequestParam("editRepresentante") Integer index, HttpServletRequest request) {

		modifyRepresentanteASocio(socio, index);

		if (AJAX_HEADER_VALUE.equals(request.getHeader(AJAX_HEADER_NAME))) {

			return "/clientes/form::#representantes";
		}
		else {
			return "/clientes/form";
		}
	}

	private void modifyRepresentanteASocio(Socio socio, Integer index) {
		Representante representanteActual = socio.getRepresentanteList().get(index);
		representanteActual.setTipoDocumento(socio.getRepresentanteNuevo().getTipoDocumento());
		representanteActual.setNroDocumento(socio.getRepresentanteNuevo().getNroDocumento());
		representanteActual.setApePaterno(socio.getRepresentanteNuevo().getApePaterno());
		representanteActual.setApeMaterno(socio.getRepresentanteNuevo().getApeMaterno());
		representanteActual.setNombres(socio.getRepresentanteNuevo().getNombres());
		representanteActual.setCargo(socio.getRepresentanteNuevo().getCargo());
		representanteActual.setFechaCargo(socio.getRepresentanteNuevo().getFechaCargo());
		representanteActual.setNomCargo(socio.getRepresentanteNuevo().getNomCargo());
	}

	@PostMapping(params = "editDireccion", path = { "/clientes/form/ajax/direcciones", "/clientes/form/ajax/direcciones/{codSocio}" })
	public String editDireccion(Socio socio, @RequestParam("editDireccion") Integer index, HttpServletRequest request) {

		modifyDireccionASocio(socio, index);

		if (AJAX_HEADER_VALUE.equals(request.getHeader(AJAX_HEADER_NAME))) {

			return "/clientes/form::#direcciones";
		}
		else {
			return "/clientes/form";
		}
	}

	private void modifyDireccionASocio(Socio socio, Integer index) {

		Direccion direccionActual = socio.getDireccionList().get(index);
		direccionActual.setTipoDireccion(socio.getDireccionNueva().getTipoDireccion());
		direccionActual.setNombreTipoDireccion(socio.getDireccionNueva().getNombreTipoDireccion());
		direccionActual.setTipoCalle(socio.getDireccionNueva().getTipoCalle());
		direccionActual.setDireccion(socio.getDireccionNueva().getDireccion());
		direccionActual.setNrodireccion(socio.getDireccionNueva().getNrodireccion());
		direccionActual.setInteriorDpto(socio.getDireccionNueva().getInteriorDpto());
		direccionActual.setMzDireccion(socio.getDireccionNueva().getMzDireccion());
		direccionActual.setLoteDreccion(socio.getDireccionNueva().getLoteDreccion());
		direccionActual.setTipoAgrupacion(socio.getDireccionNueva().getTipoAgrupacion());
		direccionActual.setLugar(socio.getDireccionNueva().getLugar());

		direccionActual.setDepartamento(socio.getDireccionNueva().getDepartamento());
		direccionActual.setProvincia(socio.getDireccionNueva().getProvincia());
		direccionActual.setDistrito(socio.getDireccionNueva().getDistrito());
		direccionActual.setCodDpto(socio.getDireccionNueva().getCodDpto());
		direccionActual.setCodProvincia(socio.getDireccionNueva().getCodProvincia());
		direccionActual.setCodDistrito(socio.getDireccionNueva().getCodDistrito());
	}

	private void removeDireccionByIndex(Socio socio, @RequestParam("removeDireccion") Integer index) {
		List<Direccion> filteredList =
				IntStream.range(0, socio.getDireccionList().size())
						.filter(i -> i != index)
						.mapToObj(socio.getDireccionList()::get)
						.collect(toList());
		socio.setDireccionList(filteredList);
	}

	@GetMapping("/clientes/form/ajax/provincias")
	public String ajaxProvincias(@RequestParam("direccionNueva.codDpto") String codUbigeo, Model model) {
		String codDpto = codUbigeo.substring(0, 2);
		List<Ubigeo> provincias = new ArrayList<>();
		provincias.add(new Ubigeo("0", "--Seleccione--"));
		ubigeoRepository.findProvincias(codDpto).stream().forEach(e -> provincias.add(e));
		model.addAttribute("provincias", provincias);
		return "/clientes/form::provincias";
	}

	@GetMapping("/clientes/form/ajax/distritos")
	public String ajaxDistritos(@RequestParam("direccionNueva.codProvincia") String codUbigeo, Model model) {
		if (!codUbigeo.equals("0")) {
			String codDpto = codUbigeo.substring(0, 2);
			String codProvincia = codUbigeo.substring(2, 4);
			List<Ubigeo> distritos = new ArrayList<>();
			distritos.add(new Ubigeo("0", "--Seleccione--"));
			ubigeoRepository.findDistritos(codDpto, codProvincia).stream().forEach(e -> distritos.add(e));
			model.addAttribute("distritos", distritos);
		}
		else {
			List<Ubigeo> distritos = new ArrayList<>();
			distritos.add(new Ubigeo("0", "--Seleccione--"));
			model.addAttribute("distritos", distritos);
		}
		return "/clientes/form::distritos";
	}

	@ModelAttribute("allTiposPersona")
	public List<TipoPersona> populateTiposPersona() {
		return tipoPersonaRepository.findAll();
	}

	@ModelAttribute("allTiposDocumento")
	public List<TipoDocumento> populateTiposDocumento() {
		return tipoDocumentoRepository.findAll();
	}

	@ModelAttribute("allCondicionLaboral")
	public List<FuenteIngreso> populateCondicionLaboral() {
		return fuenteIngresoRepository.findAll();
	}

	@ModelAttribute("allActividadEconomica")
	public List<Ciiu> populateActividadEconomica() {
		return ciiuRepository.findAll();
	}

	@ModelAttribute("allProfesiones")
	public List<Profesion> populateProfesiones() {
		return profesionRepository.findAll();
	}

	@ModelAttribute("allNacionalidades")
	public List<Nacionalidad> populateNacionalidades() {
		return nacionalidadRepository.findAll();
	}

	@ModelAttribute("allTipoViviendas")
	public List<TipoVivienda> populateTipoViviendas() {
		return tipoViviendaRepository.findAll();
	}

	@ModelAttribute("allSexos")
	public List<Sexo> populateSexos() {
		return sexoRepository.findAll();
	}

	@ModelAttribute("allCalificaciones")
	public List<Calificacion> populateCalificaciones() {
		return calificacionRepository.findAll();
	}

	@ModelAttribute("allEstadosCiviles")
	public List<EstadoCivil> populateEstadosCiviles() {
		return estadoCivilRepository.findAll();
	}

	@ModelAttribute("allNivelesEducacion")
	public List<NivelEducacion> populateNivelesEducacion() {
		return nivelEducacionRepository.findAll();
	}

	@ModelAttribute("allTiposEmpresas")
	public List<TipoEmpresa> populateTiposEmpresas() {
		return tipoEmpresaRepository.findAll();
	}

	@ModelAttribute("allTipoDeDireccion")
	public List<TipoDireccion> populateTiposDeDireccion() {
		return tipoDireccionRepository.findAll();
	}

	@ModelAttribute("allTipoDeCalle")
	public List<Calle> populateCalles() {
		return calleRepository.findAll();
	}

	@ModelAttribute("allTipoDeAgrupacion")
	public List<Urbanizacion> populateTipoDeAgrupacion() {
		return urbanizacionRepository.findAll();
	}

	@ModelAttribute("allDepartamentos")
	public List<Ubigeo> populateDepartamentos() {
		return ubigeoRepository.findDepartamentos();
	}


	@ModelAttribute("allCargos")
	public List<Cargo> populateCargos() {
		return cargoRepository.findAll();
	}
}


