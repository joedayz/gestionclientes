package pe.joedayz.clientes.web.controller.enums;

public enum EnumTipoPersona {

	NATURAL("2"),
	JURIDICA("1");


	private final String value;

	private EnumTipoPersona(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
