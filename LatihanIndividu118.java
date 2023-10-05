import java.util.Scanner;

public class LatihanIndividu118 {
    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);

        int Bilangan1, Bilangan2, Bilangan3;
        int BilanganBesar;

        System.out.print("Masukan Bilangan 1    : ");
        Bilangan1 = input18.nextInt();
        System.out.print("Masukan Bilangan 2    : ");
        Bilangan2 = input18.nextInt();
        System.out.print("Masukan Bilangan 3    : ");
        Bilangan3 = input18.nextInt();

        if (Bilangan1 >= Bilangan2) {

            if (Bilangan1 >= Bilangan3) {
                System.out.println("Bilangan terbesar: " + Bilangan1);
            } else {
                System.out.println("Bilangan terbesar: " + Bilangan3);
            }

        } else {
            
            if (Bilangan2 >= Bilangan3) {
                System.out.println("Bilangan terbesar: " + Bilangan2);
            } else {
                System.out.println("Bilangan terbesar: " + Bilangan3);
            }
        }

    }

}