import java.util.Scanner;
public class Zadanie7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //if/else if/else
        System.out.println("Podaj wartość (liczba lub tekst):");
        if (scan.hasNextInt()) {
            int wartosc = scan.nextInt();
            System.out.println("Wprowadzona wartość to liczba typu int.");
        } else if (scan.hasNextDouble()) {
            double wartosc = scan.nextDouble();
            System.out.println("Wprowadzona wartość to liczba typu double.");
        } else {
            String wartosc = scan.next();
            System.out.println("Wprowadzona wartość to tekst.");
        }
        //switch
        System.out.println("Podaj literę (a-z):");
        char znak = scan.next().charAt(0);
        String info;
        switch (znak) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
                info = "Podany znak jest samogłoską.";
                break;
            case 'b':
            case 'c':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'p':
            case 'r':
            case 's':
            case 't':
            case 'w':
            case 'z':
                info = "Podany znak jest spółgłoską.";
                break;
            default:
                info = "Podany znak nie jest literą lub nieznany.";
                break;
        }
        System.out.println(info);

        //ternary sprawdza czy _>=18 ? "to" prawda : fałsz
        System.out.println("Podaj wiek:");
        int wiek = scan.nextInt();
        String status = (wiek >= 18) ? "Dorosły" : "Nieletni";
        System.out.println("Status wiekowy: " + status);

        scan.close();
    }
}