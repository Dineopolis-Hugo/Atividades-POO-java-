package EXERCICIOS.Hierarquia_Ingressos.Tickets;

public final class Full_Ticket extends Ticket {

    @Override
    public void calcularPreco() {
        setPrice(50);
    }
}