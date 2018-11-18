package com.github.pedrohcs.dto;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class RepresentacaoDTO {

	private char[] nome = new char[36];
	private String utilizacao;
	private String alternativa;
	
	public char[] getNome() {
		return nome;
	}
	public void setNome(char[] nome) {
		this.nome = nome;
	}
	public String getUtilizacao() {
		return utilizacao;
	}
	public void setUtilizacao(String utilizacao) {
		this.utilizacao = utilizacao;
	}
	public String getAlternativa() {
		return alternativa;
	}
	public void setAlternativa(String alternativa) {
		alternativa = alternativa;
	}
	
	public void toJson() {
		JSONObject jsonObject = new JSONObject();
		FileWriter writeFile = null;

		jsonObject.put("nome", "\"" + this.nome + "\"");
		jsonObject.put("utilizacao", "\"" + this.utilizacao + "\"");
		jsonObject.put("alternativa", "\"" + this.alternativa + "\"");

		try {
			writeFile = new FileWriter("RepresentacaoDTO.json");
			writeFile.write(jsonObject.toJSONString());
			writeFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void fromJson() throws org.json.simple.parser.ParseException {
		JSONObject jsonObject;
		JSONParser parser = new JSONParser();

		String nome;

		try {
			jsonObject = (JSONObject) parser.parse(new FileReader("RepresentacaoDTO.json"));

			nome = (String) jsonObject.get("codigo");
			this.utilizacao = (String) jsonObject.get("utilizacao");
			this.alternativa = (String) jsonObject.get("alternativa");

			this.nome = nome.toCharArray();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
