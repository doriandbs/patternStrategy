package exercice;

import exercice.utils.Constants;
import patternStrategy.ConcreteStrategyA;

public class BankTransferPayment implements IPaiementStrategy{
    private String numBank;
    private double soldeBank;

    public BankTransferPayment(String numBank, double soldeBank) {
        this.numBank = numBank;
        this.soldeBank = soldeBank;
    }

    public boolean validate() {
        return true;
    }

    public void pay(double montant) {
        double totalmontant = montant + (montant * Constants.BANK_TRANSFER_FEE);
        soldeBank-=totalmontant;
        System.out.println("Total montant envoyé depuis virement : "+ totalmontant);


    }

}
