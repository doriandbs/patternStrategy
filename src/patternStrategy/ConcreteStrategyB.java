package patternStrategy;

public class ConcreteStrategyB implements IStrategy{
    @Override
    public void applyStrategy() {
        System.out.println("Algo de la strategy B");
    }
}
