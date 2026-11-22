public class Tunai implements MetodeBayar {
    public String nama() { return "Tunai"; }

    public int totalBayar(int totalBelanja) {
        return totalBelanja;
    }
}