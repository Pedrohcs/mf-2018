package com.github.pedrohcs.dto;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ComunicacaoMeioDTO {

	private int codigo;
	private String descricao;
	private char[] alternativo = new char[1];
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public char[] getAlternativo() {
		return alternativo;
	}
	public void setAlternativo(char[] alternativo) {
		this.alternativo = alternativo;
	}
	
	public void toJson() {
		JSONObject jsonObject = new JSONObject();
		FileWriter writeFile = null;

		jsonObject.put("codigo", "\"" + this.codigo + "\"");
		jsonObject.put("descricao", "\"" + this.descricao + "\"");
		jsonObject.put("alternativo", "\"" + this.alternativo + "\"");

		try {
			writeFile = new FileWriter("ComunicacaoMeioDTO.json");
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
			jsonObject = (JSONObject) parser.parse(new FileReader("ComunicacaoMeioDTO.json"));
			codigo = (String) jsonObject.get("codigo");
			this.descricao = (String) jsonObject.get("descricao");
			alternativo = (String) jsonObject.get("alternativo");

			this.alternativo = alternativo.toCharArray();
			this.codigo = Integer.parseInt(codigo);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
