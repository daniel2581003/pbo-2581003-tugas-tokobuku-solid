public class Voucher implements MetodeBayar {
    private int nilai;

    public Voucher(int nilai) {
        this.nilai = nilai;
    }

    public String nama() {
        return "Voucher Rp" + String.format("%,d", nilai).replace(',', '.');
    }

    public int totalBayar(int totalBelanja) {
        // Versi salah: return totalBelanja - nilai;
        // Hasil keranjang kedua: Voucher Rp100.000    : Rp-36.000
        return Math.max(0, totalBelanja - nilai);
    }
}