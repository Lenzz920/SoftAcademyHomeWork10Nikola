public class CreditBankAccount {

    private final String nameOfCreditOwner;
    private final double principal;
    private final double creditTotalInterestAmount;
    private final double yearlyInterestRate;
    private final double years;
    private final static String BANK_ACCOUNT_TYPE = "Credit Type";

    public CreditBankAccount(String nameOfCreditOwner, double principal, double yearlyInterestRate, double years) {
        this.nameOfCreditOwner = nameOfCreditOwner;
        this.principal = principal;
        this.yearlyInterestRate = yearlyInterestRate / 100;
        this.years = years;
        this.creditTotalInterestAmount = principal * this.yearlyInterestRate * years;
    }

    public double totalCreditAmount() {
        return principal + creditTotalInterestAmount;
    }

    public double amountRemaining(int monthsPaid) {
        return totalCreditAmount() - (monthsPaid * creditInstallment());
    }

    //payments are owned each month
    public double creditInstallment() {
        return totalCreditAmount() / (years * 12);
    }

    public double getCreditTotalInterestAmount() {
        return creditTotalInterestAmount;
    }

    public double getYearlyInterestRate() {
        return yearlyInterestRate;
    }

    public String getNameOfCreditOwner() {
        return nameOfCreditOwner;
    }

    public String getBankAccountType() {
        return BANK_ACCOUNT_TYPE;
    }

}
