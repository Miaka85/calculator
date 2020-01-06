import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Main mainObject = new Main();
        while (true) {

            System.out.println("Ange ett tal");
            double A = input.nextDouble();
            System.out.println("Ange räknesätt");
            System.out.println("1. Addition");
            System.out.println("2. Subtraktion");
            System.out.println("3. Multiplikation");
            System.out.println("4. Division");
            double raknesatt = input.nextDouble();
            System.out.println("Ange ett andra tal");
            double B = input.nextDouble();

            if (raknesatt == 1) {
                mainObject.addition(A, B);
            }
            else if (raknesatt == 2) {
                mainObject.subtraktion(A, B);
            }
            else if (raknesatt == 3) {
              mainObject.multiplikation(A, B);
            }
            else if (raknesatt == 4) {
                mainObject.division(A, B);
            }
            else{
                System.out.println("Nu blev det fel!");
            }

            System.out.println("Avsluta med 0 eller fortsätt med 1");
            int avslut = input.nextInt();

            if (avslut == 0){
                break;
            }

        }

        }

        public static double addition(double A, double B){
        double sum = A + B ;
        System.out.println("Summan av " + A + " och " + B + " är lika med " + sum + "\n");
        return(sum);

    }
        public static double subtraktion(double A, double B){
        double sum = A - B ;
        System.out.println("Differansen av " + A + " och " + B + " är lika med " + sum + "\n");
        return(sum);
    }

        public static double multiplikation(double A, double B){
        double sum = A * B ;
        System.out.println("Produkten av " + A + " och " + B + " är lika med " + sum + "\n");
        return(sum);
    }

        public static double division(double A, double B){
        double sum = A / B ;
        System.out.println("Kvoten av " + A + " och " + B + " är lika med " + sum + "\n");
        return(sum);
    }
}
