package EXERCICIOS.Disparo_msg_INTERFACE;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Celular_main {
   private static final Scanner  scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int option;

            while (true) {
                System.out.println("Digite onde você quer disparar a mensagem");
                System.out.println("1- Enviar mensagem no SMS");
                System.out.println("2- Enviar mensagem no whatsapp");
                System.out.println("3- Enviar mensagem no email");
                System.out.println("4- Enviar mensagem nas redes sociais");
                System.out.println("0- Sair do programa");
try {
    option = scanner.nextInt();

    if (option == 1) {
        System.out.println(msgSMS());
    } else if (option == 2) {
        System.out.println(msgZAP());
    } else if (option == 3) {
        System.out.println(msgEmail());
    } else if (option == 4) {
        System.out.println(msgRedesSociais());
    } else if (option == 0) {
        break;

    } else {
        System.err.println("ESCOLHA UMA OPÇÃO VÁLIDA");

    }
        }catch (InputMismatchException e){
            System.err.println("DIGITE APENAS NÚMEROS");
                scanner.nextLine();
                //tratamento de exception, esse scanner NEXTLINE é essencial
                //pois ele "joga fora" o q é inválido e continua o loop
        }
            }

            }




        private static String msgSMS () {
            SMS sms = new SMS();
            System.out.println("Digite a mensagem para ser enviada");
            scanner.nextLine();
            //para limpar o buffer
            return sms.Dispararmensagem(scanner.nextLine());
        }

        private static String msgZAP () {
            ZAP zap = new ZAP();
            System.out.println("Digite a mensagem para ser enviada");
            scanner.nextLine();
            //para limpar o buffer
            return zap.Dispararmensagem(scanner.nextLine());
        }

        private static String msgEmail () {
            EMAIL email = new EMAIL();
            System.out.println("Digite a mensagem para ser enviada");
            scanner.nextLine();
            //para limpar o buffer
            return email.Dispararmensagem(scanner.nextLine());
        }

        private static String msgRedesSociais () {
            Redes_Sociais redesSociais = new Redes_Sociais();
            System.out.println("Digite a mensagem para ser enviada");
            scanner.nextLine();
            //para limpar o buffer
            return redesSociais.Dispararmensagem(scanner.nextLine());
        }

}



