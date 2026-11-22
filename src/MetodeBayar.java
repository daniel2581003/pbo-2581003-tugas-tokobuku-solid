public interface MetodeBayar {
    String nama();

    // Kontrak: totalBayar() hasilnya tidak boleh pernah negatif.
    int totalBayar(int totalBelanja);
}