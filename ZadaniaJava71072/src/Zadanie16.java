import java.util.Scanner;
public class Zadanie16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj numer miesiąca (1-12): ");
        int miesiac = scan.nextInt();
        String nazwamiesiaca = switch(miesiac) {
            case 1 -> "Styczeń";
            case 2 -> "Luty";
            case 3 -> "Marzec";
            case 4 -> "Kwiecień";
            case 5 -> "Maj";
            case 6 -> "Czerwiec";
            case 7 -> "Lipiec";
            case 8 -> "Sierpień";
            case 9 -> "Wrzesień";
            case 10 -> "Październik";
            case 11 -> "Listopad";
            case 12 -> "Grudzień";
            default -> "BŁĄD";
        };
        String sezon = switch(miesiac) {
            case 12, 1, 2 -> "Zima";
            case 3, 4, 5 -> "Wiosna";
            case 6, 7, 8 -> "Lato";
            case 9, 10, 11 -> "Jesień";
            default -> "BŁĄD";
        };
        System.out.println("Podany miesiąc to: "+nazwamiesiaca+", Sezon: "+sezon);
        scan.close();
    }
}