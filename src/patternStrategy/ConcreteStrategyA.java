package patternStrategy;

public class ConcreteStrategyA implements IStrategy{
    @Override
    public void applyStrategy() {
        System.out.println("Algo de la strategy A");
    }
}
