package dto;

import java.util.Date;

public class IdentificadorDTO {

	private char[] id = new char[36];
	private char[] individuo = new char[36];
	private String designacao;
	private int area;
	private String emissor;
	private Date data;
	private String tipo;
	
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
	public String getDesignacao() {
		return designacao;
	}
	public void setDesignacao(String designacao) {
		this.designacao = designacao;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public String getEmissor() {
		return emissor;
	}
	public void setEmissor(String emissor) {
		this.emissor = emissor;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
