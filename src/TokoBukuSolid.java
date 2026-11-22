public class TokoBukuSolid {
    public static void main(String[] args) {
        Buku b1 = new BukuCetak("Pemrograman Java", "John Doe", 120000, 750, 10000);
        Buku b2 = new BukuCetak("Algoritma Dasar", "Jane Smith", 95000, 400, 5000);
        Buku b3 = new BukuDigital("Belajar OOP", "Ani Wijaya", 80000, 12.5, 20);
        Buku b4 = new BukuAudio("Kisah Programmer", "Budi Santoso", 60000, 240, 10);

        Keranjang k1 = new Keranjang();
        k1.tambah(b1);
        k1.tambah(b2);
        k1.tambah(b3);
        k1.tambah(b4);

        Keranjang k2 = new Keranjang();
        k2.tambah(b3);

        MetodeBayar[] pilihan = {
                new Tunai(), new Transfer(), new EWallet(), new Voucher(100000)
        };

        StrukPrinter printer = new StrukPrinter();

        printer.cetakKeranjang("KERANJANG PERTAMA", k1);
        printer.cetakPembayaran(k1.hitungTotal(), pilihan);

        System.out.println();

        printer.cetakKeranjang("KERANJANG KEDUA", k2);
        printer.cetakPembayaran(k2.hitungTotal(), pilihan);
    }
}