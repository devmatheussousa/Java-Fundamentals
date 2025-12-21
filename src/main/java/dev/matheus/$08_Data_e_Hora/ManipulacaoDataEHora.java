package dev.matheus.$08_Data_e_Hora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ManipulacaoDataEHora {

    public static void main(String[] args) {
        System.out.println("--- API de Data e Hora (java.time) ---");

        //1. LocalDate: Apenas data (ano, mês, dia)
        LocalDate hoje = LocalDate.now();
        System.out.println("Data atual: " + hoje); //formato ISO: yyyy-MM-dd

        //Data específica: 25 de dezembro de 2024
        LocalDate dataEspecial = LocalDate.of(2026, 5, 12);
        System.out.println("Data especial -> meu aniversario: " + dataEspecial);

        //manipulação de datas
        LocalDate dataFutura = dataEspecial.plusDays(10);
        System.out.println("10 dias depois de meu aniversario: " + dataFutura);

        LocalDate amanha = hoje.plusDays(1);
        System.out.println("Amanha: " + amanha);


        // 2. LocalTime: Apenas hora (hora, minuto, segundo, nanossegundo)
        LocalDateTime agora = LocalDateTime.now();
        System.out.println("Hora atual: " + agora); //Formato ISO: yyyy-MM-dd'T'HH:mm:ss.nnnnnnnnn

        LocalDateTime agora2 = LocalDateTime.of(2024, 5, 12, 15, 30, 0);
        System.out.println("Hora específica: " + agora2);

        // Manipulação de horas
        LocalTime agora3 = LocalTime.now();
        System.out.println("Adicionar 3 horas: " + agora3.plusHours(3));

        LocalTime agora4 = LocalTime.of(12, 30, 0);
        System.out.println("Hora específica: " + agora4);

        // Manipulação de minutos
        System.out.println("Adicionar 30 minutos: " + agora4.plusMinutes(30));

        LocalDateTime daHoraEvento = LocalDateTime.of(dataEspecial, agora4);
        System.out.println("Data e hora do evento: " + daHoraEvento);


    }
}
