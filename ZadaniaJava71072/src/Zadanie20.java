public class Zadanie20 {
    public static void main(String[] args) {
        System.out.println("Nieparzyste liczby z zakresu 1 - 20: ");
        int i = 1;
        while (i <= 20) {
            if (i % 2 == 0) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}