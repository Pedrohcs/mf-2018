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
	
	public void toJson() {
		JSONObject jsonObject = new JSONObject();
		FileWriter writeFile = null;

		jsonObject.put("id", "\"" + this.id + "\"");
		jsonObject.put("individuo", "\"" + this.individuo + "\"");
		jsonObject.put("designacao", "\"" + this.designacao + "\"");
		jsonObject.put("area", "\"" + this.area + "\"");
		jsonObject.put("emissor", "\"" + this.emissor + "\"");
		jsonObject.put("data", "\"" + this.data + "\"");
		jsonObject.put("tipo", "\"" + this.tipo + "\"");

		try {
			writeFile = new FileWriter("IdentificadorDTO.json");
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
		String area;
		String data;

		try {
			jsonObject = (JSONObject) parser.parse(new FileReader("IdentificadorDTO.json"));

			id = (String) jsonObject.get("id");
			individuo = (String) jsonObject.get("individuo");
			this.designacao = (String) jsonObject.get("designacao");
			area = (String) jsonObject.get("area");
			this.emissor = (String) jsonObject.get("emissor");
			data = (String) jsonObject.get("data");
			this.tipo = (String) jsonObject.get("tipo");

			this.id = id.toCharArray();
			this.individuo = individuo.toCharArray();
			this.area = Integer.parseInt(area);
			this.data = (Date)formatter.parse(data);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
