package Ali;

public class TransactionManagement {
    private static double confirmedIncome;
    private static double anticipatedIncome;
    private static double TotalIncome = confirmedIncome + anticipatedIncome;
    private static Transaction[] transactions = new Transaction[5];

    public static double getConfirmedIncome() {
        return confirmedIncome;
    }

    public static double getAnticipatedIncome() {
        return anticipatedIncome;
    }

    public static double getTotalIncome() {
        return TotalIncome;
    }

    public static Transaction[] getTransactions() {
        return transactions;
    }

    public static void setTransactions(Transaction[] transactions) {
        TransactionManagement.transactions = transactions;
    }
}
