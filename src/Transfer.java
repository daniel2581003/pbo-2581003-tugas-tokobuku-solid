public class Transfer implements MetodeBayar {
    public String nama() { return "Transfer (+Rp2.500)"; }

    public int totalBayar(int totalBelanja) {
        return totalBelanja + 2500;
    }
}