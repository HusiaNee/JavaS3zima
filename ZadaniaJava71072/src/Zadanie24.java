import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
enum TypOwocu {
    JABLKO,
    GRUSZKA,
    TRUSKAWKA
}
interface Owoc {
    void pokazInfo();
}
class NazwaOwocu implements Owoc {
    private String nazwa;
    NazwaOwocu(String nazwa) {
        this.nazwa = nazwa;
    }
    public void pokazInfo() {
        System.out.println("To jest: " + nazwa);
    }
}
public class Zadanie24{
    public static void main(String[] args) {
        List<Owoc> owoce = new ArrayList<>();

        owoce.add(new NazwaOwocu("Jabłko"));
        owoce.add(new NazwaOwocu("Gruszka"));
        owoce.add(new NazwaOwocu("Truskawka"));

        for (Owoc owoc : owoce) {
            owoc.pokazInfo();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz rodzaj owocu (0 - Jabłko, 1 - Gruszka, 2 - Truskawka):");
        int wybor = scanner.nextInt();
        if (wybor >= 0 && wybor < owoce.size()) {
            owoce.get(wybor).pokazInfo();
        } else {
            System.out.println("Nieprawidłowy wybór.");
        }
        TypOwocu typ = TypOwocu.values()[wybor];
        System.out.println("Wybrany typ owocu: " + typ);
    }
}