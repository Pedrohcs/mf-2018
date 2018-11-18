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
	
	public void toJson() {
		JSONObject jsonObject = new JSONObject();
		FileWriter writeFile = null;

		jsonObject.put("identificador", "\"" + this.identificador + "\"");
		jsonObject.put("individuo", "\"" + this.individuo + "\"");
		jsonObject.put("relacionamento", "\"" + this.relacionamento + "\"");
		jsonObject.put("dataInicio", "\"" + this.dataInicio + "\"");
		jsonObject.put("dataFinal", "\"" + this.dataFinal + "\"");

		try {
			writeFile = new FileWriter("VinculoDTO.json");
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

		String identificador;
		String individuo;
		String relacionamento; 
		String dataInicio; 
		String dataFinal;

		try {
			jsonObject = (JSONObject) parser.parse(new FileReader("VinculoDTO.json"));

			identificador = (String) jsonObject.get("identificador");
			individuo = (String) jsonObject.get("individuo");
			relacionamento = (String) jsonObject.get("relacionamento");
			dataInicio = (String) jsonObject.get("dataInicio");
			dataFinal = (String) jsonObject.get("dataFinal");
			
			this.identificador = identificador.toCharArray();
			this.individuo = individuo.toCharArray();
			this.relacionamento = Integer.parseInt(relacionamento);
			this.dataInicio = (Date)formatter.parse(dataInicio);
			this.dataFinal = (Date)formatter.parse(dataFinal);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
