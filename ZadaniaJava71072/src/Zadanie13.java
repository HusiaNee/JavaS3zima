import java.util.Scanner;
public class Zadanie13 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj saldo konta bankowego:");
        double accountBalance = scan.nextDouble();
        //double accountBalance = 5000.0;
        double opłata = accountBalance * 0.10;
        System.out.println("Opłata za prowadzenie konta wynosi: " + opłata);
        scan.close();
    }
}