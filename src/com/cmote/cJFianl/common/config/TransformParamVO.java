package com.cmote.cJFianl.common.config;

import java.io.Serializable;

public class TransformParamVO implements Serializable {
	private static final long serialVersionUID = 2728404017781534263L;
	private String type;
	private String name;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
