import java.util.Scanner;

public class Zadanie18 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj swój dochód:");
        double dochod = scan.nextDouble();

        double podatek;

        if (dochod <= 85528) {
            podatek = dochod * 0.18 - 556.02;
        } else {
            podatek = 14839.02 + (dochod - 85528) * 0.32;
        }

        if (podatek < 0) {
            podatek = 0;
        }

        System.out.println("Należny podatek dochodowy wynosi: " + podatek);

        scan.close();
    }
}