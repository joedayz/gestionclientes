package pe.joedayz.clientes.web.controller.enums;

public enum EnumTipoDireccion {

	DOMICILIARIA("D"),
	LEGAL("G"),
	LABORAL("L");


	private final String value;

	private EnumTipoDireccion(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
