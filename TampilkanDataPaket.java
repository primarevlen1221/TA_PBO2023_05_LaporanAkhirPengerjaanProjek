//TampilkanDataPaket.java

import java.util.ArrayList;

public class TampilkanDataPaket {
    public static void tampilkanDataPaket(ArrayList<Paket> dataPaket) {
        System.out.println("========== Data Paket ==========");
        for (Paket paket : dataPaket) {
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
        }
    }
}
