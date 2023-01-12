package exercice;

public interface IPaiementStrategy {
    public boolean validate();
    public void pay(double montant);
}
