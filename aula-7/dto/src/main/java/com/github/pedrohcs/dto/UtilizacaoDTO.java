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

public class UtilizacaoDTO {

	private char[] nome = new char[36];
	private int uso;
	private char[] identificador = new char[36];
	private Date dataInicial;
	private Date dataFinal;
	
	public char[] getNome() {
		return nome;
	}
	public void setNome(char[] nome) {
		this.nome = nome;
	}
	public int getUso() {
		return uso;
	}
	public void setUso(int uso) {
		this.uso = uso;
	}
	public char[] getIdentificador() {
		return identificador;
	}
	public void setIdentificador(char[] identificador) {
		this.identificador = identificador;
	}
	public Date getDataInicial() {
		return dataInicial;
	}
	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}
	public Date getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}
	
	public void toJson() {
		JSONObject jsonObject = new JSONObject();
		FileWriter writeFile = null;

		jsonObject.put("nome", "\"" + this.nome + "\"");
		jsonObject.put("uso", "\"" + this.uso + "\"");
		jsonObject.put("identificador", "\"" + this.identificador + "\"");
		jsonObject.put("dataInicial", "\"" + this.dataInicial + "\"");
		jsonObject.put("dataFinal", "\"" + this.dataFinal + "\"");

		try {
			writeFile = new FileWriter("UtilizacaoDTO.json");
			writeFile.write(jsonObject.toJSONString());
			writeFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void fromJson() throws org.json.simple.parser.ParseException, ParseException {
		DateFormat formatter = new SimpleDateFormat("MM/dd/yy");
		
		JSONObject jsonObject;
		JSONParser parser = new JSONParser();

		String nome;
		String uso;
		String identificador; 
		String dataInicial; 
		String dataFinal;

		try {
			jsonObject = (JSONObject) parser.parse(new FileReader("UtilizacaoDTO.json"));

			nome = (String) jsonObject.get("nome");
			uso = (String) jsonObject.get("uso");
			identificador = (String) jsonObject.get("identificador");
			dataInicial = (String) jsonObject.get("dataInicial");
			dataFinal = (String) jsonObject.get("dataFinal");
			
			this.nome = nome.toCharArray();
			this.uso = Integer.parseInt(uso);
			this.identificador = identificador.toCharArray();
			this.dataInicial = (Date)formatter.parse(dataInicial);
			this.dataFinal = (Date)formatter.parse(dataFinal);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
