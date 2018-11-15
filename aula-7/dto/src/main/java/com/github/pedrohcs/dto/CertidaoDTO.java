package com.github.pedrohcs.dto;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class CertidaoDTO {
	private char[] identificador = new char[36];
	private int tipo;
	private String cartorio;
	private int livro;
	private int folha;
	private int termo;
	
	public char[] getIdentificador() {
		return identificador;
	}
	public void setIdentificador(char[] identificador) {
		this.identificador = identificador;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getCartorio() {
		return cartorio;
	}
	public void setCartorio(String cartorio) {
		this.cartorio = cartorio;
	}
	public int getLivro() {
		return livro;
	}
	public void setLivro(int livro) {
		this.livro = livro;
	}
	public int getFolha() {
		return folha;
	}
	public void setFolha(int folha) {
		this.folha = folha;
	}
	public int getTermo() {
		return termo;
	}
	public void setTermo(int termo) {
		this.termo = termo;
	}
	
	public void toJson() {
		JSONObject jsonObject = new JSONObject();
		FileWriter writeFile = null;

		jsonObject.put("identificador", "\"" + this.identificador + "\"");
		jsonObject.put("tipo", "\"" + this.tipo + "\"");
		jsonObject.put("cartorio", "\"" + this.cartorio + "\"");
		jsonObject.put("livro", "\"" + this.livro + "\"");
		jsonObject.put("folha", "\"" + this.folha + "\"");
		jsonObject.put("termo", "\"" + this.termo + "\"");

		try {
			writeFile = new FileWriter("CertidaoDTO.json");
			writeFile.write(jsonObject.toJSONString());
			writeFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void fromJson() throws org.json.simple.parser.ParseException {
		JSONObject jsonObject;
		JSONParser parser = new JSONParser();

		String identificador;
		String tipo;
		String livro;
		String folha;
		String termo;

		try {
			jsonObject = (JSONObject) parser.parse(new FileReader("CertidaoDTO.json"));

			identificador = (String) jsonObject.get("identificador");
			tipo = (String) jsonObject.get("tipo");
			this.cartorio = (String) jsonObject.get("cartorio");
			livro = (String) jsonObject.get("livro");
			folha = (String) jsonObject.get("folha");
			termo = (String) jsonObject.get("termo");
			
			this.tipo = Integer.parseInt(tipo);
			this.livro = Integer.parseInt(livro);
			this.folha = Integer.parseInt(folha);
			this.termo = Integer.parseInt(termo);
			this.identificador = identificador.toCharArray();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
