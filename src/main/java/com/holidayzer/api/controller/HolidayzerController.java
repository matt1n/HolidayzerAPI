package com.holidayzer.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/holidays")
public class HolidayzerController {
    @GetMapping
    public List<Holidays> getHolidays() {
        String[] dates = {"01-01-2024", "12-02-2024","13-02-2024","29-03-2024","21-04-2024","01-05-2024","30-05-2024", "07-09-2024","12-10-2024","02-11-2024","15-11-2024","20-11-2024","25-12-2024"};
        String[] names = {"Confraternização Mundial",
        "Carnaval",
        "Carnaval",
        "Sexta-feira Santa",
        "Tiradentes",
        "Dia do Trabalho",
        "Corpus Christi",
        "Independência do Brasil",
        "Nossa Senhora Aparecida",
        "Finados",
        "Proclamação da República",
        "Dia Nacional de Zumbi e da Consciência Negra",
        "Natal"};
        
        List<Holidays> holidaysArray = new ArrayList<>();

        for (int i = 0; i<dates.length; i++){
            Holidays holiday = new Holidays(dates[i], names[i]);
            holidaysArray.add(holiday);
        };
        
        return holidaysArray;
    }
    @GetMapping("/{date}")
    public String getDate(@PathVariable("date") String date) {
        for (Holidays i: holidaysArray){
            if (i.getDate().equals(askDate)) {
                System.out.println("Dia " + askDate + " é " + i.getName() + "! 🎉");
                return;
            } 
        } 
        System.out.println("Dia " + askDate + " não é feriado 🥲");
        }
    }





// public class App {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         String[] dates = {"01-01-2024", "12-02-2024","13-02-2024","29-03-2024","21-04-2024","01-05-2024","30-05-2024", "07-09-2024","12-10-2024","02-11-2024","15-11-2024","20-11-2024","25-12-2024"};
//         String[] names = {"Confraternização Mundial",
//         "Carnaval",
//         "Carnaval",
//         "Sexta-feira Santa",
//         "Tiradentes",
//         "Dia do Trabalho",
//         "Corpus Christi",
//         "Independência do Brasil",
//         "Nossa Senhora Aparecida",
//         "Finados",
//         "Proclamação da República",
//         "Dia Nacional de Zumbi e da Consciência Negra",
//         "Natal"};
//         List<Holidays> holidaysArray = new ArrayList<>();

//         for (int i = 0; i<dates.length; i++){
//             Holidays holiday = new Holidays(dates[i], names[i]);
//             holidaysArray.add(holiday);
//         };

//         System.out.println("Digite:");
//         System.out.println("1: Ver lista de feriados");
//         System.out.println("2: Conferir se o dia é feriado");

//         int number = input.nextInt();

//         if (number == 1) {
//            for (int i = 0; i< holidaysArray.size(); i++){
//                 System.out.println(holidaysArray.get(i).getDate() + " => " + holidaysArray.get(i).getName());
//            }
//         } else if (number == 2){
//             System.out.println();
//             System.out.println("Que data deseja conferir? Formato: dd-mm-aaaa");

//             String askDate = input.next();
//                for (Holidays i: holidaysArray){
//                 if (i.getDate().equals(askDate)) {
//                     System.out.println("Dia " + askDate + " é " + i.getName() + "! 🎉");
//                     return;
//                 } 
//             } 
//             System.out.println("Dia " + askDate + " não é feriado 🥲");

//         }
//     }
// }

