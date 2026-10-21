public class PetMachine {

    private boolean clean = true;

    private int water = 30;

    private int shampoo = 10;

    private Pet pet ;


    public void takeAShower(){
        if (this.pet == null){
            System.out.println("Coloque o pet na máquina para iniciar o banho");
            return;
        }
        if (this.pet.isClean()){
            System.out.println("O pet " + pet.getName() + " já está limpo, retire ele da máquina.");
            return;
        }
        if (this.water == 0 || this.shampoo == 0){
            System.out.println("Não foi possível dar banho. Verifique a água e o shampoo!");
            return;
        }
        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + " está limpo");
    }

    public void addWater(){
        if (water == 30){
            System.out.println("A capacidade de água da máquina está no máximo");
            return;
        }

        water += 2;
        System.out.println("Foi adicionado mais 2 litros de água na máquina");
    }

    public void addShampoo(){
        if (shampoo == 10){
            System.out.println("A capacidade de shampoo da máquina está no máximo");
            return;
        }

        shampoo += 2;
        System.out.println("Foi adicionado mais 2 litros de água na máquina");
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet(){
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.clean){
            System.out.println("A máquina está suja, para colocar pet é necessário limpá-la");
            return;
        }
        if (hasPet()){
            System.out.println("O pet " + this.pet.getName() + " está na máquina nesse momento");
            return;
        }
        this.pet = pet;
        System.out.println("O pet " + pet.getName() + " foi colocado na máquina");
    }

    public void removePet(){
        this.clean = this.pet.isClean();
        System.out.println("O pet " + this.pet.getName() + " foi removido da máquina");
        this.pet = null;

    }

    public void cleanMachine(){
        if (hasPet()){
            System.out.println("Não é possível limpar a máquina com um pet dentro");
            return;
        }
        if (this.clean){
            System.out.println("A máquina já está limpa. O pet pode ser colocado");
            return;
        }
        if(this.water <= 2 || this.shampoo < 0){
            System.out.println("Não foi possível limpar a máquina. Verifique a água e o shampoo!");
            return;
        }
        this.water -= 3;
        this.shampoo -= 1;
        this.clean = true;
        System.out.println("A máquina foi limpa!");
    }
}
