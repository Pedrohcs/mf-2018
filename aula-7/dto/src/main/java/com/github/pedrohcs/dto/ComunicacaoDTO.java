package com.github.pedrohcs.dto;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ComunicacaoDTO {

	private char[] individuo = new char[36];
	private int meio;
	private char[] preferencia = new char[1];
	private String detalhe;
	private int uso;
	
	public char[] getIndividuo() {
		return individuo;
	}
	public void setIndividuo(char[] individuo) {
		this.individuo = individuo;
	}
	public int getMeio() {
		return meio;
	}
	public void setMeio(int meio) {
		this.meio = meio;
	}
	public char[] getPreferencia() {
		return preferencia;
	}
	public void setPreferencia(char[] preferencia) {
		this.preferencia = preferencia;
	}
	public String getDetalhe() {
		return detalhe;
	}
	public void setDetalhe(String detalhe) {
		this.detalhe = detalhe;
	}
	public int getUso() {
		return uso;
	}
	public void setUso(int uso) {
		this.uso = uso;
	}
	
	public void toJson() {
		JSONObject jsonObject = new JSONObject();
		FileWriter writeFile = null;

		jsonObject.put("individuo", "\"" + this.individuo + "\"");
		jsonObject.put("meio", "\"" + this.meio + "\"");
		jsonObject.put("preferencia", "\"" + this.preferencia + "\"");
		jsonObject.put("detalhe", "\"" + this.detalhe + "\"");
		jsonObject.put("uso", "\"" + this.uso + "\"");

		try {
			writeFile = new FileWriter("ComunicacaoDTO.json");
			writeFile.write(jsonObject.toJSONString());
			writeFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void fromJson() throws org.json.simple.parser.ParseException {
		JSONObject jsonObject;
		JSONParser parser = new JSONParser();

		String individuo;
		String meio;
		String preferencia;
		String uso;

		try {
			jsonObject = (JSONObject) parser.parse(new FileReader("CertidaoTipoDTO.json"));

			individuo = (String) jsonObject.get("individuo");
			meio = (String) jsonObject.get("meio");
			preferencia = (String) jsonObject.get("preferencia");
			this.detalhe = (String) jsonObject.get("detalhe");
			uso = (String) jsonObject.get("uso");

			this.individuo = individuo.toCharArray();
			this.meio = Integer.parseInt(meio);
			this.preferencia = preferencia.toCharArray();
			this.uso = Integer.parseInt(uso);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
