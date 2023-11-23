import java.util.Scanner;
public class Zadanie17 {
    public static void main(String[] args) {
        //double masa = 70.5;
        //double wzrost = 1.75;
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj masę: ");
        double masa = scan.nextDouble();
        System.out.println("Podaj wzrost: ");
        double wzrost = scan.nextDouble();
        double bmi = masa / (wzrost * wzrost);
        System.out.println("BMI wynosi: " + bmi);
        if (bmi < 18.5) {
            System.out.println("Niedowaga");
        }
        else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Waga prawidłowa");
        }
        else if (bmi >= 25 && bmi < 30) {
            System.out.println("Nadwaga");
        }
        else {
            System.out.println("Otyłość");
        }
    }
}