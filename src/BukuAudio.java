public class BukuAudio extends Buku implements BisaDiunduh {
    private int durasi;   // menit
    private int diskon;   // persen

    public BukuAudio(String judul, String penulis, int harga, int durasi, int diskon) {
        super(judul, penulis, harga);
        this.durasi = durasi;
        this.diskon = diskon;
    }

    public int hitungHargaAkhir() {
        return getHarga() * (100 - diskon) / 100;
    }

    public String getKeterangan() {
        return durasi + " menit, diskon " + diskon + "%";
    }

    public void unduh() {
        System.out.println("Mengunduh audio " + getJudul());
    }
}