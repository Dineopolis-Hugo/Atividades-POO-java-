package EXERCICIOS.SistemaVendas;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int profile;
        byte escolhaFunc;
        boolean rodarMenu = true;
        String respMenu;

        //TODO: TERMINAR SISTEMA INTERFACE, fzr func voltar menu E TESTAR SISTEMA

        System.out.println("Digite seu email");
            String email = scanner.nextLine();
        System.out.println("Digite seu nome");
            String nome = scanner.nextLine();
        System.out.println("Digite sua senha");
        String senha =scanner.nextLine();





do {
    System.out.println("Crie seu login");
    System.out.println("1- Gerente");
    System.out.println("2- Vendedor");
    System.out.println("3- Atendente");
     profile= scanner.nextInt();

    if (profile > 3 || profile< 1){
        System.err.println("DIGITE UM NÚMERO VÁLIDO");
    }
}
while (profile < 1 || profile > 3);

        Empregado user = null;
        //Var USER geral
switch (profile){

    case 1:
         user = new Gerente(email,nome,senha);
         //TRANSFORMANDO VAR "USER" EM UM OBJETO ESPECÍFICO (GERENTE)

        System.out.printf("bem vindo: " + user.getNome() + " %nSeu email: "+ user.getEmail());
        System.out.println(" ");

        break;

    case 2: user = new Vendedor(email,nome,senha);
        //TRANSFORMANDO VAR "USER" EM UM OBJETO ESPECÍFICO (VENDEDOR)

        System.out.printf("bem vindo: " + user.getNome() + " %nSeu email: " + user.getEmail());
        System.out.println(" ");
        break;

    case 3: user = new Atendente(email,nome,senha);
        //TRANSFORMANDO VAR "USER" EM UM OBJETO ESPECÍFICO (ATENDENTE)

        System.out.printf("bem vindo: " + user.getNome() + " %nSeu email: " + user.getEmail());
        System.out.println(" ");
        break;

                                   //FIM CRIAÇÃO LOGIN
}
                //TODO: IMPLANTAR LOGIN
        System.out.println("----------LOGIN----------");
        user.verifyLogin();

    //MENU
        while(rodarMenu== true){
            System.out.println("0- Realizar logoff");
            System.out.println("1- Alterar dados");
            System.out.println("2- Alerar senha");
            System.out.println("3- Ver dados ");

            if(user instanceof Gerente){
                System.out.println("4- Gerar relatório financeiro");
                System.out.println("5- Consultar vendas");
            }
            else if (user instanceof Vendedor) {
                System.out.println("4- Realizar vendas");
                System.out.println("5- Consultar vendas");
            }
            else {
                System.out.println("4- Receber pagamentos");
                System.out.println("5- Fechar caixa");
                System.out.println("6- Abrir caixa");
            }
            escolhaFunc = scanner.nextByte();
            //Byte armazena numeros pequenos e ocuma menos memória
            //de -128 à 127





switch (escolhaFunc) {
    case 0:
        user.logoff();
            break;

    case 1:
        user.alterarDados();
        voltarmenu(scanner);

            break;
    case 2:
        user.mudarSenha();
        voltarmenu(scanner);
            break;
    case 3:
        user.verSeusDados();
        voltarmenu(scanner);
            break;
    case 4:
        if (user instanceof Gerente gerente) {
            gerente.relatorioFinanceiro();
        } else if (user instanceof Vendedor vendedor) {
            vendedor.realizarVendas();
        } else if (user instanceof Atendente atendente) {
            atendente.receberPagamentos();
        }
        voltarmenu(scanner);
            break;
    case 5:
        if (user instanceof Gerente gerente) {
            gerente.getVendasGe();
        } else if (user instanceof Vendedor vendedor) {
            vendedor.consultaVendas();
        } else if (user instanceof Atendente atendente) {
            atendente.fecharCaixa();
        }
        voltarmenu(scanner);
            break;
    case 6:
        if (user instanceof Atendente atendente) {
            atendente.abrirCaixa();
        } else {
            System.err.println("OPÇÃO INVÁLIDA");
        }
        voltarmenu(scanner);
            break;
    default: {
        System.err.println("OPÇÃO INVÁLIDA");
        voltarmenu(scanner);

            break;
     }
    }
}


         }


    public static void voltarmenu(Scanner scanner){
        boolean rodarMenu = true;
        String respMenu;

        do {
            System.out.println("Deseja voltar ao menu?[s/n]");
            respMenu = scanner.next();
            if (respMenu.equalsIgnoreCase("S"))
                break;
            else if (respMenu.equalsIgnoreCase("N"))
                rodarMenu = false;
        }
        while (respMenu.equalsIgnoreCase("S") && respMenu.equalsIgnoreCase("N"));
        if (!respMenu.equalsIgnoreCase("S") && !respMenu.equalsIgnoreCase("N")) {
            System.err.println("DIGITE APENAS [S] OU [N]");
        }

    }
}

