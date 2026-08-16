package EXERCICIOS.SistemaVendas;

public final class Gerente extends Empregado{
    private boolean adm = true;
    private  int vendasGe = (int) (Math.random() * 100) +1;

    public Gerente(String email, String nome, String senha) {
        super(email,nome,senha);
        //Construtor da classe filha recebendo informações do construtor da classe pai (EMPREGADO)
    }

    //random gera número aleatorio de 0 até 1 (decimal)
    // |(int)| typecast pra virar um número inteiro
    //|*100| multiplica o número inicial,transformando o numero de 1 à 99
    // +1 para ficar 100

    public int getVendasGe() {
        return vendasGe;
    }

    public void relatorioFinanceiro(){
        System.out.println("QUANTIDADE DE VENDAS");

        System.out.println("VALOR TOTAL ARRECADADO");

        System.out.println("SITUAÇÃO CAIXA:" + getCaixa());

    }

    @Override
    public void realizarVendas() {
        if (getCaixa().equals("ABERTO")){
            vendasGe++;
            System.out.println("Total de vendas do GERENTE" + getVendasGe());
        }
        else {
            System.out.println("ABRA O CAIXA PARA REALIZAR VENDAS");
        }

    }

    @Override
    public void consultaVendas() {
        System.out.println("Total de vendas: " + getVendasGe());
    }



    }

