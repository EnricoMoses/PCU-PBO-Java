abstract class BarangPerpus {
    protected String id;
    protected String judul;
    protected int tahun;

    public BarangPerpus(String id, String judul, int tahun) {
        this.id = id;
        this.judul = judul;
        this.tahun = tahun;
    }

    public void printBarang() {
        System.out.println("ID: " + id);
        System.out.println("Judul: " + judul);
        System.out.println("Tahun: " + tahun);
    }

    public abstract void printJenisBarang();

    public String getId() {
        return id;
    }
}