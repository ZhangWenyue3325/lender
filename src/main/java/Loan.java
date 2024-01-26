public class Loan {
    private int amount;
    private String borrower;
    private boolean isPaid;
    private double interestRate;
    private String contactNumber;

    //create a constructor, use right click and generate function
    public Loan(int amount, String borrower, double interestRate, String contactNumber) {
        this.amount = amount;
        this.borrower = borrower;
        this.interestRate = interestRate;
        this.contactNumber = contactNumber;
        this.isPaid = false;
    }

    //use generate function to set getter and setter
    public int getAmount() {
        return amount;
    }

    public String getBorrower() {
        return borrower;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
