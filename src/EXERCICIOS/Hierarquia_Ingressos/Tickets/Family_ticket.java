package EXERCICIOS.Hierarquia_Ingressos.Tickets;

public final class Family_ticket extends Ticket {
int familySize;

    @Override
    public void calcularPreco() {
        setPrice(50 * familySize);
            if (familySize >3 ){
                double desconto = getPrice() * 0.05;
                setPrice(getPrice()-desconto);
   }
    }

    public int getFamilySize() {
        return familySize;
    }

    public void setFamilySize(int familySize) {
        this.familySize = familySize;
    }
}
