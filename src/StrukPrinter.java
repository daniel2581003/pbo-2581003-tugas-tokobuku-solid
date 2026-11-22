public class StrukPrinter {
    public void cetakKeranjang(String judul, Keranjang k) {
        System.out.println("=== " + judul + " ===");
        for (Buku b : k.getIsi()) {
            System.out.printf("%-20s : %s%n", b.getJudul(), "Rp" + b.getHarga());
        }
        System.out.printf("%-20s : %s%n", "Total", "Rp" + k.hitungTotal());
    }

    public void cetakPembayaran(int totalBelanja, MetodeBayar[] pilihan) {
        for (MetodeBayar m : pilihan) {
            System.out.printf("%-20s : %s%n", m.nama(), "Rp" + m.totalBayar(totalBelanja));
        }
    }
}