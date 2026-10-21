private final static Scanner scanner = new Scanner(System.in);

private final static PetMachine petMachine = new PetMachine();
void main(){
    scanner.useDelimiter("\\n");
    var option = -1;

    do {
        System.out.println("===================================");
        System.out.println("1 - Dar banho no pet");
        System.out.println("2 - Abastecer máquina a com água");
        System.out.println("3 - Abastecer máquina a com shampoo");
        System.out.println("4 - Verificar água da máquina");
        System.out.println("5 - Verificar shampoo da máquina");
        System.out.println("6 - Verificar se tem pet no banho");
        System.out.println("7 - Colocar pet na máquina");
        System.out.println("8 - Retirar pet da máquina");
        System.out.println("9 - Limpar a máquina");
        System.out.println("0 - Sair");
        System.out.println("===================================");
        System.out.print("Escolha uma das opções: ");
        option = scanner.nextInt();

        switch (option){
            case 1 -> petMachine.takeAShower();
            case 2 -> setWater();
            case 3 -> setShampoo();
            case 4 -> verifyWater();
            case 5 -> verifyShampoo();
            case 6 -> checkIfHasPetInMachine();
            case 7 -> setPetInPetMachine();
            case 8 -> petMachine.removePet();
            case 9 -> petMachine.cleanMachine();
            case 0 -> System.exit(0);
            default -> System.out.println("Opção inválida");
        }
    } while (true);

}

private static void setWater(){
    System.out.println("Tentando colocar água na máquina");
    petMachine.addWater();
}

private static void setShampoo() {
    System.out.println("Tentando colocar shampoo na máquina");
    petMachine.addShampoo();
}

private static void verifyWater() {
    var amount = petMachine.getWater();
    System.out.println("A máquina está no momento com " + amount + " litros de água");
}

private static void verifyShampoo() {
    var amount = petMachine.getShampoo();
    System.out.println("A máquina está no momento com " + amount + " litros de shampoo");
}

private static void checkIfHasPetInMachine() {
    var hasPet = petMachine.hasPet();
    System.out.println(hasPet ? "Tem pet na máquina" : "Não tem pet na máquina");
}

public static void setPetInPetMachine() {
    var name = "";
    while(name == null || name.isEmpty()){
        System.out.print("Informe o nome do pet: ");
        name = scanner.next();
    }
    var pet = new Pet(name);
    petMachine.setPet(pet);
}

