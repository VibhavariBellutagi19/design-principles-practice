package main.srp.solution;

public class Invoice {

    public Book book;
    public int quantity;
    public double discountRate;
    public double taxRate;
    public double total;

    public Invoice(Book book, int quantity, double discountRate, double taxRate) {
        this.book = book;
        this.quantity = quantity;
        this.discountRate = discountRate;
        this.taxRate = taxRate;
        this.total = calculateTotalAmount();
    }

    // calculate total amount
    public double calculateTotalAmount() {
        double price = ((book.price - book.price * discountRate) * this.quantity);

        double priceWithTaxes = price * (1 + taxRate);

        return priceWithTaxes;
    }
}
