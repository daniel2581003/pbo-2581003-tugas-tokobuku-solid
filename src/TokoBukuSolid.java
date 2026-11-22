public class TokoBukuSolid {
    public static void main(String[] args) {
        Keranjang k1 = new Keranjang();
        k1.tambah(new BukuCetak("Belajar OOP", "Penulis A", 64000));
        k1.tambah(new BukuDigital("Buku 2", "Penulis B", 90000));   // ganti sesuai Bab 11
        k1.tambah(new BukuAudio("Buku 3", "Penulis C", 100000));    // ganti sesuai Bab 11
        k1.tambah(new BukuCetak("Buku 4", "Penulis D", 94000));     // ganti sesuai Bab 11

        Keranjang k2 = new Keranjang();
        k2.tambah(new BukuCetak("Belajar OOP", "Penulis A", 64000));

        MetodeBayar[] pilihan = {
                new Tunai(), new Transfer(), new EWallet(), new Voucher(100000)
        };

        StrukPrinter printer = new StrukPrinter();

        printer.cetakKeranjang("Keranjang 1", k1);
        printer.cetakPembayaran(k1.hitungTotal(), pilihan);

        printer.cetakKeranjang("Keranjang 2", k2);
        printer.cetakPembayaran(k2.hitungTotal(), pilihan);
    }
}