import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj liczbę do sprawdzenia: ");
        int liczba = scan.nextInt();
        if(liczba % 2 == 0){
            System.out.println("Podana liczba: "+liczba+" jest parzysta.");
        }
        else if (liczba % 2 != 0){
            System.out.println("Podana liczba: "+liczba+" jest nieparzysta.");
        }
        else{
            System.out.println("Podana liczba jest nieprawidłowa.");
        }
    }
}
