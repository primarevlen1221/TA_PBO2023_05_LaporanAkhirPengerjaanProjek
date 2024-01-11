// Main.java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Paket> dataPaket = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("========== Aplikasi Ekspedisi Barang ==========");
            System.out.println("1. Input Data Paket");
            System.out.println("2. Cek Tarif Paket");
            System.out.println("3. Data Paket");
            System.out.println("4. Keluar");
            System.out.println("===============================================");

            System.out.print("Masukkan pilihan : ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    dataPaket.add(InputDataPaket.inputDataPaket());
                    break;
                case 2:
                    CekTarifPaket.cekTarifPaket();
                    break;
                case 3:
                    TampilkanDataPaket.tampilkanDataPaket(dataPaket);
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan Aplikasi Ekspedisi Barang.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 4);
    }
}

