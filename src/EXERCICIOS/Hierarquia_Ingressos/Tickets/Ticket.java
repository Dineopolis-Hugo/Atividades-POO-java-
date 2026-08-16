package EXERCICIOS.Hierarquia_Ingressos.Tickets;

public sealed abstract class Ticket permits Family_ticket, Full_Ticket, Half_Price_Ticket {

    private String filmName;
    private double price ;
    private String dubOrLegendado;

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }
    public abstract void calcularPreco();

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDubOrLegendado() {
        return dubOrLegendado;
    }

    public void setDubOrLegendado(String dubOrLegendado) {
        this.dubOrLegendado = dubOrLegendado;
    }
}


