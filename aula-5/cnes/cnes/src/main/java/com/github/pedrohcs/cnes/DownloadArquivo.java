package com.github.pedrohcs.cnes;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class DownloadArquivo 
{
	
	private final String NOME_ARQUIVO = "base_de_dados.zip";
	
	public void download (String link) {
		try {
			URL url = new URL(link);
			
			InputStream is = url.openStream();

			FileOutputStream fos = new FileOutputStream(NOME_ARQUIVO);
			int umByte = 0;
			
			while ((umByte = is.read()) != -1){
				fos.write(umByte);
			}

			is.close();
			fos.close();

			new File(NOME_ARQUIVO);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getNomeArquivo() {
		return NOME_ARQUIVO;
	}

}
