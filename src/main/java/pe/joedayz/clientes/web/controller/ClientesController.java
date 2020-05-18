package pe.joedayz.clientes.web.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;


import pe.joedayz.clientes.dto.MenuItem;
import pe.joedayz.clientes.entity.Calificacion;
import pe.joedayz.clientes.entity.Calle;
import pe.joedayz.clientes.entity.Cargo;
import pe.joedayz.clientes.entity.Ciiu;
import pe.joedayz.clientes.entity.Direccion;
import pe.joedayz.clientes.entity.Estado;
import pe.joedayz.clientes.entity.EstadoCivil;
import pe.joedayz.clientes.entity.FuenteIngreso;
import pe.joedayz.clientes.entity.Nacionalidad;
import pe.joedayz.clientes.entity.NivelEducacion;
import pe.joedayz.clientes.entity.Profesion;
import pe.joedayz.clientes.entity.Representante;
import pe.joedayz.clientes.entity.Sexo;
import pe.joedayz.clientes.entity.Cliente;
import pe.joedayz.clientes.entity.TamanoEmpresa;
import pe.joedayz.clientes.entity.TipoDireccion;
import pe.joedayz.clientes.entity.TipoDocumento;
import pe.joedayz.clientes.entity.TipoEmpresa;
import pe.joedayz.clientes.entity.TipoPersona;
import pe.joedayz.clientes.entity.TipoVivienda;
import pe.joedayz.clientes.entity.Ubigeo;
import pe.joedayz.clientes.entity.Urbanizacion;
import pe.joedayz.clientes.entity.Usuario;
import pe.joedayz.clientes.repository.CalificacionRepository;
import pe.joedayz.clientes.repository.CalleRepository;
import pe.joedayz.clientes.repository.CargoRepository;
import pe.joedayz.clientes.repository.CiiuRepository;
import pe.joedayz.clientes.repository.EstadoCivilRepository;
import pe.joedayz.clientes.repository.EstadoRepository;
import pe.joedayz.clientes.repository.FuenteIngresoRepository;
import pe.joedayz.clientes.repository.MenuRepository;
import pe.joedayz.clientes.repository.NacionalidadRepository;
import pe.joedayz.clientes.repository.NivelEducacionRepository;
import pe.joedayz.clientes.repository.ProfesionRepository;
import pe.joedayz.clientes.repository.SexoRepository;
import pe.joedayz.clientes.repository.ClienteRepository;
import pe.joedayz.clientes.repository.TamanoEmpresaRepository;
import pe.joedayz.clientes.repository.TipoDireccionRepository;
import pe.joedayz.clientes.repository.TipoDocumentoRepository;
import pe.joedayz.clientes.repository.TipoEmpresaRepository;
import pe.joedayz.clientes.repository.TipoPersonaRepository;
import pe.joedayz.clientes.repository.TipoViviendaRepository;
import pe.joedayz.clientes.repository.UbigeoRepository;
import pe.joedayz.clientes.repository.UrbanizacionRepository;
import pe.joedayz.clientes.util.Util;
import pe.joedayz.clientes.web.controller.validator.ClienteValidator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.core.context.SecurityContextHolder;
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

/**
 * @author : JoeDayz
 * @since : 18/03/20
 */

@Controller
public class ClientesController {

	private static final String AJAX_HEADER_NAME = "X-Requested-With";

	private static final String AJAX_HEADER_VALUE = "XMLHttpRequest";

	private ClienteRepository clienteRepository;

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

	private EstadoRepository estadoRepository;

	private TamanoEmpresaRepository tamanoEmpresaRepository;


	private MenuRepository menuRepository;


	private Util util;


	@Autowired
	public ClientesController(
			TamanoEmpresaRepository tamanoEmpresaRepository,
			EstadoRepository estadoRepository,
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
			ClienteRepository clienteRepository, MenuRepository menuRepository, Util util) {
		this.tamanoEmpresaRepository = tamanoEmpresaRepository;
		this.tipoPersonaRepository = tipoPersonaRepository;
		this.clienteRepository = clienteRepository;
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
		this.estadoRepository = estadoRepository;
		this.menuRepository = menuRepository;
		this.util = util;
	}


	@GetMapping("/clientes/list")
	public ModelMap getAll(@PageableDefault(size = 10) Pageable pageable, @RequestParam(name = "value", required = false) String value, Model model) {

		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		model.addAttribute("username", ((Usuario)principal).getCodUsuario());

		if (value != null) {
			model.addAttribute("key", value);

			return new ModelMap().addAttribute("clientes", clienteRepository.findByCodSocioContainingOrNomCompletoContainingOrRazonSocialContainingAllIgnoreCase(value,
					value, value, pageable));
		}
		else {
			return new ModelMap().addAttribute("clientes", clienteRepository.findAll(pageable));
		}
	}


