import java.util.Scanner;
public class Zadanie8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean prawda = true;
        boolean warunek1 = !prawda;
        System.out.println("Negacja wartości 'prawda': " + warunek1);

        System.out.println("Podaj wiek:");
        int wiek = scan.nextInt();
        boolean warunek2 = (wiek >= 18) && (wiek <= 65);
        System.out.println("Czy wiek mieści się w zakresie 18-65? " + warunek2);

        System.out.println("Podaj znak:");
        char znak = scan.next().charAt(0);
        boolean warunek3 = (znak == 'a') || (znak == 'e') || (znak == 'i') || (znak == 'o') || (znak == 'u');
        System.out.println("Czy podany znak jest samogłoską? " + warunek3);

        System.out.println("Podaj liczbę A:");
        int liczbaA = scan.nextInt();
        boolean warunek4 = (liczbaA > 10) && (liczbaA < 20) || (liczbaA == 30); //zakres od 10-20 lub 30
        System.out.println("Warunek złożony dla liczby A: " + warunek4);

        System.out.println("Podaj liczbę B:");
        int liczbaB = scan.nextInt();
        boolean warunek5 = !(liczbaA == liczbaB) || ((liczbaA > 5) && (liczbaB < 10)); //liczba a i b nie jest rowna lub liczba a i b jest w przedziale 5-10
        System.out.println("Złożony warunek z liczb A i B: " + warunek5);
    }
}