package com.github.pedrohcs.dto;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class MunicipioDTO {

	private char[] codigo = new char[7];
	private char[] estado = new char[2];
	private String municipio;
	
	public char[] getCodigo() {
		return codigo;
	}
	public void setCodigo(char[] codigo) {
		this.codigo = codigo;
	}
	public char[] getEstado() {
		return estado;
	}
	public void setEstado(char[] estado) {
		this.estado = estado;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	
	public void toJson() {
		JSONObject jsonObject = new JSONObject();
		FileWriter writeFile = null;

		jsonObject.put("codigo", "\"" + this.codigo + "\"");
		jsonObject.put("estado", "\"" + this.estado + "\"");
		jsonObject.put("municipio", "\"" + this.municipio + "\"");

		try {
			writeFile = new FileWriter("MunicipioDTO.json");
			writeFile.write(jsonObject.toJSONString());
			writeFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void fromJson() throws org.json.simple.parser.ParseException {
		JSONObject jsonObject;
		JSONParser parser = new JSONParser();

		String codigo;
		String estado;

		try {
			jsonObject = (JSONObject) parser.parse(new FileReader("MunicipioDTO.json"));

			codigo = (String) jsonObject.get("codigo");
			estado = (String) jsonObject.get("estado");
			this.municipio = (String) jsonObject.get("municipio");

			this.codigo = codigo.toCharArray();
			this.estado = estado.toCharArray();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
