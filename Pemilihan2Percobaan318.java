import java.util.Scanner;

public class Pemilihan2Percobaan318 {
    public static void main(String[] args) {
        
        Scanner input18 = new Scanner(System.in);

        String Kategori;
        int Penghasilan, Gajibersih;
        double Pajak = 0;

        System.out.print("\nMasukkan Kategori               : ");
        Kategori = input18.nextLine();
        System.out.print("Masukkan Besaran Penghasilan    : ");
        Penghasilan = input18.nextInt();

        if (Kategori.equals("Pekerja")) {
            
            if (Penghasilan <= 2000000)
                Pajak = 0.1;
            else if (Penghasilan <= 3000000)
                Pajak = 0.15;
            else
                Pajak = 0.2;
            
                Gajibersih = (int) (Penghasilan - (Pajak * Penghasilan));
                System.out.println("Penghasilan Bersih Anda         : " + Gajibersih);

        } else if (Kategori.equals("Pebisnis")) {
            
             if (Penghasilan <= 2500000)
                Pajak = 0.15;
            else if (Penghasilan <= 3500000)
                Pajak = 0.2;
            else
                Pajak = 0.25;

                Gajibersih = (int) (Penghasilan - (Pajak * Penghasilan));
                System.out.println("Penghasilan Bersih Anda         : " + Gajibersih);

        } else {
            System.out.println("Kategori Salah");
        }

    }

}
