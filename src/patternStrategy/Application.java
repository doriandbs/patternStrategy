package patternStrategy;

import patternStrategy.Context;

public class Application {
    public static void main(String[] args) {
        Context context = new Context();

        context.process();
        System.out.println("--------------------");
        context.setStrategy(new ConcreteStrategyA());
        context.process();
        System.out.println("--------------------");
        context.setStrategy(new ConcreteStrategyC());
        context.process();
        System.out.println("--------------------");




    }
}
