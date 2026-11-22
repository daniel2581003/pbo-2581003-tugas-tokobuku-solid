public class Voucher implements MetodeBayar {
    private int nilai;

    public Voucher(int nilai) {
        this.nilai = nilai;
    }

    public String nama() {
        return "Voucher Rp" + String.format("%,d", nilai).replace(',', '.');
    }

    public int totalBayar(int totalBelanja) {
        return totalBelanja - nilai;
    }
}