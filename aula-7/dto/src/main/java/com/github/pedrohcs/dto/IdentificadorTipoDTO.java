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

public class IdentificadorTipoDTO {

	private String codigo;
	private String descricao;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
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
			writeFile = new FileWriter("IdentificadorTipoDTO.json");
			writeFile.write(jsonObject.toJSONString());
			writeFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void fromJson() throws org.json.simple.parser.ParseException, ParseException {
		
		JSONObject jsonObject;
		JSONParser parser = new JSONParser();


		try {
			jsonObject = (JSONObject) parser.parse(new FileReader("IdentificadorDTO.json"));

			this.codigo = (String) jsonObject.get("codigo");
			this.descricao = (String) jsonObject.get("descricao");
			


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
