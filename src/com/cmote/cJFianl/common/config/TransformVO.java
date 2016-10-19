package com.cmote.cJFianl.common.config;

import java.awt.List;
import java.io.Serializable;

public class TransformVO implements Serializable {
	private static final Long serializableUID = -8192032660217273046L;
	private String url;
	private String urlMethodName;
	private String method;
	private String returnType;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrlMethodName() {
		return urlMethodName;
	}
	public void setUrlMethodName(String urlMethodName) {
		this.urlMethodName = urlMethodName;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getReturnType() {
		return returnType;
	}
	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}
//	public List<TransformParamVO> getTransformParamList() {
//		return transformParamList;
//	}
//	public void setTransformParamList(List<TransformParamVO> transformParamList) {
//		this.transformParamList = transformParamList;
//	}
//	private List<TransformParamVO> transformParamList = Lists.newArrayList();
}
