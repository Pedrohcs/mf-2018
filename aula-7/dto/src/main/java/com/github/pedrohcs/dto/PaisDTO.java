package com.github.pedrohcs.dto;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class PaisDTO {

	private int codigo;
	private char[] nome = new char[46];
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public char[] getNome() {
		return nome;
	}
	public void setNome(char[] nome) {
		this.nome = nome;
	}
	
	public void toJson() {
		JSONObject jsonObject = new JSONObject();
		FileWriter writeFile = null;

		jsonObject.put("codigo", "\"" + this.codigo + "\"");
		jsonObject.put("nome", "\"" + this.nome + "\"");

		try {
			writeFile = new FileWriter("PaisDTO.json");
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
		String nome;

		try {
			jsonObject = (JSONObject) parser.parse(new FileReader("PaisDTO.json"));

			codigo = (String) jsonObject.get("codigo");
			nome = (String) jsonObject.get("nome");

			this.codigo = Integer.parseInt(codigo);
			this.nome = nome.toCharArray();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
