package exercice;

import exercice.utils.Constants;

public class CreditCardPayment implements IPaiementStrategy{
    private String numCarte;
    private double solde;

    public CreditCardPayment(String numCarte, double solde) {
        this.numCarte = numCarte;
        this.solde = solde;
    }

    public boolean validate() {
        return true;

    }

    public void pay(double montant) {
        double totalmontant = montant + (montant * Constants.CREDIT_CARD_FEE);
        System.out.println("Total montant envoyé depuis carte de crédit : "+ totalmontant);

    }
}
