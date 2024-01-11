//CekTarifPaket.java

import java.util.Scanner;

public class CekTarifPaket {
    static Scanner scanner = new Scanner(System.in);

    public static void cekTarifPaket() {
        System.out.println("========== Cek Tarif Paket ==========");
        System.out.print("Masukkan Berat Barang (kg): ");
        double berat = scanner.nextDouble();
        System.out.print("Masukkan Jarak Pengiriman (km): ");
        double jarak = scanner.nextDouble();

        double tarif = 5000 * berat + 200 * jarak;

        System.out.println("Tarif Pengiriman: Rp " + tarif);
    }
}
