package com.github.pedrohcs.dto;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class NomeDTO {

	private char[] id = new char[36];
	private char[] individuo = new char[36];
	private String titulos;
	private String nomes;
	private String sobrenomes;
	private String sufixos;
	private int preferidos;
	private int usoCondicional;
	
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
	public String getTitulos() {
		return titulos;
	}
	public void setTitulos(String titulos) {
		this.titulos = titulos;
	}
	public String getNomes() {
		return nomes;
	}
	public void setNomes(String nomes) {
		this.nomes = nomes;
	}
	public String getSobrenomes() {
		return sobrenomes;
	}
	public void setSobrenomes(String sobrenomes) {
		this.sobrenomes = sobrenomes;
	}
	public String getSufixos() {
		return sufixos;
	}
	public void setSufixos(String sufixos) {
		this.sufixos = sufixos;
	}
	public int getPreferidos() {
		return preferidos;
	}
	public void setPreferidos(int preferidos) {
		this.preferidos = preferidos;
	}
	public int getUsoCondicional() {
		return usoCondicional;
	}
	public void setUsoCondicional(int usoCondicional) {
		this.usoCondicional = usoCondicional;
	}
	
	public void toJson() {
		JSONObject jsonObject = new JSONObject();
		FileWriter writeFile = null;

		jsonObject.put("id", "\"" + this.id + "\"");
		jsonObject.put("individuo", "\"" + this.individuo + "\"");
		jsonObject.put("titulos", "\"" + this.titulos + "\"");
		jsonObject.put("nomes", "\"" + this.nomes + "\"");
		jsonObject.put("sobrenomes", "\"" + this.sobrenomes + "\"");
		jsonObject.put("sufixos", "\"" + this.sufixos + "\"");
		jsonObject.put("preferidos", "\"" + this.preferidos + "\"");
		jsonObject.put("usoCondicional", "\"" + this.usoCondicional + "\"");

		try {
			writeFile = new FileWriter("NomeDTO.json");
			writeFile.write(jsonObject.toJSONString());
			writeFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void fromJson() throws org.json.simple.parser.ParseException {
		JSONObject jsonObject;
		JSONParser parser = new JSONParser();

		String id;
		String individuo;
		String preferidos;
		String usoCondicional;

		try {
			jsonObject = (JSONObject) parser.parse(new FileReader("NomeDTO.json"));

			id = (String) jsonObject.get("id");
			individuo = (String) jsonObject.get("individuo");
			this.titulos = (String) jsonObject.get("titulos");
			this.nomes = (String) jsonObject.get("nomes");
			this.sobrenomes = (String) jsonObject.get("sobrenomes");
			this.sufixos = (String) jsonObject.get("sufixos");
			preferidos = (String) jsonObject.get("preferidos");
			usoCondicional = (String) jsonObject.get("usoCondicional");

			this.id = id.toCharArray();
			this.individuo = individuo.toCharArray();
			this.preferidos = Integer.parseInt(preferidos);
			this.usoCondicional = Integer.parseInt(usoCondicional);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
