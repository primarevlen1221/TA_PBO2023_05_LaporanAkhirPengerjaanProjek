//Paket.java

public class Paket {
    String noResi;
    String namaBarang;
    String namaPengirim;
    String alamatPengirim;
    String namaPenerima;
    String alamatPenerima;
    double berat;
    double jarak;
    double tarif;

    public Paket(String noResi, String namaBarang, String namaPengirim, String alamatPengirim,
                 String namaPenerima, String alamatPenerima, double berat, double jarak) {
        this.noResi = noResi;
        this.namaBarang = namaBarang;
        this.namaPengirim = namaPengirim;
        this.alamatPengirim = alamatPengirim;
        this.namaPenerima = namaPenerima;
        this.alamatPenerima = alamatPenerima;
        this.berat = berat;
        this.jarak = jarak;
        this.tarif = hitungTarif();
    }

    private double hitungTarif() {
        return 5000 * berat + 200 * jarak;
    }
}
