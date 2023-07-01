public class Main {

    public static void main(String[] args) {

        CreditBankAccount account = new CreditBankAccount("Bob", 5000, 10, 5);

        System.out.println(account.getCreditTotalInterestAmount());
        System.out.println(account.getYearlyInterestRate());
        System.out.println(account.totalCreditAmount());
        System.out.println(account.creditInstallment());
        System.out.println(account.amountRemaining(2));
        System.out.println(account.getBankAccountType());
        System.out.println(account.getNameOfCreditOwner());

    }
}