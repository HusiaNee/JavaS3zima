import java.util.Scanner;
public class Zadanie15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj kod koloru (R - Red, G - Green, B - Blue): ");
        String color = scan.next();
        String nazwa = switch (color) {
            case "R","r" -> "Czerwony";
            case "G","g" -> "Zielony";
            case "B","b" -> "Niebieski";
            default -> "Nieprawidłowy kod koloru";
        };
        System.out.println("Pełna nazwa koloru to: " + nazwa);
        scan.close();
    }
}