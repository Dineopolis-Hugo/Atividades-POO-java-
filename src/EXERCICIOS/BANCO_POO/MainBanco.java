package EXERCICIOS.BANCO_POO;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class MainBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
try{

        boolean rodarMenu = true;
        String respMenu;
        int opcao;

            //main será so pra executar ações

        //CONSTRUTOR CLIENTE
        Cliente cliente = new Cliente();
            System.out.println("Digite seu nome: ");
                cliente.setNome(scanner.nextLine());
            System.out.println("digite seu cpf");
                cliente.setCpf(scanner.nextLine());
                    System.out.println("Digite seu Depósito inicial : ");
                    double saldoInicial = scanner.nextDouble();
                    if (saldoInicial <= 0 ){
                        throw new IllegalArgumentException("DEPOSITE UM VALOR VÁLIDO");
                    }

        //CONSTRUTOR CONTA
        Conta conta01 = new Conta(cliente,saldoInicial);
        //cria a conta e passa o cliente criado do construtor como titular da conta



        while (rodarMenu == true) {
            System.out.println("1 VER SALDO");
            System.out.println("2 DEPOSITAR SALDO");
            System.out.println("3 SACAR SALDO ");
            System.out.println("4 PAGAR BOLETO");
            System.out.println("5 VER CHEQUE ESPECIAL");

            System.out.println("escolha sua opção");
            opcao = scanner.nextInt();


            switch (opcao) {

                case 1:
                    conta01.consultaSaldo();
                    System.out.println("Deseja voltar ao menu?[s/n]");
                    respMenu = scanner.next();
                    if (respMenu.equals("s")) {
                        break;
                    } else if (respMenu.equals("n")) {
                        rodarMenu = false;

                    }
                    break;
                case 2:
                    conta01.depositar();
                    System.out.println("Deseja voltar ao menu?[s/n]");
                    respMenu = scanner.next();
                    if (respMenu.equals("s")) {
                        break;
                    } else if (respMenu.equals("n")) {
                        rodarMenu = false;
                    }
                    break;
                case 3:
                    conta01.sacar();
                    System.out.println("Deseja voltar ao menu?[s/n]");
                    respMenu = scanner.next();
                    if (respMenu.equals("s")) {
                        break;
                    } else if (respMenu.equals("n")) {
                        rodarMenu = false;
                    }
                    break;
                case 4:
                    conta01.pagarBoleto();
                    System.out.println("Deseja voltar ao menu?[s/n]");
                    respMenu = scanner.next();
                    if (respMenu.equals("s")) {
                        break;
                    } else if (respMenu.equals("n")) {
                        rodarMenu = false;
                    }
                    break;
                case 5:
                    conta01.verificarchequespecial();
                    System.out.println("Deseja voltar ao menu?[s/n]");
                    respMenu = scanner.next();
                    if (respMenu.equals("s")) {
                        break;
                    } else if (respMenu.equals("n")) {
                        rodarMenu = false;
                    }
                    break;
                default:
                    System.err.println("OPÇÂO INVÁLIDA");
                    break;

            }
        }
        }catch (InputMismatchException e){
    System.err.println("DIGITE APENAS NÚMEROS");
}













    }

}
