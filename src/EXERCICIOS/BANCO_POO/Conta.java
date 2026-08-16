package EXERCICIOS.BANCO_POO;


import java.util.Scanner;

public  class Conta {

    Scanner scanner = new Scanner(System.in);

    private double saldo ;
    private final Cliente titular;
    private double chequeEspecial ;
    double chequeEspecialUsado = 0 ;

    //Cria um novo cliente titular
    public Conta(Cliente titular, double saldoInicial) {
        this.titular = titular;
        //Atribui o cliente titular a essa conta

        this.saldo = saldoInicial;
        //passa o saldo Inicial para o saldo da conta

        calcularChequeSP();
        //O método e private,n pode ser chamado na main, mas posso chamar ele no construtor
    }

    private void calcularChequeSP(){
        if(saldo <= 500.00 &&  saldo > 0.00){
            chequeEspecial = 50.00;
        }
        else if(saldo > 500.00){
            chequeEspecial = saldo /2;
        }
    }

    public void depositar(){

        System.out.println("Digite o valor do deposito");
            double deposito = scanner.nextDouble();
            saldo = saldo + deposito;
        System.out.println("Deposito realizado com sucesso");
        System.out.println(saldo);
    }
    public void sacar(){
        System.out.println("Seu saldo: " + saldo);
        System.out.println("Saldo cheque especial: " + chequeEspecial);
        System.out.println("Digite o valor do saque");
            double saque = scanner.nextDouble();
        if (saque > saldo && chequeEspecial >= saque  ){
            System.err.println("Saldo insuficiente pagamento através de cheque especial");
                chequeEspecial = chequeEspecial -  saque;
                chequeEspecialUsado = chequeEspecialUsado + saque;
                    return;
        }
        else if (saque <= saldo) {
                saldo = saldo - saque;
            System.out.println("Saque realizado com sucesso");
            System.out.println("Novo saldo: " + saldo);
        }
        else if (saque > chequeEspecial){
            System.out.println("Saldo e cheque insuficiente");
        }

    }
    public void pagarBoleto(){
        System.out.println("Digite o número do boleto");
            int boletonum = scanner.nextInt();

        System.out.println("Seu saldo: " + saldo);
        System.out.println("Saldo cheque especial: " + chequeEspecial);

        System.out.println("Digite o valor do boleto");
            double valorBoleto = scanner.nextDouble();

            if (saldo < valorBoleto && chequeEspecial >= valorBoleto){
            System.err.println("Saldo insuficiente,Pagamento realizado com cheque especial");
                chequeEspecialUsado =  chequeEspecialUsado + valorBoleto;
                chequeEspecial =  chequeEspecial - valorBoleto;

                System.out.println("Saldo cheque especial: " + chequeEspecial);
                    return;
        }
        else if (saldo > valorBoleto) {
                System.out.println("Pagamento realizado com sucesso");
                    saldo = saldo - valorBoleto;
                System.out.println("seu saldo " + saldo);
            } else if (chequeEspecial < valorBoleto) {
                System.err.println("Saldo e cheque especial insuficiente");

            }
    }
    public void consultaSaldo(){
        System.out.println("Seu saldo: " + saldo);
    }
    public void verificarchequespecial(){
        System.out.println("Seu saldo do cheque Especial: " + chequeEspecial);

        System.err.println("VALOR A PAGAR DO CHEQUE ESPECIAL " + (chequeEspecialUsado + (chequeEspecialUsado * 0.2)));

    }
 private void validarSaldoInicial(){

 }

    }





