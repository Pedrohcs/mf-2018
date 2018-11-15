package com.github.pedrohcs.dto;

public class NomeDTO {

	private char[] id = new char[36];
	private char[] individuo = new char[36];
	private String titulos;
	private String nomes;
	private String sobrenomes;
	private String sufixos;
	private int preferidos;
	private int usoCondicional;
	
	public char[] getId() {
		return id;
	}
	public void setId(char[] id) {
		this.id = id;
	}
	public char[] getIndividuo() {
		return individuo;
	}
	public void setIndividuo(char[] individuo) {
		this.individuo = individuo;
	}
	public String getTitulos() {
		return titulos;
	}
	public void setTitulos(String titulos) {
		this.titulos = titulos;
	}
	public String getNomes() {
		return nomes;
	}
	public void setNomes(String nomes) {
		this.nomes = nomes;
	}
	public String getSobrenomes() {
		return sobrenomes;
	}
	public void setSobrenomes(String sobrenomes) {
		this.sobrenomes = sobrenomes;
	}
	public String getSufixos() {
		return sufixos;
	}
	public void setSufixos(String sufixos) {
		this.sufixos = sufixos;
	}
	public int getPreferidos() {
		return preferidos;
	}
	public void setPreferidos(int preferidos) {
		this.preferidos = preferidos;
	}
	public int getUsoCondicional() {
		return usoCondicional;
	}
	public void setUsoCondicional(int usoCondicional) {
		this.usoCondicional = usoCondicional;
	}
	
}
