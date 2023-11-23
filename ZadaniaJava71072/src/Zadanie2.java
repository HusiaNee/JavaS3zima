import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args){
        while(true){
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj liczbę godzin: [ZATWIERDŹ ENTEREM]");
            float Godzina = scan.nextFloat();
            float Minuta = Godzina * 60;

            System.out.println("Podaj liczbę minut: [ZATWIERDŹ ENTEREM]");
            float minuta = scan.nextFloat();
            float godzina = minuta/60;

            System.out.println(Godzina+" godziny, to: "+Minuta+" minut.");
            System.out.println(minuta+" minuty, to: "+godzina+" godzin.");
            break;
        }
    }
}