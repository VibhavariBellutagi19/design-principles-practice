package main.srp.voilationofprinciple;

public class Invoice {

    private Book book;
    private int quantity;
    private double discountRate;
    private double taxRate;
    private double total;

    public Invoice(Book book, int quantity, double discountRate, double taxRate) {
        this.book = book;
        this.quantity = quantity;
        this.discountRate = discountRate;
        this.taxRate = taxRate;
        this.total = calculateTotalAmount();
    }

    // calculate total amount
    public double calculateTotalAmount() {
        double price = ((book.price - (book.price * discountRate)) * this.quantity);

        double priceWithTaxes = price * (1 + taxRate);

        return priceWithTaxes;
    }

    // print invoice
    /*
         - First violation. this class is meant to calculate the total amount only.
         therefore the reason to change class should be only one and that reason should
          be a change in the invoice calculation for our class.
     */
    public void getInvoice() {
        System.out.println(quantity + "x " + book.name + " " +          book.price + "$");
        System.out.println("Discount Rate: " + discountRate);
        System.out.println("Tax Rate: " + taxRate);
        System.out.println("Total: " + total);
    }

    // save the invoice to file
    /*
        - Second violation, same as above, the reason to change the class should be only one and that reason should
          be a change in the invoice calculation for our class.
     */
    public void saveToFile(){
        System.out.println("Creates a file with given name and writes the invoice");
    }
}
