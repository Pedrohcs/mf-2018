package com.github.pedrohcs.dto;

public class RepresentacaoDTO {

	private char[] nome = new char[36];
	private String utilizacao;
	private String Alternativa;
	
	public char[] getNome() {
		return nome;
	}
	public void setNome(char[] nome) {
		this.nome = nome;
	}
	public String getUtilizacao() {
		return utilizacao;
	}
	public void setUtilizacao(String utilizacao) {
		this.utilizacao = utilizacao;
	}
	public String getAlternativa() {
		return Alternativa;
	}
	public void setAlternativa(String alternativa) {
		Alternativa = alternativa;
	}
	
}
