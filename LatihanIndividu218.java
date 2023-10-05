import java.util.Scanner;

public class LatihanIndividu218 {
    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);
        
        double
        diskon = 0.0, diskonLain = 0.0,
        jumlahDiskon = 0.0, harga;

        String
        jenisBuku;

        int
        jumlahBuku = 0, total, totalBayar;

        System.out.print("\nMasukkan Jenis Buku         : ");
        jenisBuku = input18.next();
        System.out.print("Masukkan Harga Buku         : ");
        harga = input18.nextInt();
        System.out.print("Masukkan Jumlah Buku        : ");
        jumlahBuku = input18.nextInt();
        
        if (jenisBuku.equals("Kamus")) {
            if (jumlahBuku < 2) {
                diskon = 0.1;
            } else if (jumlahBuku > 2 ) {
                diskonLain = 0.12;
                
            }
        } else if (jenisBuku.equals("Novel")){
            if (jumlahBuku > 3) {
                diskonLain = 0.09;
            } else if (jumlahBuku <= 3) {
                diskonLain = 0.08;
            }
        } else if (jumlahBuku > 3) {
            diskon = 0.05;
        }

        total = (int) (harga * jumlahBuku);
        jumlahDiskon = (int) (harga * jumlahBuku * (diskon + diskonLain));
        totalBayar = (int) (total - jumlahDiskon);

        System.out.println("____________________________________________________\n");
        System.out.println("Jumlah yang harus anda bayar sebesar Rp." + totalBayar);
        System.out.println("Jumlah Diskon yang anda dapat sebesar Rp." + jumlahDiskon + "\n");

    }
}
