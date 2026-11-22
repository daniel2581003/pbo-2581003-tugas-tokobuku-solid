public class Voucher implements MetodeBayar {
    private int nilai;

    public Voucher(int nilai) {
        this.nilai = nilai;
    }

    public String nama() { return "Voucher"; }

    public int totalBayar(int totalBelanja) {
        // Versi salah (melanggar kontrak, hasil -36000 untuk keranjang kedua):
        // return totalBelanja - nilai;

        // Versi benar: hasil tidak pernah negatif
        return Math.max(0, totalBelanja - nilai);
    }
}