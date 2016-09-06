package com.yaas.pickupstore.email;

public class TemplateAttributeDefinition {
	private String key;
	private Boolean mandatory;

	public TemplateAttributeDefinition() {
		// default
	}

	public TemplateAttributeDefinition(final String key, final boolean mandatory) {
		this.key = key;
		this.mandatory = mandatory;
	}

	public String getKey() {
		return key;
	}

	public void setKey(final String key) {
		this.key = key;
	}

	public Boolean getMandatory() {
		return mandatory;
	}

	public void setMandatory(final Boolean mandatory) {
		this.mandatory = mandatory;
	}
}
