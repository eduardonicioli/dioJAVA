import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {
        scanner.useDelimiter("\\n");
        var option = -1;

        do{
            System.out.println("=== Escolha uma das opções ===");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer água");
            System.out.println("3 - Abastecer shampoo");
            System.out.println("4 - Verificar nível agua");
            System.out.println("5 - Verificar nível shampoo");
            System.out.println("6 - Verificar se há pet na máquina");
            System.out.println("7 - Colocar pet na máquina");
            System.out.println("8 - Retirar pet da máquina");
            System.out.println("9 - Limpar máquina");
            System.out.println("0 - Sair");
            System.out.println("==============================");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> petMachine.takeShower();
                case 2 -> setWater();
                case 3 -> setShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> checkIfHasPetInMachine();
                case 7 -> setPetInPetMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.washMachine();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida");
               
            }
        }while(option != 0);
    }

    private static void setWater() {
        System.out.println("Abastecendo água...");
        petMachine.addWater();
    }

    private static void setShampoo() {
        System.out.println("Abastecendo shampoo...");
        petMachine.addShampoo();
    }


    private static void verifyWater() {
        var amout = petMachine.getWaterLevel();
        System.out.println("Nível de água: " + amout + " litros de água");
    }


    private static void verifyShampoo() {
        var amout = petMachine.getShampooLevel();
        System.out.println("Nível de shampoo: " + amout + " litros de shampoo");
    }


    private static void checkIfHasPetInMachine() {
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Há um pet na máquina" : "Não há pet na máquina" );
    }


    public static void setPetInPetMachine(){
        var name = "";
        while (name == null || name.isEmpty()){
            System.out.println("Digite o nome do pet:");
            name = scanner.next();
        }
        var pet = new Pet(name);
        petMachine.setPet(pet);
        System.out.println("Pet " + pet.getName() + " adicionado na máquina");
    }

    
    }


