package com.github.pedrohcs.dto;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class CtpsDTO {

	private char[] identificador = new char[36];
	private int serie;
	private char[] estado = new char[36];
	
	public char[] getIdentificador() {
		return identificador;
	}
	public void setIdentificador(char[] identificador) {
		this.identificador = identificador;
	}
	public int getSerie() {
		return serie;
	}
	public void setSerie(int serie) {
		this.serie = serie;
	}
	public char[] getEstado() {
		return estado;
	}
	public void setEstado(char[] estado) {
		this.estado = estado;
	}
	
	public void toJson() {
		JSONObject jsonObject = new JSONObject();
		FileWriter writeFile = null;

		jsonObject.put("identificador", "\"" + this.identificador + "\"");
		jsonObject.put("serie", "\"" + this.serie + "\"");
		jsonObject.put("estado", "\"" + this.estado + "\"");

		try {
			writeFile = new FileWriter("CtpsDTO.json");
			writeFile.write(jsonObject.toJSONString());
			writeFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void fromJson() throws org.json.simple.parser.ParseException {
		JSONObject jsonObject;
		JSONParser parser = new JSONParser();

		String identificador;
		String serie;
		String estado;
		
		try {
			jsonObject = (JSONObject) parser.parse(new FileReader("CtpsDTO.json"));
			
			identificador = (String) jsonObject.get("identificador");
			serie = (String) jsonObject.get("serie");
			estado = (String) jsonObject.get("estado");

			this.identificador = identificador.toCharArray();
			this.estado = estado.toCharArray();
			this.serie = Integer.parseInt(serie);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
