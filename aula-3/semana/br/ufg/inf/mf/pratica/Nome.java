package br.ufg.inf.mf.pratica;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Nome {
    public static void main (String args[]){
        LocalDate dia = LocalDate.now();
        Locale traducao = Locale.getDefault();
        String diaTraduzido = dia.format(DateTimeFormatter.ofPattern("EEEE", traducao));
        System.out.println(diaTraduzido);
    }
}
