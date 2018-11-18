package com.github.pedrohcs.dto;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class EstadoDTO {

	private char[] codigo = new char[2];
	private String nome;
	
	public char[] getCodigo() {
		return codigo;
	}
	public void setCodigo(char[] codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void toJson() {
		JSONObject jsonObject = new JSONObject();
		FileWriter writeFile = null;

		jsonObject.put("codigo", "\"" + this.codigo + "\"");
		jsonObject.put("nome", "\"" + this.nome + "\"");

		try {
			writeFile = new FileWriter("EstadoDTO.json");
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

		try {
			jsonObject = (JSONObject) parser.parse(new FileReader("EstadoDTO.json"));

			codigo = (String) jsonObject.get("codigo");
			this.nome = (String) jsonObject.get("nome");

			this.codigo = codigo.toCharArray();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
} 
