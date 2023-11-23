import java.util.Scanner;
public class Zadanie10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int liczba = scan.nextInt();
        boolean test = (liczba % 2 == 0);
        System.out.println("Czy wynik dzielenia modulo jest równy zero? " + test);
    }
}