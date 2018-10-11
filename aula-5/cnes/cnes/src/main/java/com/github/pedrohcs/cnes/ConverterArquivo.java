package com.github.pedrohcs.cnes;

import java.io.*;
import java.util.*;
 
import org.json.simple.JSONObject;

public class ConverterArquivo {
	
	public void converter() {
		List<UnidadeMedica> listaIns = new ArrayList<UnidadeMedica>();
		try {
			FileInputStream fis = new FileInputStream("BASE_DE_DADOS_CNES_201808\\tbEstabelecimento201808.csv");
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			FileWriter writeFile = null;
			String linha;
			while ((linha = br.readLine()) != null) {
				
				String [] dados = linha.split(";");
				
				UnidadeMedica ins = new UnidadeMedica();
				ins.setCodigo(dados[0].replaceAll("\"", ""));
				ins.setRazaoSocial(dados[5].replaceAll("\"", ""));
				ins.setLatitude(dados[39].replaceAll("\"", ""));
				ins.setLongitude(dados[40].replaceAll("\"", ""));
				
				listaIns.add(ins);
			}
		
		
		int contador = 0;
		try {
			writeFile = new FileWriter("isntituicao.json");
			while(contador < listaIns.size()) {
				JSONObject jsonObject = new JSONObject();
				jsonObject.put("codigo", listaIns.get(contador).getCodigo());
				jsonObject.put("razaoSocial", listaIns.get(contador).getRazaoSocial());
				jsonObject.put("latitude", listaIns.get(contador).getLatitude());
				jsonObject.put("longitude", listaIns.get(contador).getLongitude());
		            
	            //Escreve no arquivo conteudo do Objeto JSON
	            writeFile.write(jsonObject.toJSONString()+"\n");
	            contador ++;
			}
            writeFile.close();
		    }
		catch(IOException e){
			e.printStackTrace();
			}
				
			

		br.close();
		}catch(IOException e){
			e.printStackTrace();
		}

	}
}
