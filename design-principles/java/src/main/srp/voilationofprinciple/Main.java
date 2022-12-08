package main.srp.voilationofprinciple;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("Clean Architecture", "Uncle Bob", 2022, 500, "CleanArchitecture2022");
        Invoice invoice = new Invoice(book,2,0.1,0.1);

        invoice.getInvoice();
    }
}
