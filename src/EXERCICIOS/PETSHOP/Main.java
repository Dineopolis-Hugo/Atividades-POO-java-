package EXERCICIOS.PETSHOP;

import java.util.Scanner;

public class Main {
    private final  static Scanner scanner =  new Scanner(System.in);

    private final static PetMachine petmachine = new PetMachine();

    public static void main(String[] args) {

        scanner.useDelimiter("\\n");
        int option = -1 ;

        do {
            System.out.println("===Escolha uma dessas opções===");
            System.out.println("1 Dar banho no pet");
            System.out.println("2 Abastecer a máquina com água");
            System.out.println("3 Abastecer máquina com shampoo");
            System.out.println("4 Verificar água da máquina");
            System.out.println("5 Verificar shampoo da máquina");
            System.out.println("6 Verificar se tem pet no banho");
            System.out.println("7 colocar pet na máquina");
            System.out.println("8 retirar pet da máquina");
            System.out.println("9 Limpar a máquina");
            System.out.println("0 sair");

            System.out.println("Escolha sua opção");
            option = scanner.nextInt();

            switch (option) {
                case 1-> petmachine.takeAShower();
                case 2-> setWater();
                case 3-> setShampoo();
                case 4-> verifywater();
                case 5-> verifyShampoo();
                case 6-> checkHasPetInMachine();
                case 7-> setPetInMachine();
                case 8-> petmachine.removePet();
                case 9-> petmachine.wash();
                case 0-> System.exit(0);
                default -> System.out.println("Opção inválida");

            }
        }
        while (true);


    }
    private static void setWater(){
        System.out.println("Tentando colocar água na máquina");
        petmachine.addWater();
    }
    private static void setShampoo(){
        System.out.println("Tentando colocar Shampoo na máquina");
        petmachine.addShampoo();
    }
    private static void verifywater() {
        var amount =petmachine.getWater();
        System.out.println("A máquina está com " + amount + " Litro(s) de água");
    }
    private static void verifyShampoo() {
        var amount =petmachine.getShampoo();
        System.out.println("A máquina está com " + amount + " Litro(s) de shampoo");
    }

    private static void checkHasPetInMachine() {
        var haspet =  petmachine.hasPet();
        System.out.println(haspet ? "Tem pet na máquina" : "Não tem pet na máquina");
    }

    public static void setPetInMachine(){
        var name = "";
        while (name== null || name.isEmpty()){
            System.out.println("Digite o nome do pet:");
            name = scanner.next();
        }
        var Pet = new Pet(name);
        petmachine.setPetInMachine(Pet);

    }

}
