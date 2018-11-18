package com.github.pedrohcs.dto;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class NomeUsoDTO {

	private int codigo;
	private char[] alternativo = new char[1];
	private String descricao;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public char[] getAlternativo() {
		return alternativo;
	}
	public void setAlternativo(char[] alternativo) {
		this.alternativo = alternativo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void toJson() {
		JSONObject jsonObject = new JSONObject();
		FileWriter writeFile = null;

		jsonObject.put("codigo", "\"" + this.codigo + "\"");
		jsonObject.put("alternativo", "\"" + this.alternativo + "\"");
		jsonObject.put("descricao", "\"" + this.descricao + "\"");

		try {
			writeFile = new FileWriter("NomeUsoDTO.json");
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
		String alternativo;

		try {
			jsonObject = (JSONObject) parser.parse(new FileReader("NomeUsoDTO.json"));

			codigo = (String) jsonObject.get("codigo");
			alternativo = (String) jsonObject.get("alternativo");
			this.descricao = (String) jsonObject.get("descricao");

			this.codigo = Integer.parseInt(codigo);
			this.alternativo = alternativo.toCharArray();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
