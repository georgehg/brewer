package com.ghgs.brewer.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class Brew {
	
	@NotBlank(message="SKU não pode estar em branco")
	private String sku;
	
	@NotBlank(message="Nome não pode ser vazio")
	private String name;
	
	@Size(min=1, max=50, message="Descrição deve ter entre 1 e 50 caracteres")
	private String description;

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Brew [sku=" + sku + ", name=" + name + ", description=" + description + "]";
	}


}
