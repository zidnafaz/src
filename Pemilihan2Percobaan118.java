package src;
import java.util.Scanner;

public class Pemilihan2Percobaan118 {
    public static void main(String[] args) {

        Scanner input18 = new Scanner(System.in);
        
        int
        Tahun;

        System.out.print("Masukkan Tahun      : ");
        Tahun = input18.nextInt();

        if ((Tahun % 4) == 0) {
            if ((Tahun % 100) != 0)
                System.out.println("Tahun Kabisat");
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }

    }
    
}