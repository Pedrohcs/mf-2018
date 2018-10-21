package com.github.pedrohcs.cnes;

import java.io.File;
import java.util.Scanner;

/**
 * Download de um arquivo zip de uma determinada url 
 * Descompactar este arquivo 
 * Selecionar um arquivo csv específico que estava compactado
 * Converter o csv em um arquivo json
 * 
 */
public class Main 
{
    public static void main( String[] args )
    {
    	Scanner leitor = new Scanner(System.in);
    	String url;
    	String nomeArquivoJson;
    	
    	System.out.println("Digite a url para download do arquivo: ");
    	url = leitor.next();
    	System.out.println("Digite o nome do arquivo json que sera criado: ");
    	nomeArquivoJson = leitor.next();
    	
        DownloadArquivo agente = new DownloadArquivo();
        agente.download(url);
        
        File file = new File(agente.getNomeArquivo());
        
        DescompactarArquivo.unZip(file);
        
        ConverterArquivo.converter(nomeArquivoJson);
    }
}
