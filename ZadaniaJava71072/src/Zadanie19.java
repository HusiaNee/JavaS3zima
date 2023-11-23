public class Zadanie19 {
    public static void main(String[] args) {
        System.out.println("Nieparzyste liczby z zakresu 1 - 20: ");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}