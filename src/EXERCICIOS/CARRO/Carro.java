package EXERCICIOS.CARRO;

public class Carro {

    private int Velocidade = 0;
    private int Marcha = 0 ;
    private boolean CarroLigado = false;


    public void ligarCarro(){
        CarroLigado = true;
        System.out.println("Ligando Carro");
    }

    public void desligarCarro(){
        if (!CarroLigado){
            System.err.println("O CARRO JÁ ESTÁ DESLIGADO");
                return;
            //se a VAR CarroLigado for false printa a mensagem abaixo
            //return pra não executar o resto
        }
        if (Marcha == 0 && Velocidade == 0){
            CarroLigado = false;
            System.out.println("Desligando Carro");
        }
        if (Marcha > 0 || Velocidade > 0){
            System.err.println("A MARCHA E A VELOCIDADE PRECISAM ESTAR EM ZERO");
        }
    }

    public void passarMarcha(){
        if (!CarroLigado){
            System.err.println("LIGUE O CARRO ANTES DE INICIAR ESSA AÇÃO");
                return;
        }
        if (CarroLigado == true && Marcha==6) {
            System.err.println("O CARRO ESTÁ NA MARCHA MÁXIMA");
        }
        if(CarroLigado == true && Marcha ==0 && Velocidade == 0 ){
            Marcha++;
        }
        else if (CarroLigado == true && Marcha== 1 && Velocidade == 20 ){
            Marcha++;
        } else if (CarroLigado == true && Marcha == 2 && Velocidade ==40) {
            Marcha++;
        } else if (CarroLigado == true && Marcha == 3 && Velocidade ==60) {
            Marcha++;
        } else if (CarroLigado == true && Marcha == 4 && Velocidade == 80) {
            Marcha++;
        } else if (CarroLigado == true && Marcha == 5 && Velocidade == 100) {
            Marcha++;
        }
        else {
            System.err.println("Velocidade incompatível para mudar de marcha");
                return;
        }
        System.out.println("Passando marcha");
        System.out.println("Marcha Atual: " + Marcha);
    }

    public void voltarMarcha(){
        if(!CarroLigado){
            System.err.println("LIGUE O CARRO ANTES DE INICIAR ESSA AÇÃO");
                return;
        }
        if (CarroLigado == true && Marcha == 0){
            System.err.println("O CARRO ESTÁ NA MARCHA MÍNIMA");
        }
        if (CarroLigado == true && Marcha == 6 && Velocidade <101){
            Marcha--;
        }
        else if (CarroLigado == true && Marcha == 5 && Velocidade < 81) {
            Marcha--;
        }
        else if (CarroLigado == true && Marcha == 4 && Velocidade < 61){
            Marcha--;
        }
        else if (CarroLigado == true && Marcha == 3 && Velocidade < 41){
            Marcha--;
        }
        else if (CarroLigado == true && Marcha == 2 && Velocidade < 21 ){
            Marcha--;
        } else if (CarroLigado == true && Marcha == 1 && Velocidade <= 20) {
            Marcha--;
        }
        else {
            System.err.println("Velocidade imcompatível para voltar Marcha");
        }
        System.out.println("Voltando Marcha");
        System.out.println("Marcha Atual: " + Marcha);
    }

    public void virarEsquerda(){
        if(!CarroLigado){
            System.err.println("LIGUE O CARRO ANTES DE INICIAR ESSA AÇÃO");
                return;
        }
        if (CarroLigado == true && Velocidade > 0 && Velocidade < 41) {
            System.out.println("Virando Para Esquerda");
        }
        else {
            System.err.println("SUA VELOCIDADE PRECISSA ESTAR ENTRE 1 E 40 PARA VIRAR");
        }
    }

    public void virarDireita(){
        if(!CarroLigado){
            System.err.println("LIGUE O CARRO ANTES DE INICIAR ESSA AÇÃO");
                return;
        }
        if (CarroLigado == true && Velocidade > 0 && Velocidade < 41) {
            System.out.println("Virando Para Direita");
        }
        else {
            System.err.println("SUA VELOCIDADE PRECISSA ESTAR ENTRE 1 E 40 PARA VIRAR");
        }
    }

    public void acelerar(){
        //fazer regra de limitar velocidade por marcha
        if(!CarroLigado){
            System.err.println("LIGUE O CARRO ANTES DE INICIAR ESSA AÇÃO");
                return;
        }
        if( Marcha == 1 && Velocidade < 20) {
            Velocidade++;
        }
        else if ( Marcha == 2 && Velocidade < 40) {
            Velocidade++;
        }
        else if (Marcha ==3 && Velocidade < 60) {
            Velocidade++;
        }
        else if (Marcha ==4 && Velocidade < 80) {
            Velocidade++;
        }
        else if (Marcha ==5 && Velocidade < 100) {
            Velocidade++;
        }
        else if (Marcha ==6 && Velocidade < 120) {
            Velocidade++;
        }
        else {
            System.err.println("PASSE A MARCHA PARA AUMENTAR A VELOCIDADE");
        }
        System.out.println("Acelerando");
        //A parte de perguntar se quer acelerar mais é na main
        System.out.println("Velocidade: " + Velocidade);
        }

    public  void frear(){
        if(!CarroLigado){
            System.err.println("LIGUE O CARRO ANTES DE INICIAR ESSA AÇÃO");
                return;
        }
        if(CarroLigado == true && Marcha > 0 && Velocidade > 0){
            Velocidade--;
            System.out.println("Freando");
            System.out.println("Velocidade: " + Velocidade);
        }
        if(Velocidade == 0){
            System.err.println("A VELOCIDADE JÁ ESTÁ EM ZERO");
        }

    }

}
