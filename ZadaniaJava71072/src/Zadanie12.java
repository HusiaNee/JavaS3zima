import java.util.Scanner;
public class Zadanie12 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int zmienna = scan.nextInt();
        switch (zmienna) {
            case 1, 4, 8 -> System.out.println("Zmienna ma wartość 1, 4 lub 8.");
            case 2, 3, 7 -> System.out.println("Zmienna ma wartość 2, 3 lub 7.");
            default -> System.out.println("Zmienna ma inną wartość.");
        }
    }
}
