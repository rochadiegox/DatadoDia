package stringsdatas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import static java.time.temporal.TemporalQueries.localDate;
import java.util.Locale;

public class StringsDatas {
    
    public static void main(String[] args) {
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
