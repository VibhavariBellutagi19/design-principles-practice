package main.srp.solution;

public class PersistentInvoice {
    Invoice invoice;
    public PersistentInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToFile(String fileName){

        System.out.println("Saving the invoice to the file - " + fileName);
    }
}
