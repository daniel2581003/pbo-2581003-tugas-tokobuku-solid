public class EWallet implements MetodeBayar {
    public String nama() { return "E-Wallet"; }

    public int totalBayar(int totalBelanja) {
        return totalBelanja * 98 / 100;
    }
}