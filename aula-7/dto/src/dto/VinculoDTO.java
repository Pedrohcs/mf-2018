package dto;

import java.util.Date;

public class VinculoDTO {

	private char[] identificador = new char[36];
	private char[] individuo = new char[36];
	private int relacionamento;
	private Date dataInicio;
	private Date dataFinal;
	
	public char[] getIdentificador() {
		return identificador;
	}
	public void setIdentificador(char[] identificador) {
		this.identificador = identificador;
	}
	public char[] getIndividuo() {
		return individuo;
	}
	public void setIndividuo(char[] individuo) {
		this.individuo = individuo;
	}
	public int getRelacionamento() {
		return relacionamento;
	}
	public void setRelacionamento(int relacionamento) {
		this.relacionamento = relacionamento;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}
	
}
