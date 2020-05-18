package pe.joedayz.clientes.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Filter_Metadata")
public class SecurityFilterMetadata implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Id")
	private Integer id;

	@Column(name="Ant_Pattern")
	private String antPattern;

	@Column(name="Expression")
	private String expression;

	@Column(name="Sort_Order")
	private Integer sortOrder;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getAntPattern() {
		return antPattern;
	}
	public void setAntPattern(String antPattern) {
		this.antPattern = antPattern;
	}

	public String getExpression() {
		return expression;
	}
	public void setExpression(String expression) {
		this.expression = expression;
	}

	public Integer getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}
}
