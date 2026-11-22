public class StrukPrinter {
    private static final int LEBAR = 41;

    public void cetakKeranjang(String judul, Keranjang keranjang) {
        System.out.println(garis(judul, '='));
        for (Buku b : keranjang.getIsi()) {
            System.out.println(b.getJudul() + " (" + b.getPenulis() + ")");
            System.out.printf("  %-11s : %s%n", "Harga", rupiah(b.getHarga()));
            System.out.printf("  %-11s : %s%n", "Keterangan", b.getKeterangan());
            System.out.printf("  %-11s : %s%n", "Harga akhir", rupiah(b.hitungHargaAkhir()));
        }
        System.out.println("-".repeat(LEBAR));
        System.out.println("Total belanja : " + rupiah(keranjang.hitungTotal()));
    }

    public void cetakPembayaran(int totalBelanja, MetodeBayar[] pilihan) {
        System.out.println(garis("PEMBAYARAN", '-'));
        for (MetodeBayar m : pilihan) {
            System.out.printf("%-20s : %s%n", m.nama(), rupiah(m.totalBayar(totalBelanja)));
        }
    }

    private String garis(String teks, char c) {
        int sisa = LEBAR - teks.length() - 2;
        int kiri = sisa / 2;
        int kanan = sisa - kiri;
        return String.valueOf(c).repeat(kiri) + " " + teks + " " + String.valueOf(c).repeat(kanan);
    }

    private String rupiah(int angka) {
        return "Rp" + String.format("%,d", angka).replace(',', '.');
    }
}