public class Zadanie21 {
    public static void main(String[] args) {
        System.out.println("Liczby podzielne przez 4, ale niepodzielne przez 8 i 10: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 4 != 0 || i % 8 == 0 || i % 10 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}