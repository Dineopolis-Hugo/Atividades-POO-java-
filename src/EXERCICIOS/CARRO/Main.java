package EXERCICIOS.CARRO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean sairCarro = false;
        Carro carro = new Carro();

         while (sairCarro == false) {
             System.out.println("1 LIGAR CARRO");
             System.out.println("2 DESLIGAR CARRO");
             System.out.println("3 ACELERAR");
             System.out.println("4 FREAR");
             System.out.println("5 VIRAR PARA ESQUERDA");
             System.out.println("6 VIRAR PARA DIREITA");
             System.out.println("7 AVANÇAR MARCHA");
             System.out.println("8 VOLTAR MARCHA");
             System.out.println("9 SAIR DO CARRO (ENCERRAR)");


             System.out.println("Escolha uma opção");
             int opcao = scanner.nextInt();

             switch (opcao){
                 case 1:
                     carro.ligarCarro();
                     System.out.println("Deseja voltar ao menu?[s/n]");
                     String respMenu = scanner.next();
                     if (respMenu.equals("s")) {
                         break;
                     }
                     else if (respMenu.equals("n")) {
                         sairCarro = true;
                     }
                 case 2:
                     carro.desligarCarro();
                     System.out.println("Deseja voltar ao menu?[s/n]");
                     respMenu = scanner.next();
                     if (respMenu.equals("s")) {
                         break;
                     }
                     else if (respMenu.equals("n")) {
                         sairCarro = true;
                     }
                 case 3:
                     String acelerarMais;

                     do {
                         carro.acelerar();
                         System.out.println("deseja acelerar mais?[s/n]");
                         acelerarMais = scanner.next();
                     }
                     while(acelerarMais.equalsIgnoreCase("s"));
                     //Enquanto a resposta for "S" ele irá perguntar se quero acelerar mais
                     //O EQUALS IGNORE CASE irá aceitar a String independente se está maiusculo ou n
                     // EQUALS aceita apenas "s" e IGNORECASE aceita "s" && "S"

                     System.out.println("Deseja voltar ao menu?[s/n]");
                      respMenu = scanner.next();
                     if (respMenu.equals("s")) {
                         break;
                     }
                     else if (respMenu.equals("n")) {
                         sairCarro = true;
                     }

                 case 4:
                     String frearNovamente;

                     do{carro.frear();
                         System.out.println("Deseja frear mais?");
                         frearNovamente = scanner.next();
                     }
                     while (frearNovamente.equalsIgnoreCase("s"));
                        System.out.println("Deseja voltar ao menu?[s/n]");
                         respMenu = scanner.next();
                     if (respMenu.equals("s")) {
                         break;
                     }
                     else if (respMenu.equals("n")) {
                         sairCarro = true;
                     }
                 case 5:
                     carro.virarEsquerda();

                     System.out.println("Deseja voltar ao menu?[s/n]");
                     respMenu = scanner.next();
                     if (respMenu.equals("s")) {
                         break;
                     }
                     else if (respMenu.equals("n")) {
                         sairCarro = true;
                     }
                 case 6 :
                      carro.virarDireita();

                     System.out.println("Deseja voltar ao menu?[s/n]");
                     respMenu = scanner.next();
                     if (respMenu.equals("s")) {
                         break;
                     }
                     else if (respMenu.equals("n")) {
                         sairCarro = true;
                     }
                 case 7:
                     carro.passarMarcha();

                     System.out.println("Deseja voltar ao menu?[s/n]");
                     respMenu = scanner.next();
                     if (respMenu.equals("s")) {
                         break;
                     }
                     else if (respMenu.equals("n")) {
                         sairCarro = true;
                     }
                 case 8:
                     carro.voltarMarcha();

                     System.out.println("Deseja voltar ao menu?[s/n]");
                     respMenu = scanner.next();
                     if (respMenu.equals("s")) {
                         break;
                     }
                     else if (respMenu.equals("n")) {
                         sairCarro = true;
                     }
                 case 9:
                     System.err.println("saindo do carro (ENCERRANDO)");
                     sairCarro = true;
                        break;
                 default:
                     System.err.println("ESCOLHA UMA OPÇÃO VÁLIDA");
                        break;
             }
         }
    }
}
