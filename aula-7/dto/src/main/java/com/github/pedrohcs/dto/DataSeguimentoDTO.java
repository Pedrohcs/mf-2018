package com.github.pedrohcs.dto;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DataSeguimentoDTO {

	private char[] codigo;
	private String descricao;
	
	public char[] getCodigo() {
		return codigo;
	}
	public void setCodigo(char[] codigo) {
		this.codigo = codigo;
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
		jsonObject.put("descricao", "\"" + this.descricao + "\"");

		try {
			writeFile = new FileWriter("DataSeguimentoDTO.json");
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
			jsonObject = (JSONObject) parser.parse(new FileReader("DataSeguimentoDTO.json"));
			
			codigo = (String) jsonObject.get("codigo");
			this.descricao = (String) jsonObject.get("descricao");

			this.codigo = codigo.toCharArray();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}