import java.util.Scanner;

public class Latihan218 {
    public static void main(String[] args) {
        
        Scanner input18 = new Scanner(System.in);

        int Suhu;
        String hujan;

        System.out.print("\nMasukkan suhu saat ini            : ");
        Suhu = input18.nextInt();

        if (Suhu > 27) {
            System.out.println("Memakai Dress");
        } else {
            System.out.println("Memakai Celana Panjang");
        }

        System.out.print("Apakah sedang hujan (y atau t)    : ");
        hujan = input18.next();

        if (hujan.equals("Y")) {
            System.out.println("Membawa Payung");
        } else {
            System.out.println("Memakai Sunscreen");
        }

    }
}
