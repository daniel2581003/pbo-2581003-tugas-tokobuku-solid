public class BukuDigital extends Buku implements BisaDiunduh {
    public BukuDigital(String judul, String penulis, int harga) {
        super(judul, penulis, harga);
    }

    public void unduh() {
        System.out.println("Mengunduh " + getJudul());
    }
}