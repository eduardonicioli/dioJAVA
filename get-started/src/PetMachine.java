public class PetMachine {

    private boolean clean = true;

    private int waterLevel = 30;

    private int shampooLevel = 10;

    private Pet pet;

    public void takeShower() {
        if (this.pet == null) {
            System.out.println("Coloque o pet na máquina para iniciar o banho");
            return;       
        }

        this.waterLevel -= 10;
        this.shampooLevel -= 2;
        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + " está limpo!");

    }

    public void addWater(){
        if (waterLevel == 30){
            System.out.println("Nível de água já está cheio");
            return;
        }

        waterLevel += 2;
    }

    public void addShampoo(){
        if (shampooLevel == 10){
            System.out.println("Nível de shampoo já está cheio");
            return;
        }

        shampooLevel += 2;
    }

    public int getWaterLevel() {
        return waterLevel;
    }

    public int getShampooLevel() {
        return shampooLevel;
    }
    
    public boolean hasPet(){
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.clean){
            System.out.println("A máquina está suja, limpe-a antes de colocar um novo pet");
            return;
        }
        if (hasPet()){
            System.out.println("O pet " + this.pet.getName() + " Já está na máquina");
            return;
        }

        this.pet = pet;
    }

    public void removePet() {
        this.clean = this.pet.isClean();
        System.out.println("O Pet "+ this.pet.getName() + " está limpo e saiu da máquina");
        this.pet = null;
    }

    public void washMachine(){
        this.waterLevel -= 10;
        this.shampooLevel -= 2;
        this.clean = true;
        System.out.println("A máquina está limpa");
    }
}
