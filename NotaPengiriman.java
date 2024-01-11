import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class NotaPengiriman {
    public static void tampilkanNota(Paket paket) {
        System.out.println("========== Nota Pengiriman ==========");
        System.out.println("No Resi: " + paket.noResi);
        System.out.println("Nama Barang: " + paket.namaBarang);
        System.out.println("Nama Pengirim: " + paket.namaPengirim);
        System.out.println("Alamat Pengirim: " + paket.alamatPengirim);
        System.out.println("Nama Penerima: " + paket.namaPenerima);
        System.out.println("Alamat Penerima: " + paket.alamatPenerima);
        System.out.println("Berat Barang: " + paket.berat + " kg");
        System.out.println("Jarak Pengiriman: " + paket.jarak + " km");
        System.out.println("Tarif: Rp " + paket.tarif);
        System.out.println("===============================");
        System.out.println("Terima kasih telah menggunakan layanan ekspedisi!");

        simpanNotaKeFile(paket); // Menyimpan nota ke dalam file
    }

    private static void simpanNotaKeFile(Paket paket) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("nota_pengiriman.txt"))) {
            writer.println("========== Nota Pengiriman ==========");
            writer.println("No Resi: " + paket.noResi);
            writer.println("Nama Barang: " + paket.namaBarang);
            writer.println("Nama Pengirim: " + paket.namaPengirim);
            writer.println("Alamat Pengirim: " + paket.alamatPengirim);
            writer.println("Nama Penerima: " + paket.namaPenerima);
            writer.println("Alamat Penerima: " + paket.alamatPenerima);
            writer.println("Berat Barang: " + paket.berat + " kg");
            writer.println("Jarak Pengiriman: " + paket.jarak + " km");
            writer.println("Tarif: Rp " + paket.tarif);
            writer.println("===============================");
            writer.println("Terima kasih telah menggunakan layanan ekspedisi!");
            System.out.println("Nota Pengiriman berhasil disimpan dalam file nota_pengiriman.txt");
        } catch (IOException e) {
            System.err.println("Gagal menyimpan nota ke dalam file.");
            e.printStackTrace();
        }
    }
}
