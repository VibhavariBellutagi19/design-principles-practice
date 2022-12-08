package main.srp.solution;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("Clean Architecture", "Uncle Bob", 2022, 500, "CleanArchitecture2022");
        Invoice invoice = new Invoice(book,2,5.0,0.1);
        PrintInvoice printInvoice = new PrintInvoice(invoice);
        PersistentInvoice persistentInvoice = new PersistentInvoice(invoice);

        printInvoice.getInvoice();
        persistentInvoice.saveToFile("2022-02-02-file.pdf");
    }
}
