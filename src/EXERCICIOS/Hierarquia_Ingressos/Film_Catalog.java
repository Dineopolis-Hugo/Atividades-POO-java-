package EXERCICIOS.Hierarquia_Ingressos;

import java.util.Scanner;

public class Film_Catalog  {
    Scanner scanner = new Scanner(System.in);
    private String filmes[] = {
            "1- O Cavaleiro das Trevas",
            "2- Interestelar",
            "3- Homem-Aranha: Através do Aranhaverso",
            "4- O Senhor dos Anéis: A Sociedade do Anel",
            "5- Avatar",
            "6- Top Gun: Maverick",
            "7- A Origem",
            "8- Super Mario Bros. - O Filme",
            "9- Jurassic World: O Mundo dos Dinossauros",
            "10- Como Treinar o Seu Dragão"};

    //No get/set precisa ter o [] quando é vetor (ARRAY)
    public String[] getFilmes() {
        return filmes;

    }
    public void printarFilmes(){
        for (int contador = 0; contador < filmes.length; contador++){
            System.out.println(  " filme " +  filmes[contador]);
            //Lógica print array
        }
    }

    }

