package patternStrategy;

public class ConcreteStrategyC implements IStrategy{
    @Override
    public void applyStrategy() {
        System.out.println("Algo de la strategy C");
    }
}
