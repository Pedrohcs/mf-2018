package com.github.pedrohcs.cnes;

import java.io.*;
import java.util.*;
import com.google.gson.Gson;

public class ConverterArquivo {
	
	private final static String NOME_CSV = "tbEstabelecimento201808.csv";
	
	public static void converter(String nomeArquivo) {
		List<UnidadeMedica> listaIns = new ArrayList<UnidadeMedica>();
		try {
			FileInputStream fis = new FileInputStream(NOME_CSV);
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			String linha;
			while ((linha = br.readLine()) != null) {
				
				String [] dados = linha.split(";");
				
				UnidadeMedica ins = new UnidadeMedica();
				ins.setCodigo(dados[1].replaceAll("\"", ""));
				ins.setRazaoSocial(dados[5].replaceAll("\"", ""));
				ins.setLatitude(dados[39].replaceAll("\"", ""));
				ins.setLongitude(dados[40].replaceAll("\"", ""));
				
				listaIns.add(ins);
			}
		
			gerarArquivo(listaIns, nomeArquivo);	
			
		br.close();
		}catch(IOException e){
			e.printStackTrace();
		}

	}
	
	private static void gerarArquivo(List<UnidadeMedica> lista, String nomeArquivo){
		try {
	        try {
	        	FileWriter writer = new FileWriter("../web-app/nomeArquivo.txt");
	        	PrintWriter gravar = new PrintWriter(writer);
	        	gravar.print(nomeArquivo);
	        	writer.close();
	        }catch(IOException e){
				e.printStackTrace();
			}
			FileWriter writer = new FileWriter("../web-app/"+nomeArquivo+".json");
			Gson gson = new Gson();
			gson.toJson(lista, writer);
			writer.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
}
