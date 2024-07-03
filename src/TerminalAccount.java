public class TerminalAccount {

    private int number;
    private String agency;
    private String clientName;
    private double balance;

    public TerminalAccount(){}

    public TerminalAccount(int number, String agency, String clientName, double balance) {
        this.number = number;
        this.agency = agency;
        this.clientName = clientName;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public String getAgency() {
        return agency;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public double getBalance() {
        return balance;
    }


}
