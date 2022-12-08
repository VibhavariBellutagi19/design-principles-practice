package main.srp.solution;

public class PrintInvoice {
    Invoice invoice;

    public PrintInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public void getInvoice() {
        System.out.println(invoice.quantity + "x " + invoice.book.name + " " +  invoice.book.price + "$");
        System.out.println("Discount Rate: " + invoice.discountRate);
        System.out.println("Tax Rate: " + invoice.taxRate);
        System.out.println("Total: " + invoice.total);
    }
}
