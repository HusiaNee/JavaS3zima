public class Zadanie4 {
    public static void main(String[] args){
        //int a=1, b=2, c=3; //brak miejsc zerowych
        //int a=1, b=-2, c=1; //jedno miejsce zerowe
        int a=1, b=-3, c=2; //dwa miejsca zerowe
        double delta = Math.pow(b,2)-4*a*c;
        System.out.println(delta);
        if (delta < 0){
            System.out.println("Brak pierwiastków.");
        }
        else if (delta == 0){
            double x0= -b/(2*a);
            System.out.println("Posiada jedno miejsce zerowe o wartości: "+x0);
        }
        else if (delta > 0){
            double x1= (-b - Math.sqrt(delta))/(2*a);;
            double x2= (-b + Math.sqrt(delta))/(2*a);;
            System.out.println("Posiada dwa miejsca zerowe o wartościach: "+x1+" i "+x2);
        }
    }
}
