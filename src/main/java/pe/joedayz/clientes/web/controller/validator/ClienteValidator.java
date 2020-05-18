package pe.joedayz.clientes.web.controller.validator;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;


import pe.joedayz.clientes.entity.Direccion;
import pe.joedayz.clientes.entity.Representante;
import pe.joedayz.clientes.entity.Cliente;
import pe.joedayz.clientes.web.controller.enums.EnumTipoDireccion;
import pe.joedayz.clientes.web.controller.enums.EnumTipoPersona;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import static java.util.stream.Collectors.toList;


public class ClienteValidator implements Validator {
	@Override
	public boolean supports(Class<?> aClass) {
		return Cliente.class.isAssignableFrom(aClass);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Cliente customValidationEntity = (Cliente) target;

		if(customValidationEntity.getTipoPersona().equals(EnumTipoPersona.NATURAL.getValue())){


			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "apePaterno", "apePaterno.required");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "apeMaterno", "apeMaterno.required");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nombres", "nombres.required");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "fechaNacimiento", "fechaNacimiento.required");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "cargaFamiliar", "cargaFamiliar.required");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "fechaApertura", "fechaApertura.required");

			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "docConyuge", "docConyuge.required");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "apePatConyuge", "apePatConyuge.required");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "apeMatConyuge", "apeMatConyuge.required");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nomConyuge", "nomConyuge.required");

			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "rucLaboral", "rucLaboral.required");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "centroLaboral", "centroLaboral.required");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "fechaIngreso", "fechaIngreso.required");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "telefonoLaboral", "telefonoLaboral.required");




			if(customValidationEntity.getDireccionList().size()==0){
				errors.rejectValue("direccionList", "direccionNatural.mustExists");
			}else{
				List<Direccion> direccionList =  customValidationEntity.getDireccionList().stream().
						filter(d -> d.getTipoDireccion().equals(EnumTipoDireccion.DOMICILIARIA.getValue())).collect(toList());
				if(direccionList==null || direccionList.size()==0){
					errors.rejectValue("direccionNueva.tipoDireccion", "direccionDomiciliaria.required");
				}
			}

		}else{
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "razonSocial", "razonSocial.required");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "fechaConstitucion", "fechaConstitucion.required");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "rrpp", "rrpp.required");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "tamanoEmpresa", "tamanoEmpresa.required");

			if(customValidationEntity.getDireccionList().size()==0){
				errors.rejectValue("direccionList", "direccionJuridica.mustExists");
			}else{
				List<Direccion> direccionList =  customValidationEntity.getDireccionList().stream().
						filter(d -> d.getTipoDireccion().equals(EnumTipoDireccion.LEGAL.getValue())).collect(toList());
				if(direccionList==null || direccionList.size()==0){
					errors.rejectValue("direccionNueva.tipoDireccion", "direccionLegal.required");
				}
			}

			if(customValidationEntity.getRepresentanteList().size()==0){
				errors.rejectValue("representanteList", "representantes.mustExists");
			}

			//si fecha de cargo de algun representante es >= fecha actual error
			LocalDate fechaActual = LocalDate.now();
			LocalDate fechaRepresentante;
			boolean errorFechaCargo = false;
			for (Representante representante : customValidationEntity.getRepresentanteList()){
				fechaRepresentante = convertToLocalDateViaInstant(representante.getFechaCargo());
				errorFechaCargo = fechaRepresentante.isAfter(fechaActual);
			}

			if(errorFechaCargo){
				errors.rejectValue("representanteNuevo.fechaCargo", "Past.representante.fechaCargo");
			}


		}

	}

	public LocalDate convertToLocalDateViaInstant(Date dateToConvert) {
		return dateToConvert.toInstant()
				.atZone(ZoneId.systemDefault())
				.toLocalDate();
	}

}
