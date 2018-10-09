package com.github.pedrohcs.cnes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class DescompactarArquivo {
	
	public static void unZip(File file) {

        byte[] buffer = new byte[1024];

        try {
            ZipInputStream zinstream = new ZipInputStream(new FileInputStream(file));

            ZipEntry zentry = zinstream.getNextEntry();
            
            while (zentry != null) {
                String entryName = zentry.getName();
  
                if (zentry.isDirectory()) {
                	File diretorio = new File(zentry.getName());
                	if (!diretorio.exists()) {
                		diretorio.mkdir();
                	}
                	zentry = zinstream.getNextEntry();
                }
                
                else {
                	FileOutputStream outstream = 
                			new FileOutputStream(new File(file.getAbsolutePath().replace(file.getName(), entryName)));
	                int n;

	                while ((n = zinstream.read(buffer)) > -1) {
	                    outstream.write(buffer, 0, n);
	                }

	                outstream.close();
	
	                zinstream.closeEntry();
	                zentry = zinstream.getNextEntry();
                }
            }


            zinstream.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
