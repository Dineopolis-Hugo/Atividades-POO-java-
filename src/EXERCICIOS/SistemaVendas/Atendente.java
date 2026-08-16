package EXERCICIOS.SistemaVendas;


public final class Atendente extends Empregado {
    private boolean adm = false;
    private int vendasAt = (int) (Math.random() * 100) +1;

    public Atendente(String email, String nome, String senha) {
        super(email, nome, senha);
    }

    public int getVendasAt() {
        return vendasAt;
    }

    @Override
    public void realizarVendas() {
        if(getCaixa().equals("ABERTO")){
            vendasAt++;
            System.out.printf("Venda realizada%n " + " Total de vendas " + getVendasAt());
        }
        else {
            System.err.println("ABRA O CAIXA PARA REALIZAR VENDAS");
        }


    }


    @Override
    public void consultaVendas() {
        System.out.println("Total de vendas: " + getVendasAt() );
    }

    public void receberPagamentos(){
        int pagamento = (int) (Math.random() * 100) +1;

        System.out.println("Pagamento no valor de " + pagamento);
        System.out.println("Valor no caixa atual: " + getValorCaixa());
    }







    }

