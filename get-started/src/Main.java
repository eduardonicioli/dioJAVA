import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {
        
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
            option = scanner.nextInt();

            switch (option) {
                case 7 -> setPetInPetMachine();:
                    
                    break;
            
                default:
                    break;
            }
        }while(option != 0);
    }


    public static void setPetInPetMachine(){
        System.out.println("Digite o nome do pet:");
        var name = scanner.next();
        var pet = new Pet(petName);
        petMachine.setPet(pet);
        System.out.println("Pet " + pet.getName() + " adicionado na máquina");
    }

}
