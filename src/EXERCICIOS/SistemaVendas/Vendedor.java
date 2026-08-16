package EXERCICIOS.SistemaVendas;

public final class Vendedor extends Empregado{
    private boolean adm = false;
    private int vendasVD = (int) (Math.random() * 100) +1;

    public Vendedor(String email, String nome, String senha) {
        super(email,nome,senha);
    }
    //random gera número aleatorio de 0 até 1 (decimal)
    // |(int)| typecast pra virar um número inteiro
    //|*100| multiplica o número inicial,transformando o numero de 1 à 99
    // +1 para ficar 100

    public int getVendasVd() {
        return vendasVD;
    }

    @Override
    public void realizarVendas() {
        if(getCaixa().equals("ABERTO")){
            vendasVD++;
            System.out.printf("Venda realizada%n " + " Total de vendas " + getVendasVd());
        }
        else{
            System.err.println("ABRA O CAIXA PARA REALIZAR VENDAS");
        }


    }

    @Override
    public void consultaVendas() {
        System.out.println("Total de vendas: " + getVendasVd());
    }


}

