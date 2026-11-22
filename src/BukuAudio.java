public class BukuAudio extends Buku implements BisaDiunduh {
    public BukuAudio(String judul, String penulis, int harga) {
        super(judul, penulis, harga);
    }

    public void unduh() {
        System.out.println("Mengunduh audio " + getJudul());
    }
}