package exercice;

public class PaymentContext {
    private IPaiementStrategy strategy;


    public boolean makePayment(double montant) {
        if (strategy.validate()) {
            strategy.pay(montant);
            return true;
        }else {
            return false;
        }
    }

    public PaymentContext(){
        this.strategy = new DefaultStrategy();
    }

    public void setStrategy(IPaiementStrategy strategy){
        this.strategy = strategy;
    }

}
