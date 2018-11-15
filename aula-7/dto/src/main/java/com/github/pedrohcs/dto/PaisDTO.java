package com.github.pedrohcs.dto;

public class PaisDTO {

	private int codigo;
	private char[] nome = new char[46];
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public char[] getNome() {
		return nome;
	}
	public void setNome(char[] nome) {
		this.nome = nome;
	}
	
}
