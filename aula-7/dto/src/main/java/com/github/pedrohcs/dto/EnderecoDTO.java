package com.github.pedrohcs.dto;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

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
	
	public void toJson() {
		JSONObject jsonObject = new JSONObject();
		FileWriter writeFile = null;

		jsonObject.put("id", "\"" + this.id + "\"");
		jsonObject.put("individuo", "\"" + this.individuo + "\"");
		jsonObject.put("bairro", "\"" + this.bairro + "\"");
		jsonObject.put("distrito", "\"" + this.distrito + "\"");
		jsonObject.put("municipio", "\"" + this.municipio + "\"");
		jsonObject.put("estado", "\"" + this.estado + "\"");
		jsonObject.put("cep", "\"" + this.cep + "\"");
		jsonObject.put("caixaPostal", "\"" + this.caixaPostal + "\"");
		jsonObject.put("pais", "\"" + this.pais + "\"");
		jsonObject.put("tipo", "\"" + this.tipo + "\"");
		jsonObject.put("dataInicial", "\"" + this.dataInicial + "\"");
		jsonObject.put("dataInicialAcuracia", "\"" + this.dataInicialAcuracia + "\"");
		jsonObject.put("dataFinal", "\"" + this.dataFinal + "\"");
		jsonObject.put("dataFinalAcuracia", "\"" + this.dataFinalAcuracia + "\"");


		try {
			writeFile = new FileWriter("EnderecoDTO.json");
			writeFile.write(jsonObject.toJSONString());
			writeFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void fromJson() throws org.json.simple.parser.ParseException, ParseException {
		DateFormat formatter = new SimpleDateFormat("MM/dd/yy");
		
		JSONObject jsonObject;
		JSONParser parser = new JSONParser();

		String id;
		String individuo;
		String municipio;
		String estado;
		String pais;
		String tipo;
		String dataInicial;
		String dataInicialAcuracia;
		String dataFinal;
		String dataFinalAcuracia;
		
		try {
			jsonObject = (JSONObject) parser.parse(new FileReader("EnderecoDTO.json"));
			
			id = (String) jsonObject.get("id");
			individuo = (String) jsonObject.get("individuo");
			this.bairro = (String) jsonObject.get("bairro");
			this.distrito = (String) jsonObject.get("distrito");
			municipio = (String) jsonObject.get("municipio");
			estado = (String) jsonObject.get("estado");
			this.cep = (String) jsonObject.get("cep");
			this.caixaPostal = (String) jsonObject.get("caixaPostal");
			pais = (String) jsonObject.get("pais");
			tipo = (String) jsonObject.get("tipo");
			dataInicial = (String) jsonObject.get("dataInicial");
			dataInicialAcuracia = (String) jsonObject.get("dataInicialAcuracia");
			dataFinal = (String) jsonObject.get("dataFinal");
			dataFinalAcuracia = (String) jsonObject.get("dataFinalAcuracia");

			this.id = id.toCharArray();
			this.individuo = individuo.toCharArray();
			this.municipio = Integer.parseInt(municipio);
			this.estado = estado.toCharArray();
			this.pais = Integer.parseInt(pais);
			this.tipo = Integer.parseInt(tipo);
			this.dataInicial = (Date)formatter.parse(dataInicial);
			this.dataInicialAcuracia = dataInicialAcuracia.toCharArray();
			this.dataFinal = (Date)formatter.parse(dataFinal);
			this.dataFinalAcuracia = dataFinalAcuracia.toCharArray();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
