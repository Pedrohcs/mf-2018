package com.github.pedrohcs.dto;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class IndividuoDTO {

	private char[] id = new char[36];

	public char[] getId() {
		return id;
	}

	public void setId(char[] id) {
		this.id = id;
	}
	
	public void toJson() {
		JSONObject jsonObject = new JSONObject();
		FileWriter writeFile = null;

		jsonObject.put("id", "\"" + this.id + "\"");

		try {
			writeFile = new FileWriter("IndividuoDTO.json");
			writeFile.write(jsonObject.toJSONString());
			writeFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void fromJson() throws org.json.simple.parser.ParseException {
		JSONObject jsonObject;
		JSONParser parser = new JSONParser();

		String id;

		try {
			jsonObject = (JSONObject) parser.parse(new FileReader("IndividuoDTO.json"));

			id = (String) jsonObject.get("id");

			this.id = id.toCharArray();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
