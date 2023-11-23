import java.util.Scanner;
public class Zadanie11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę ujemną: ");
        int liczba = scan.nextInt();
        liczba = (liczba < 0) ? Math.abs(liczba) : liczba;
        System.out.println("Liczba po zamianie na wartość dodatnią to: " + liczba);
    }
}
