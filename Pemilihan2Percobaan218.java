import java.util.Scanner;

public class Pemilihan2Percobaan218 {
    public static void main(String[] args) {

        Scanner input18 = new Scanner(System.in);

        float
        Sudut1, Sudut2, Sudut3, TotalSudut;

        System.out.print("\nMasukkan Sudut 1 Segitiga     : ");
        Sudut1 = input18.nextFloat();
        System.out.print("Masukkan Sudut 2 Segitiga     : ");
        Sudut2 = input18.nextFloat();
        System.out.print("Masukkan Sudut 3 Segitiga     : ");
        Sudut3 = input18.nextFloat();

        TotalSudut = Sudut1 + Sudut2 + Sudut3;

        if (TotalSudut == 180) {
            if ((Sudut1 == 90) || (Sudut2 == 90) || (Sudut3 == 90))
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            else
                System.out.println("Segitiga tersebut adalah bukan segitiga siku-siku");
        } else {
            System.out.println("Bukan segitiga");
        }

    }
}