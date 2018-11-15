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

public class DadoDemograficoDTO {

	private char[] individuo = new char[36];
	private Date nascimento;
	private char[] nascimentoAcuracia = new char[3];
	private char[] nascimentoSeguimento;
	private int nascimentoPluralidade;
	private int nascimentoOrdem;
	private Date obito;
	private char[] obitoAcuracia = new char[3];
	private int obitoFonte;
	private int sexo;
	private String mae;
	private String pai;
	private int situacaoFamiliar;
	private int raca;
	private String comentario;
	private int nacionalidade;
	private int municipio;
	private char[] estado = new char[2];
	private int pais;
	private Date dataEntradaPais;
	
	public char[] getIndividuo() {
		return individuo;
	}
	public void setIndividuo(char[] individuo) {
		this.individuo = individuo;
	}
	public Date getnascimento() {
		return nascimento;
	}
	public void setnascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public char[] getNascimentoAcuracia() {
		return nascimentoAcuracia;
	}
	public void setNascimentoAcuracia(char[] nascimentoAcuracia) {
		this.nascimentoAcuracia = nascimentoAcuracia;
	}
	public char getNascimentoSeguimento() {
		return nascimentoSeguimento;
	}
	public void setNascimentoSeguimento(char nascimentoSeguimento) {
		this.nascimentoSeguimento = nascimentoSeguimento;
	}
	public int getNascimentoPluralidade() {
		return nascimentoPluralidade;
	}
	public void setNascimentoPluralidade(int nascimentoPluralidade) {
		this.nascimentoPluralidade = nascimentoPluralidade;
	}
	public int getNascimentoOrdem() {
		return nascimentoOrdem;
	}
	public void setNascimentoOrdem(int nascimentoOrdem) {
		this.nascimentoOrdem = nascimentoOrdem;
	}
	public Date getObito() {
		return obito;
	}
	public void setObito(Date obito) {
		this.obito = obito;
	}
	public char[] getObitoAcuracia() {
		return obitoAcuracia;
	}
	public void setObitoAcuracia(char[] obitoAcuracia) {
		this.obitoAcuracia = obitoAcuracia;
	}
	public int getObitoFonte() {
		return obitoFonte;
	}
	public void setObitoFonte(int obitoFonte) {
		this.obitoFonte = obitoFonte;
	}
	public int getSexo() {
		return sexo;
	}
	public void setSexo(int sexo) {
		this.sexo = sexo;
	}
	public String getMae() {
		return mae;
	}
	public void setMae(String mae) {
		this.mae = mae;
	}
	public String getPai() {
		return pai;
	}
	public void setPai(String pai) {
		this.pai = pai;
	}
	public int getSituacaoFamiliar() {
		return situacaoFamiliar;
	}
	public void setSituacaoFamiliar(int situacaoFamiliar) {
		this.situacaoFamiliar = situacaoFamiliar;
	}
	public int getRaca() {
		return raca;
	}
	public void setRaca(int raca) {
		this.raca = raca;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public int getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(int nacionalidade) {
		this.nacionalidade = nacionalidade;
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
	public int getPais() {
		return pais;
	}
	public void setPais(int pais) {
		this.pais = pais;
	}
	public Date getDataEntradaPais() {
		return dataEntradaPais;
	}
	public void setDataEntradaPais(Date dataEntradaPais) {
		this.dataEntradaPais = dataEntradaPais;
	}
	
	public void toJson() {
		JSONObject jsonObject = new JSONObject();
		FileWriter writeFile = null;

		jsonObject.put("individuo", "\"" + this.individuo + "\"");
		jsonObject.put("nascimento", "\"" + this.nascimento + "\"");
		jsonObject.put("nascimentoAcuracia", "\"" + this.nascimentoAcuracia + "\"");
		jsonObject.put("nascimentoSeguimento", "\"" + this.nascimentoSeguimento + "\"");
		jsonObject.put("nascimentoPluralidade", "\"" + this.nascimentoPluralidade + "\"");
		jsonObject.put("nascimentoOrdem", "\"" + this.nascimentoOrdem + "\"");
		jsonObject.put("obito", "\"" + this.obito + "\"");
		jsonObject.put("obitoAcuracia", "\"" + this.obitoAcuracia + "\"");
		jsonObject.put("obitoFonte", "\"" + this.obitoFonte + "\"");
		jsonObject.put("sexo", "\"" + this.sexo + "\"");
		jsonObject.put("mae", "\"" + this.mae + "\"");
		jsonObject.put("pai", "\"" + this.pai + "\"");
		jsonObject.put("situacaoFamiliar", "\"" + this.situacaoFamiliar + "\"");
		jsonObject.put("raca", "\"" + this.raca + "\"");
		jsonObject.put("comentario", "\"" + this.comentario + "\"");
		jsonObject.put("nacionalidade", "\"" + this.nacionalidade + "\"");
		jsonObject.put("municipio", "\"" + this.municipio + "\"");
		jsonObject.put("estado", "\"" + this.estado + "\"");
		jsonObject.put("pais", "\"" + this.pais + "\"");
		jsonObject.put("dataEntradaPais", "\"" + this.dataEntradaPais + "\"");


		try {
			writeFile = new FileWriter("DadosDemograficoDTO.json");
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

		String individuo;
		String nascimento;
		String nascimentoAcuracia;
		String nascimentoSeguimento;
		String nascimentoPluralidade;
		String nascimentoOrdem;
		String obito;
		String obitoAcuracia;
		String obitoFonte;
		String sexo;
		String situacaoFamiliar;
		String raca;
		String nacionalidade;
		String municipio;
		String estado;
		String pais;
		String dataEntradaPais;
		
		try {
			jsonObject = (JSONObject) parser.parse(new FileReader("DadosDemograficoDTO.json"));
			
			individuo = (String) jsonObject.get("individuo");
			nascimento = (String) jsonObject.get("nascimento");
			nascimentoAcuracia = (String) jsonObject.get("nascimentoAcuracia");
			nascimentoSeguimento = (String) jsonObject.get("nascimentoSeguimento");
			nascimentoPluralidade = (String) jsonObject.get("nascimentoPluralidade");
			nascimentoOrdem = (String) jsonObject.get("nascimentoOrdem");
			obito = (String) jsonObject.get("obito");
			obitoAcuracia = (String) jsonObject.get("obitoAcuracia");
			obitoFonte = (String) jsonObject.get("obitoFonte");
			sexo = (String) jsonObject.get("sexo");
			this.mae = (String) jsonObject.get("mae");
			this.pai = (String) jsonObject.get("pai");
			situacaoFamiliar = (String) jsonObject.get("situacaoFamiliar");
			raca = (String) jsonObject.get("raca");
			this.comentario = (String) jsonObject.get("comentario");
			nacionalidade = (String) jsonObject.get("nacionalidade");
			municipio = (String) jsonObject.get("municipio");
			estado = (String) jsonObject.get("estado");
			pais = (String) jsonObject.get("pais");
			dataEntradaPais = (String) jsonObject.get("dataEntradaPais");

			this.individuo = individuo.toCharArray();
			this.nascimento = (Date)formatter.parse(nascimento);
			this.nascimentoAcuracia = nascimentoAcuracia.toCharArray();
			this.nascimentoSeguimento = nascimentoSeguimento.toCharArray();
			this.nascimentoPluralidade = Integer.parseInt(nascimentoPluralidade);
			this.nascimentoOrdem = Integer.parseInt(nascimentoOrdem);
			this.obito = (Date)formatter.parse(obito);
			this.obitoAcuracia = obitoAcuracia.toCharArray();
			this.obitoFonte = Integer.parseInt(obitoFonte);
			this.sexo = Integer.parseInt(sexo);
			this.situacaoFamiliar = Integer.parseInt(situacaoFamiliar);
			this.raca = Integer.parseInt(raca);
			this.nacionalidade = Integer.parseInt(nacionalidade);
			this.municipio = Integer.parseInt(municipio);
			this.estado = estado.toCharArray();
			this.pais = Integer.parseInt(pais);
			this.dataEntradaPais = (Date)formatter.parse(dataEntradaPais);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
