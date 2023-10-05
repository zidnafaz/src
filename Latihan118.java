import java.util.Scanner;

public class Latihan118 {
    public static void main(String[] args) {
        
        Scanner input18 = new Scanner(System.in);

        int Total, Diskon, Bayar;
        String Kartu;

        System.out.println("Apakah pelanggan mempunyai kartu member?\ny atau t");
        Kartu = input18.nextLine();
        System.out.print("Masukkan total harga barang belanjaan?\nRp.");
        Total = input18.nextInt();

        if (Kartu.equals("y")) {
            
            if (Total > 500000) {
                Diskon = 50000;
            } else {
                Diskon = 25000;
            }

        } else {
            if (Total > 200000) {
                Diskon = 10000;
            } else {
                Diskon = 0;
            }
        }

        Bayar = Total - Diskon;
        System.out.print("Total yang harus anda bayar sebesar Rp." + Bayar);

    }
}
