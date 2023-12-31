package task2;

public class ChairFactory implements AbstractChairFactory{
    public VictorianChair createVictorianChair() {
        return new VictorianChair( 222);
    }

    public MagicChair createMagicChair() {
        return new MagicChair();
    }

    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}
