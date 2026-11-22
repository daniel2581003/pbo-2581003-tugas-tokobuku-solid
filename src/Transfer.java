public class Transfer implements MetodeBayar {
    public String nama() { return "Transfer"; }

    public int totalBayar(int totalBelanja) {
        return totalBelanja + 2500;
    }
}