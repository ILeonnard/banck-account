import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("NAME: ");
        String clientName = sc.next();
        System.out.print("AGENCY: ");
        String agency = sc.next();
        System.out.print("ACCOUNT NUMBER: ");
        int number = sc.nextInt();
        System.out.print("INITIAL BALANCE: ");
        double balance = sc.nextDouble();

        TerminalAccount account = new TerminalAccount(number, agency, clientName, balance);

        System.out.println("Hello "+ account.getClientName()
                + ", thank you for create an account in our bank, your agency is "
                + account.getAgency() + " , account "
                + account.getNumber() + " and your balance "
                + account.getBalance() + " is ready to withdraw!");
    }
}