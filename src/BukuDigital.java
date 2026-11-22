public class BukuDigital extends Buku implements BisaDiunduh {
    private double ukuranMB;
    private int diskon;   // persen

    public BukuDigital(String judul, String penulis, int harga, double ukuranMB, int diskon) {
        super(judul, penulis, harga);
        this.ukuranMB = ukuranMB;
        this.diskon = diskon;
    }

    public int hitungHargaAkhir() {
        return getHarga() * (100 - diskon) / 100;
    }

    public String getKeterangan() {
        return ukuranMB + " MB, diskon " + diskon + "%";
    }

    public void unduh() {
        System.out.println("Mengunduh " + getJudul());
    }
}