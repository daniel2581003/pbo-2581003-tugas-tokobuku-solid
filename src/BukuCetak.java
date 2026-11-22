public class BukuCetak extends Buku {
    private int berat;   // gram
    private int ongkir;

    public BukuCetak(String judul, String penulis, int harga, int berat, int ongkir) {
        super(judul, penulis, harga);
        this.berat = berat;
        this.ongkir = ongkir;
    }

    public int hitungHargaAkhir() {
        return getHarga() + ongkir;
    }

    public String getKeterangan() {
        String o = String.format("%,d", ongkir).replace(',', '.');
        return berat + " gram, ongkir Rp" + o;
    }
}