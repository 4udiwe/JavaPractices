package task2;

public class Main2 {
    public static void main(String[] args) {
        VictorianChair victorianChair = new ChairFactory().createVictorianChair();
        MagicChair magicChair = new ChairFactory().createMagicChair();
        FunctionalChair functionalChair = new ChairFactory().createFunctionalChair();

        Client client = new Client();

        client.setChair(victorianChair);
        client.sit();

        client.setChair(magicChair);
        client.sit();
        magicChair.doMagic();

        client.setChair(functionalChair);
        client.sit();
        System.out.println(functionalChair.sum(2, 3));
    }
}
