import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int wybor;
        System.out.println("1. Instrukcja switch dla pór roku.");
        System.out.println("2. Instrukcja switch dla dni tygodnia.");
        System.out.println("3. Instrukcja switch dla oceny szkolnej.");
        System.out.println("4. Instrukcja switch dla kierunku studiów.");
        System.out.println("Wybierz switch 1-4:");
        wybor = scan.nextInt();

        if (wybor == 1) {
            System.out.println("Podaj cyfrę miesiąca: ");
            int miesiac = scan.nextInt();
            String sezon;
            switch (miesiac) {
                case 12:
                case 1:
                case 2:
                    sezon = "Zima";
                    break;
                case 3:
                case 4:
                case 5:
                    sezon = "Wiosna";
                    break;
                case 6:
                case 7:
                case 8:
                    sezon = "Lato";
                    break;
                case 9:
                case 10:
                case 11:
                    sezon = "Jesień";
                    break;
                default:
                    sezon = "Niepoprawny miesiąc";
                    break;
            }
            System.out.println("Pora roku: " + sezon);
        }
        else if (wybor == 2){
            System.out.println("Podaj dzień tygodnia (1-7): ");
            int dzien = scan.nextInt();
            String dzienTygodnia;
            switch (dzien) {
                case 1:
                    dzienTygodnia = "Poniedziałek";
                    break;
                case 2:
                    dzienTygodnia = "Wtorek";
                    break;
                case 3:
                    dzienTygodnia = "Środa";
                    break;
                case 4:
                    dzienTygodnia = "Czwartek";
                    break;
                case 5:
                    dzienTygodnia = "Piątek";
                    break;
                case 6:
                    dzienTygodnia = "Sobota";
                    break;
                case 7:
                    dzienTygodnia = "Niedziela";
                    break;
                default:
                    dzienTygodnia = "Niepoprawny dzień";
                    break;
            }
            System.out.println("Dzień tygodnia: " + dzienTygodnia);
        }
        else if (wybor == 3){
            System.out.println("Podaj ocenę (2-5): ");
            int ocena = scan.nextInt();
            String dziennik;
            switch (ocena) {
                case 5:
                    dziennik = "Dobra praca.";
                    break;
                case 4:
                    dziennik = "Możesz się poprawić.";
                    break;
                case 3:
                    dziennik = "Nie najlepiej, wymaga pracy.";
                    break;
                case 2:
                    dziennik = "To jest kiepsko, konieczna poprawa.";
                    break;
                default:
                    dziennik = "Niepoprawna ocena.";
                    break;
            }
            System.out.println("Ocena: " + dziennik);
        }
        else if (wybor == 4){
            System.out.println("Podaj kierunek studiów (Inf/Med/Eko): "); //oszczędzamy czas - piszemy skróty!
            String kierunek = scan.next();
            String informacja;
            switch (kierunek) {
                case "Inf":
                    informacja = "Kierunek informatyka został wybrany.";
                    break;
                case "Med":
                    informacja = "Kierunek medycyna został wybrany.";
                    break;
                case "Eko":
                    informacja = "Kierunek ekonomia został wybrany.";
                    break;
                default:
                    informacja = "Kierunek nie jest dostępny.";
                    break;
            }
            System.out.println(informacja);
        }
        else{
            System.out.println("Nieprawidłowy wybór.");
        }
    }
}