/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsdatas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import static java.time.temporal.TemporalQueries.localDate;
import java.util.Locale;

/**
 *
 * @author Diego
 */
public class StringsDatas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Olá, {nome}. Hoje é {dia-da-semana}, BOM DIA.
        
        String nome = "Diego";
        
        // ISO 8601
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");        
        // System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour() >= 0 && agora.getHour() < 18) {
            saudacao = "bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "boa tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "boa noite";
        } else {
            saudacao = "Olá";
        }
        
        System.out.printf("Olá, %s. Hoje é %s, %s.%n ", nome, diaSemana, saudacao.toUpperCase());
        
    }
    
}
