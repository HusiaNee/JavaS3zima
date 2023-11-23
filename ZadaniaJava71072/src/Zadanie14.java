import java.util.Scanner;
public class Zadanie14 {
    public static void main(String[] args){
        //int month = 7;
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj numer miesiąca: ");
        int month = scan.nextInt();
        String nazwaMiesiaca = switch (month) {
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
        System.out.println("Pełna nazwa miesiąca: " + nazwaMiesiaca);
        scan.close();
    }
}