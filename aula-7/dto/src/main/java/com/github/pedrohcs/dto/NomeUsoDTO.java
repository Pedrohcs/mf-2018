package com.github.pedrohcs.dto;

public class NomeUsoDTO {

	private int codigo;
	private char[] alternativo = new char[1];
	private String descricao;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public char[] getAlternativo() {
		return alternativo;
	}
	public void setAlternativo(char[] alternativo) {
		this.alternativo = alternativo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
