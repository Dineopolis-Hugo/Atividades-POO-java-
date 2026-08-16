package EXERCICIOS.SistemaVendas;

import java.util.Scanner;

public sealed abstract class Empregado permits Atendente,Gerente,Vendedor{
    Scanner scanner = new Scanner(System.in);

   private String nome;
    private String email;
    private String senha;
    private boolean adm;
    private String caixa = "FECHADO";

    public Empregado(String email, String nome, String senha) {
        this.email= email;
        this.nome= nome;
        this.senha=senha;
       //na classe mãe eu defino atributos com o ".this"
        //e as filhas vão com SUPER, puxando as infos com a classe mãe
    }


    public int getValorCaixa() {
        return valorCaixa;
    }

    public void setValorCaixa(int valorCaixa) {
        this.valorCaixa = valorCaixa;
    }

    private int valorCaixa = 100;

    public boolean isAdm() {
        return adm;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCaixa() {
        return caixa;
    }

    public void setCaixa(String caixa) {
        this.caixa = caixa;
    }


    public void login() {
        System.out.println("DIGITE SEU EMAIL");
             setEmail(scanner.nextLine());
        System.out.println("CRIE UMA SENHA");
        setSenha(scanner.nextLine());

    }
    public void verifyLogin(){
        String respEmail;
        String respSenha;
        do {
            System.out.println("Digite seu email");
            respEmail = scanner.nextLine();
            if (respEmail.equals(getEmail())){
                System.out.println("Email válido");
            }
            else {
                System.err.println("Email inválido");
            }
        }
        while (!respEmail.equals(getEmail()));

do{
    System.out.println("Digite sua senha");
    respSenha= scanner.nextLine();
    if(respSenha.equals(getSenha())){
        System.out.println("Senha correta");
    }
    else {
        System.err.println("Senha incorreta");
    }
}
while (!respSenha.equals(getSenha()));

    }

    public void verSeusDados(){
        System.out.printf("Nome: " + getNome() + "%nEmail: " + getEmail() );
        System.out.printf("Senha " + getSenha() + "%nÉ ADM?: " + isAdm() );
    }

    public void logoff() {
        System.exit(0);
    }

    public void alterarDados() {
        int respMudarDados;
        do {
            System.out.println("VOCÊ DESEJA ALTERAR QUAL DADO?");
            System.out.println("1. Email");
            System.out.println("2. Nome");
            respMudarDados = scanner.nextInt();
            scanner.nextLine();
        }
        while (respMudarDados < 1  || respMudarDados > 2);
        //Fica no loop enquanto a resposta for maior que 2 OU menor que 1

        if (respMudarDados == 1) {
            System.out.println("Digite o novo email");
            setEmail(scanner.nextLine());
        }
        else {
            System.out.println("Digite o novo nome");
                setNome(scanner.nextLine());
        }
    }
    public void mudarSenha(){
        System.out.println("DIGITE A NOVA SENHA");
            setSenha(scanner.nextLine());
    }

    public abstract void realizarVendas();

    public abstract void consultaVendas();

    public void fecharCaixa(){
        if (!caixa.equals("FECHADO")){
            System.out.printf("Sucesso na operação%n "+"Situação atual: CAIXA FECHADO");
        }
        else {
            System.err.println("O CAIXA JÁ ESTÁ FECHADO");
        }

    }
    public void abrirCaixa(){
        if(!caixa.equals("ABERTO")){
            System.out.printf("Sucesso na operação%n "+"Situação atual: CAIXA ABERTO");
        }
        else{
            System.err.println("O CAIXA JÁ ESTÁ ABERTO");
        }
    }


}
