package EXERCICIOS.Hierarquia_Ingressos;

import EXERCICIOS.Hierarquia_Ingressos.Tickets.Family_ticket;
import EXERCICIOS.Hierarquia_Ingressos.Tickets.Full_Ticket;
import EXERCICIOS.Hierarquia_Ingressos.Tickets.Half_Price_Ticket;
import EXERCICIOS.Hierarquia_Ingressos.Tickets.Ticket;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Film_Catalog catalog = new Film_Catalog();
        Scanner scanner = new Scanner(System.in);
        int ticketchoice;

try {
    do //fica printando a escolha de ticket até que a opção escolhida seja de 1 a 3
    {
        System.out.println("Tipos de Ticket:");
        System.out.printf("1- Ticket Normal%n " + "preço: R$50%n");
        System.out.printf("2- Meia Entrada%n " + "preço: R$25%n");
        System.out.printf("3- Ticket Família%n " + "preço: R$50 por pessoa%n");
        System.out.println("DESCONTO DE 5% CASO FOREM MAIS DE 3 PESSOAS");
        System.out.println("Escolha uma opção");

        ticketchoice = scanner.nextInt();
        //FIM ticket choice
    } while (ticketchoice < 1 || ticketchoice > 3);


    Ticket ticket = null;
    //Var q vai receber o tipo do ticket

    switch (ticketchoice) {
        case 1:
            ticket = new Full_Ticket();
            //Atribui o ticket especifico a var mais "geral"
            ticket.calcularPreco();

            int respDub0;

            do {
                System.out.printf("O filme será dublado ou legendado?%n" + "0- DUBLADO%n" + "1- LEGENDADO%n");
                respDub0 = scanner.nextInt();
            }
            while (respDub0 < 0 || respDub0 > 1);
            //Repete a pergunta até que a resposta seja 0 ou 1

            switch (respDub0) {
                case 0:
                    ticket.setDubOrLegendado("DUBLADO");
                    break;

                case 1:
                    ticket.setDubOrLegendado("LEGENDADO");
                    break;
                //FIM SWITCH ESCOLHA DUBLADO OU LEGENDADO

            }
            break;

        case 2:
            int respDub1;
            ticket = new Half_Price_Ticket();
            //Atribui o ticket especifico a var mais "geral"
            ticket.calcularPreco();

            do {
                System.out.printf("O filme será dublado ou legendado?%n" + "0- DUBLADO%n" + "1- LEGENDADO%n");
                respDub1 = scanner.nextInt();
            }
            while (respDub1 < 0 || respDub1 > 1);
            //Loop pra forçar o user a escolher um ingresso

            switch (respDub1) {
                case 0:
                    ticket.setDubOrLegendado("DUBLADO");
                    break;

                case 1:
                    ticket.setDubOrLegendado("LEGENDADO");
                    break;

                //FIM SWITCH DUBLADO OU LEGENDADO

            }
            break;

        case 3:
            ticket = new Family_ticket();

            Family_ticket ticketFamily = new Family_ticket();
            //Nesse caso eu transformei em um ticket diferente pra acessar
            //os métodos específicos,mas dps muda pro genérico

            System.out.println("Quantos tickets serão?");
            ticketFamily.setFamilySize(scanner.nextInt());

            ticketFamily.calcularPreco();

            ticket = ticketFamily;
            //transformando a var específica na genérica novamente após usar sua função necessária

            int respDub2;
            do {
                System.out.printf("O filme será dublado ou legendado?%n" + "0- DUBLADO%n" + "1- LEGENDADO%n");
                respDub2 = scanner.nextInt();
            }
            while (respDub2 < 0 || respDub2 > 1);
            //Loop pra forçar o user a escolher um ingresso

            switch (respDub2) {
                case 0:
                    ticket.setDubOrLegendado("DUBLADO");
                    break;

                case 1:
                    ticket.setDubOrLegendado("LEGENDADO");
                    break;

                default:
                    System.err.println("ESCOLHA UMA OPÇÃO VÁLIDA");
                    break;
                //FIM SWITCH ESCOLHA DUBLADO OU LEGENDADO
            }
            break;
    }
    //FIM CRIAÇÃO TICKET

    //FILM CHOICE
    catalog.printarFilmes();
    int filmChoice;

    do {
        System.out.println("Escolha seu filme");
         filmChoice = scanner.nextInt();
        }
    while (filmChoice < 1 || filmChoice > 10);

    switch (filmChoice) {
        //ESCOLHA DE FILME
        case 1:
            if (ticket != null) {
                ticket.setFilmName("1- O Cavaleiro das Trevas");
            }
            System.out.println("Filme escolhido com sucesso");

            break;
        case 2:
            if (ticket != null) {
                ticket.setFilmName("2- Interestelar");
            }
            System.out.println("Filme escolhido com sucesso");

            break;
        case 3:
            if (ticket != null) {
                ticket.setFilmName("3- Homem-Aranha: Através do Aranhaverso");
            }
            System.out.println("Filme escolhido com sucesso");

            break;
        case 4:
            if (ticket != null) {
                ticket.setFilmName("4- O Senhor dos Anéis: A Sociedade do Anel");
            }
            System.out.println("Filme escolhido com sucesso");

            break;
        case 5:
            if (ticket != null) {
                ticket.setFilmName("5- Avatar");
            }
            System.out.println("Filme escolhido com sucesso");

            break;
        case 6:
            if (ticket != null) {
                ticket.setFilmName("6- Top Gun: Maverick");
            }
            System.out.println("Filme escolhido com sucesso");

            break;
        case 7:
            if (ticket != null) {
                ticket.setFilmName("7- A Origem");
            }
            System.out.println("Filme escolhido com sucesso");

            break;
        case 8:
            if (ticket != null) {
                ticket.setFilmName("8- Super Mario Bros. - O Filme");
            }
            System.out.println("Filme escolhido com sucesso");

            break;
        case 9:
            if (ticket != null) {
                ticket.setFilmName("9- Jurassic World: O Mundo dos Dinossauros");
            }
            System.out.println("Filme escolhido com sucesso");

            break;
        case 10:
            if (ticket != null) {
                ticket.setFilmName("10- Como Treinar o Seu Dragão");
            }
            System.out.println("Filme escolhido com sucesso");

            break;
            //FIM FILM CHOICE
    }
    //PRINT FINAL TICKET
    System.out.println("PREÇO TOTAL: " + ticket.getPrice());
    System.out.println("NOME DO FILME: " + ticket.getFilmName());
    System.out.println(ticket.getDubOrLegendado());

    }catch (InputMismatchException e){
    System.err.println("DIGITE APENAS NÚMEROS");
    //TRATAMENTO EXCEÇÃO
}
        }











    }

