package dto;

import java.util.Date;

public class EnderecoDTO {

	private char[] id = new char[36];
	private char[] individuo = new char[36];
	private String bairro;
	private String distrito;
	private int municipio;
	private char[] estado = new char[2];
	private String cep;
	private String caixaPostal;
	private int pais;
	private int tipo;
	private Date dataInicial;
	private char[] dataInicialAcuracia = new char[3];
	private Date dataFinal;
	private char[] dataFinalAcuracia = new char[3];
	
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
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	public int getMunicipio() {
		return municipio;
	}
	public void setMunicipio(int municipio) {
		this.municipio = municipio;
	}
	public char[] getEstado() {
		return estado;
	}
	public void setEstado(char[] estado) {
		this.estado = estado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCaixaPostal() {
		return caixaPostal;
	}
	public void setCaixaPostal(String caixaPostal) {
		this.caixaPostal = caixaPostal;
	}
	public int getPais() {
		return pais;
	}
	public void setPais(int pais) {
		this.pais = pais;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public Date getDataInicial() {
		return dataInicial;
	}
	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}
	public char[] getDataInicialAcuracia() {
		return dataInicialAcuracia;
	}
	public void setDataInicialAcuracia(char[] dataInicialAcuracia) {
		this.dataInicialAcuracia = dataInicialAcuracia;
	}
	public Date getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}
	public char[] getDataFinalAcuracia() {
		return dataFinalAcuracia;
	}
	public void setDataFinalAcuracia(char[] dataFinalAcuracia) {
		this.dataFinalAcuracia = dataFinalAcuracia;
	}
	
}
