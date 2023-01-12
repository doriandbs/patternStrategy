package exercice;

public class DefaultStrategy implements IPaiementStrategy{

    public boolean validate() {
        return true;
    }

    public void pay(double montant) {
        System.out.println("Paiement " + montant + " pour le paiement pas défaut");
    }
}
