package com.github.pedrohcs.dto;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class TituloEleitoralDTO {

		private char[] identificador = new char[36];
		private int zona;
		private int sessao;
		
		public char[] getIdentificador() {
			return identificador;
		}
		public void setIdentificador(char[] identificador) {
			this.identificador = identificador;
		}
		public int getZona() {
			return zona;
		}
		public void setZona(int zona) {
			this.zona = zona;
		}
		public int getSessao() {
			return sessao;
		}
		public void setSessao(int sessao) {
			this.sessao = sessao;
		}	
		
		public void toJson() {
			JSONObject jsonObject = new JSONObject();
			FileWriter writeFile = null;

			jsonObject.put("identificador", "\"" + this.identificador + "\"");
			jsonObject.put("zona", "\"" + this.zona + "\"");
			jsonObject.put("sessao", "\"" + this.sessao + "\"");

			try {
				writeFile = new FileWriter("TituloEleitoralDTO.json");
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
			String zona;
			String sessao;

			try {
				jsonObject = (JSONObject) parser.parse(new FileReader("TituloEleitoralDTO.json"));

				identificador = (String) jsonObject.get("identificador");
				zona = (String) jsonObject.get("zona");
				sessao = (String) jsonObject.get("sessao");

				this.identificador = identificador.toCharArray();
				this.zona = Integer.parseInt(zona);
				this.sessao = Integer.parseInt(sessao);

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
}
