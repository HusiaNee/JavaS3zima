import java.util.Scanner;
public class Zadanie9 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wartość cyfrową (0-9): ");
        int wartosc = scan.nextInt();
        switch (wartosc) {
            case 0:
                System.out.println("Wartość to zero");
                break;
            case 1:
                System.out.println("Wartość to jeden");
                break;
            case 2:
                System.out.println("Wartość to dwa");
                break;
            case 3:
                System.out.println("Wartość to trzy");
                break;
            case 4:
                System.out.println("Wartość to cztery");
                break;
            case 5:
                System.out.println("Wartość to pięć");
                break;
            case 6:
                System.out.println("Wartość to sześć");
                break;
            case 7:
                System.out.println("Wartość to siedem");
                break;
            case 8:
                System.out.println("Wartość to osiem");
                break;
            case 9:
                System.out.println("Wartość to dziewięć");
                break;
            default:
                System.out.println("Nieznana wartość");
                break;
        }
    }
}
