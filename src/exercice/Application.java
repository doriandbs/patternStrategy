package exercice;



public class Application {
    public static void main(String[] args) {
        //Créer le context
        PaymentContext paymentContext = new PaymentContext();

        //PAIEMENT PAR CREDITCARD
        CreditCardPayment creditCardPayment = new CreditCardPayment("1222222222222222", 1);
        paymentContext.setStrategy(creditCardPayment);

        boolean creditCardPaymentStatus = paymentContext.makePayment(500.00);
        if (creditCardPaymentStatus) {
            System.out.println("Paiement réussi par carte de crédit");
        } else {
            System.out.println("Paiement non réussi par carte de crédit");
        }


        //PAIEMENT PAR VIREMENT BANCAIRE
        BankTransferPayment bankTransferPayment = new BankTransferPayment("0000000000", 1);
        paymentContext.setStrategy(bankTransferPayment);

        boolean bankTransferPaymentStatus = paymentContext.makePayment(500.00);
        if (bankTransferPaymentStatus) {
            System.out.println("Paiement réussi par virement bancaire");
        } else {
            System.out.println("Paiement non réussi par virement bancaire");
        }


        //PAIEMENT PAR PAYPAL
        EWalletPayment eWalletPayment = new EWalletPayment("dodo@paypal.com", 100);
        paymentContext.setStrategy(eWalletPayment);

        boolean eWalletPaymentStatus = paymentContext.makePayment(200.00);
        if (eWalletPaymentStatus) {
            System.out.println("Paiement paypal réussi");
        } else {
            System.out.println("Paiement paypal non réussi");
        }




    }
}
