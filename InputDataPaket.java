import java.util.Scanner;

public class InputDataPaket {
    static Scanner scanner = new Scanner(System.in);

    public static Paket inputDataPaket() {
        System.out.println("========== Input Data Paket ==========");
        System.out.print("Masukkan No Resi: ");
        String noResi = scanner.next();
        System.out.print("Masukkan Nama Barang: ");
        String namaBarang = scanner.next();
        System.out.print("Masukkan Nama Pengirim: ");
        String namaPengirim = scanner.next();
        System.out.print("Masukkan Alamat Pengirim: ");
        String alamatPengirim = scanner.next();
        System.out.print("Masukkan Nama Penerima: ");
        String namaPenerima = scanner.next();
        System.out.print("Masukkan Alamat Penerima: ");
        String alamatPenerima = scanner.next();
        System.out.print("Masukkan Berat Barang (kg): ");
        double berat = scanner.nextDouble();
        System.out.print("Masukkan Jarak Pengiriman (km): ");
        double jarak = scanner.nextDouble();

        Paket paket = new Paket(noResi, namaBarang, namaPengirim, alamatPengirim,
                namaPenerima, alamatPenerima, berat, jarak);

        NotaPengiriman.tampilkanNota(paket); // Menampilkan nota pengiriman

        return paket;
    }
}
