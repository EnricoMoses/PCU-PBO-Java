import java.util.ArrayList;
import java.util.List;

class Katalog<T extends BarangPerpus> {
    private List<T> daftarBarang;

    public Katalog() {
        this.daftarBarang = new ArrayList<>();
    }

    public void tambahBarang(T barang) {
        daftarBarang.add(barang);
    }

    public void printDaftar() {
        for (T barang : daftarBarang) {
            barang.printBarang();

            if (barang instanceof PinjamInterface) {
                PinjamInterface barangPinjam = (PinjamInterface) barang;
                if (barangPinjam.bisaDipinjam()) {
                    System.out.println("Status peminjaman: Tersedia");
                } else {
                    System.out.println("Status peminjaman: Sedang dipinjam");
                }
            }
            System.out.println();
        }
    }

    public T cariBarang(String id) {
        for (T barang : daftarBarang) {
            if (barang.getId().equals(id)) {
                return barang;
            }
        }
        return null;
    }
}