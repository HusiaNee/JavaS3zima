import java.util.Scanner;
public class Zadanie22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char operacja;
        do {
            System.out.println("Podaj pierwszą liczbę:");
            double liczba1 = scan.nextDouble();
            System.out.println("Podaj drugą liczbę:");
            double liczba2 = scan.nextDouble();
            System.out.println("Podaj operację arytmetyczną (+, -, *, /):");
            operacja = scan.next().charAt(0);

            double wynik = 0;
            switch (operacja) {
                case '+' -> wynik = liczba1 + liczba2;
                case '-' -> wynik = liczba1 - liczba2;
                case '*' -> wynik = liczba1 * liczba2;
                case '/' -> {
                    if (liczba2 != 0) {
                        wynik = liczba1 / liczba2;
                    } else {
                        System.out.println("Nie można dzielić przez zero!");
                        continue;
                    }
                }
                default -> {
                    System.out.println("Nieprawidłowa operacja!");
                    continue;
                }
            }
            System.out.println("Wynik operacji: " + wynik);
            System.out.println("Czy chcesz wykonać kolejne obliczenia? (T/N)");
            char decyzja = scan.next().charAt(0);
            if (decyzja == 'N' || decyzja == 'n') {
                break;
            }
        } while (true);
        scan.close();
    }
}