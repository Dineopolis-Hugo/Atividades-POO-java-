package EXERCICIOS.Hierarquia_Ingressos.Tickets;

public final class Half_Price_Ticket extends Ticket {

    private int price;


    @Override
    public void calcularPreco() {
        setPrice(25);
    }
}
