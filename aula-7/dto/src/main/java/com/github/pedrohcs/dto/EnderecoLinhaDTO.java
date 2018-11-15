package com.github.pedrohcs.dto;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class EnderecoLinhaDTO {

	private char[] endereco = new char[36];
	private String linha;
	private int ordem;
	
	public char[] getEndereco() {
		return endereco;
	}
	public void setEndereco(char[] endereco) {
		this.endereco = endereco;
	}
	public String getLinha() {
		return linha;
	}
	public void setLinha(String linha) {
		this.linha = linha;
	}
	public int getOrdem() {
		return ordem;
	}
	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}
	
	public void toJson() {
		JSONObject jsonObject = new JSONObject();
		FileWriter writeFile = null;

		jsonObject.put("endereco", "\"" + this.endereco + "\"");
		jsonObject.put("linha", "\"" + this.linha + "\"");
		jsonObject.put("ordem", "\"" + this.ordem + "\"");

		try {
			writeFile = new FileWriter("EnderecoLinhaDTO.json");
			writeFile.write(jsonObject.toJSONString());
			writeFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void fromJson() throws org.json.simple.parser.ParseException {
		JSONObject jsonObject;
		JSONParser parser = new JSONParser();

		String endereco;
		String ordem;
		
		try {
			jsonObject = (JSONObject) parser.parse(new FileReader("EnderecoLinhaDTO.json"));
			endereco = (String) jsonObject.get("endereco");
			this.linha = (String) jsonObject.get("linha");
			ordem = (String) jsonObject.get("ordem");

			this.endereco = endereco.toCharArray();
			this.ordem = Integer.parseInt(ordem);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
