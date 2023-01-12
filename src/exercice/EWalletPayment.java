package exercice;

import exercice.utils.Constants;

public class EWalletPayment implements IPaiementStrategy{
    private String comptePaypal;
    private double soldePaypal;

    public EWalletPayment(String comptePaypal, double soldePaypal) {
        this.comptePaypal = comptePaypal;
        this.soldePaypal = soldePaypal;
    }

    public boolean validate() {
      return true;
    }

    public void pay(double montant) {
        double totalmontant = montant + montant * Constants.PAYPAL_FEE;
        soldePaypal-=totalmontant;
        System.out.println("Total montant envoyé depuis paypal : "+ totalmontant);
    }
}