	@GetMapping("/clientes/form")
	public ModelMap getById(@RequestParam(value = "id", required = false) Cliente cliente, Model model) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		model.addAttribute("username", ((Usuario)principal).getCodUsuario());

		if (cliente == null) {
			cliente = new Cliente();
		}
		return new ModelMap("cliente", cliente);
	}


	@Transactional
	@PostMapping("/clientes/form")
	public String saveSocio(@Valid Cliente cliente, BindingResult result, SessionStatus status) {

		new ClienteValidator().validate(cliente, result);

		if (result.hasErrors()) {
			return "clientes/form";
		}
		if (cliente.getActivo() == null) cliente.setActivo(1);
		establecerNomCompleto(cliente);
		asociarColeccionesConCliente(cliente);
		clienteRepository.save(cliente);
		status.setComplete();
		return "redirect:/clientes/list";
	}

	private void establecerNomCompleto(Cliente cliente) {
		StringBuilder sb = new StringBuilder();
		sb.append(cliente.getApePaterno()).append(" ").append(cliente.getApeMaterno()).append(" ").append(cliente.getNombres());
		cliente.setNomCompleto(sb.toString().toUpperCase());
	}

	private void asociarColeccionesConCliente(Cliente cliente) {
		cliente.getDireccionList().forEach(d -> d.setCliente(cliente));
		cliente.getRepresentanteList().forEach(r -> r.setCliente(cliente));
	}


	@GetMapping("/clientes/delete")
	public ModelMap deleteConfirm(@RequestParam(value = "id", required = true) Cliente cliente, Model model) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		model.addAttribute("username", ((Usuario)principal).getCodUsuario());
		return new ModelMap("cliente", cliente);
	}


	@PostMapping("/clientes/delete")
	public Object delete(@ModelAttribute Cliente cliente, SessionStatus status) {
		try {
			clienteRepository.delete(cliente);
		}
		catch (DataIntegrityViolationException exception) {
			status.setComplete();
			return new ModelAndView("error/errorHapus")
					.addObject("entityId", cliente.getCodSocio())
					.addObject("entityName", "Cliente")
					.addObject("errorCause", exception.getRootCause().getMessage())
					.addObject("backLink", "/clientes/list");
		}
		status.setComplete();
		return "redirect:/clientes/list";
	}


	// Ajax Methods

	@PostMapping(params = "addRepresentante", path = { "/clientes/form/ajax/representantes", "/clientes/form/ajax/representantes/{codSocio}" })
	public String addRepresentante(Cliente cliente, HttpServletRequest request) {

		addRepresentanteACliente(cliente);

		if (AJAX_HEADER_VALUE.equals(request.getHeader(AJAX_HEADER_NAME))) {

			return "clientes/form::#representantes";
		}
		else {
			return "clientes/form";
		}
	}

	private void addRepresentanteACliente(Cliente cliente) {

		cliente.getRepresentanteList().add(new Representante(
				cliente.getRepresentanteNuevo().getNroDocumento(),
				cliente.getRepresentanteNuevo().getTipoDocumento(),
				cliente.getRepresentanteNuevo().getApePaterno(),
				cliente.getRepresentanteNuevo().getApeMaterno(),
				cliente.getRepresentanteNuevo().getNombres(),
				cliente.getRepresentanteNuevo().getCargo(),
				cliente.getRepresentanteNuevo().getFechaCargo(),
				cliente.getRepresentanteNuevo().getNomCargo(),
				cliente
		));
	}


	@PostMapping(params = "addDireccion", path = { "/clientes/form/ajax/direcciones", "/clientes/form/ajax/direcciones/{codSocio}" })
	public String addDireccion(Cliente cliente,
			HttpServletRequest request, Model model) {

		addDireccionACliente(cliente);

		if (AJAX_HEADER_VALUE.equals(request.getHeader(AJAX_HEADER_NAME))) {

			return "clientes/form::#direcciones";
		}
		else {
			return "clientes/form";
		}
	}

	private boolean validateDireccion(Direccion direccionNueva, Model model) {
		boolean errores = false;
		if (direccionNueva.getDireccion().isEmpty()) {
			model.addAttribute("errorDireccion", true);
			errores = true;
		}
		else {
			model.addAttribute("errorDireccion", false);
		}
		if (direccionNueva.getNrodireccion().isEmpty()) {
			model.addAttribute("errorNroDireccion", true);
			errores = true;
		}
		else {
			model.addAttribute("errorNroDireccion", false);
		}
		if (direccionNueva.getInteriorDpto().isEmpty()) {
			model.addAttribute("errorInteriorDpto", true);
			errores = true;
		}
		else {
			model.addAttribute("errorInteriorDpto", false);
		}
		if (direccionNueva.getMzDireccion().isEmpty()) {
			model.addAttribute("errorMzDireccion", true);
			errores = true;
		}
		else {
			model.addAttribute("errorMzDireccion", false);
		}
		if (direccionNueva.getLoteDreccion().isEmpty()) {
			model.addAttribute("errorLoteDreccion", true);
			errores = true;
		}
		else {
			model.addAttribute("errorLoteDreccion", false);
		}
		if (direccionNueva.getLugar().isEmpty()) {
			model.addAttribute("errorLugar", true);
			errores = true;
		}
		else {
			model.addAttribute("errorLugar", false);
		}
		if (direccionNueva.getCodProvincia() == null || direccionNueva.getCodProvincia().equals("0")) {
			model.addAttribute("errorCodProvincia", true);
			errores = true;
		}
		else {
			model.addAttribute("errorCodProvincia", false);
		}
		if (direccionNueva.getCodDistrito() == null || direccionNueva.getCodDistrito().equals("0")) {
			model.addAttribute("errorCodDistrito", true);
			errores = true;
		}
		else {
			model.addAttribute("errorCodDistrito", false);
		}
		return errores;
	}


	private void addDireccionACliente(Cliente cliente) {
		cliente.getDireccionList().add(new Direccion(
				cliente.getDireccionNueva().getTipoDireccion(),
				cliente.getDireccionNueva().getNombreTipoDireccion(),
				cliente.getDireccionNueva().getTipoCalle(),
				cliente.getDireccionNueva().getDireccion(),
				cliente.getDireccionNueva().getNrodireccion(),
				cliente.getDireccionNueva().getInteriorDpto(),
				cliente.getDireccionNueva().getMzDireccion(),
				cliente.getDireccionNueva().getLoteDreccion(),
				cliente.getDireccionNueva().getTipoAgrupacion(),
				cliente.getDireccionNueva().getLugar(),
				cliente,
				cliente.getDireccionNueva().getDepartamento(),
				cliente.getDireccionNueva().getProvincia(),
				cliente.getDireccionNueva().getDistrito(),
				cliente.getDireccionNueva().getCodDpto(),
				cliente.getDireccionNueva().getCodProvincia(),
				cliente.getDireccionNueva().getCodDistrito()
		));
	}

	@PostMapping(params = "removeRepresentante", path = { "/clientes/form/ajax/representantes", "/clientes/form/ajax/"
			+ "s/{codSocio}" })
	public String removeRepresentante(Cliente cliente, @RequestParam("removeRepresentante") Integer index, HttpServletRequest request) {

		removeRepresentanteByIndex(cliente, index);

		if (AJAX_HEADER_VALUE.equals(request.getHeader(AJAX_HEADER_NAME))) {

			return "clientes/form::#representantes";
		}
		else {
			return "clientes/form";
		}
	}

	private void removeRepresentanteByIndex(Cliente cliente, Integer index) {
		List<Representante> filteredList =
				IntStream.range(0, cliente.getRepresentanteList().size())
						.filter(i -> i != index)
						.mapToObj(cliente.getRepresentanteList()::get)
						.collect(toList());
		cliente.setRepresentanteList(filteredList);
	}

	@PostMapping(params = "removeDireccion", path = { "/clientes/form/ajax/direcciones", "/clientes/form/ajax/direcciones/{codSocio}" })
	public String removeDireccion(Cliente cliente, @RequestParam("removeDireccion") Integer index, HttpServletRequest request) {

		removeDireccionByIndex(cliente, index);

		if (AJAX_HEADER_VALUE.equals(request.getHeader(AJAX_HEADER_NAME))) {

			return "clientes/form::#direcciones";
		}
		else {
			return "clientes/form";
		}
	}


	@PostMapping(params = "editRepresentante", path = { "/clientes/form/ajax/representantes", "/clientes/form/ajax/representantes/{codSocio}" })
	public String editRepresentante(Cliente cliente, @RequestParam("editRepresentante") Integer index, HttpServletRequest request) {

		modifyRepresentanteACliente(cliente, index);

		if (AJAX_HEADER_VALUE.equals(request.getHeader(AJAX_HEADER_NAME))) {

			return "clientes/form::#representantes";
		}
		else {
			return "clientes/form";
		}
	}

	private void modifyRepresentanteACliente(Cliente cliente, Integer index) {
		Representante representanteActual = cliente.getRepresentanteList().get(index);
		representanteActual.setTipoDocumento(cliente.getRepresentanteNuevo().getTipoDocumento());
		representanteActual.setNroDocumento(cliente.getRepresentanteNuevo().getNroDocumento());
		representanteActual.setApePaterno(cliente.getRepresentanteNuevo().getApePaterno());
		representanteActual.setApeMaterno(cliente.getRepresentanteNuevo().getApeMaterno());
		representanteActual.setNombres(cliente.getRepresentanteNuevo().getNombres());
		representanteActual.setCargo(cliente.getRepresentanteNuevo().getCargo());
		representanteActual.setFechaCargo(cliente.getRepresentanteNuevo().getFechaCargo());
		representanteActual.setNomCargo(cliente.getRepresentanteNuevo().getNomCargo());
	}

	@PostMapping(params = "editDireccion", path = { "/clientes/form/ajax/direcciones", "/clientes/form/ajax/direcciones/{codSocio}" })
	public String editDireccion(Cliente cliente, @RequestParam("editDireccion") Integer index, HttpServletRequest request) {

		modifyDireccionACliente(cliente, index);

		if (AJAX_HEADER_VALUE.equals(request.getHeader(AJAX_HEADER_NAME))) {

			return "/clientes/form::#direcciones";
		}
		else {
			return "/clientes/form";
		}
	}

	private void modifyDireccionACliente(Cliente cliente, Integer index) {

		Direccion direccionActual = cliente.getDireccionList().get(index);
		direccionActual.setTipoDireccion(cliente.getDireccionNueva().getTipoDireccion());
		direccionActual.setNombreTipoDireccion(cliente.getDireccionNueva().getNombreTipoDireccion());
		direccionActual.setTipoCalle(cliente.getDireccionNueva().getTipoCalle());
		direccionActual.setDireccion(cliente.getDireccionNueva().getDireccion());
		direccionActual.setNrodireccion(cliente.getDireccionNueva().getNrodireccion());
		direccionActual.setInteriorDpto(cliente.getDireccionNueva().getInteriorDpto());
		direccionActual.setMzDireccion(cliente.getDireccionNueva().getMzDireccion());
		direccionActual.setLoteDreccion(cliente.getDireccionNueva().getLoteDreccion());
		direccionActual.setTipoAgrupacion(cliente.getDireccionNueva().getTipoAgrupacion());
		direccionActual.setLugar(cliente.getDireccionNueva().getLugar());

		direccionActual.setDepartamento(cliente.getDireccionNueva().getDepartamento());
		direccionActual.setProvincia(cliente.getDireccionNueva().getProvincia());
		direccionActual.setDistrito(cliente.getDireccionNueva().getDistrito());
		direccionActual.setCodDpto(cliente.getDireccionNueva().getCodDpto());
		direccionActual.setCodProvincia(cliente.getDireccionNueva().getCodProvincia());
		direccionActual.setCodDistrito(cliente.getDireccionNueva().getCodDistrito());
	}

	private void removeDireccionByIndex(Cliente cliente, @RequestParam("removeDireccion") Integer index) {
		List<Direccion> filteredList =
				IntStream.range(0, cliente.getDireccionList().size())
						.filter(i -> i != index)
						.mapToObj(cliente.getDireccionList()::get)
						.collect(toList());
		cliente.setDireccionList(filteredList);
	}

	@GetMapping("/clientes/form/ajax/provincias")
	public String ajaxProvincias(@RequestParam("direccionNueva.codDpto") String codUbigeo, Model model) {
		String codDpto = codUbigeo.substring(0, 2);
		List<Ubigeo> provincias = new ArrayList<>();
		provincias.add(new Ubigeo("0", "--Seleccione--"));
		ubigeoRepository.findProvincias(codDpto).stream().forEach(e -> provincias.add(e));
		model.addAttribute("provincias", provincias);
		return "clientes/form::provincias";
	}

	@GetMapping("/clientes/form/ajax/distritos")
	public String ajaxDistritos(@RequestParam(name = "direccionNueva.codProvincia", required = false, defaultValue = "0") String codUbigeo, Model model) {
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
		return "clientes/form::distritos";
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

	@ModelAttribute("allActivo")
	public List<Estado> populateEstados() {
		return estadoRepository.findAll();
	}

	@ModelAttribute("allTamanoEmpresa")
	public List<TamanoEmpresa> populateTamanosEmpresa() {
		return tamanoEmpresaRepository.findAll();
	}


	@ModelAttribute("menuItemsList")
	public List<MenuItem> menues() {
		return util.agruparMenus(menuRepository.getMenues());
	}

}


