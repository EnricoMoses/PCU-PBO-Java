import java.util.*;

public class Main {
    public static void main(String[] args) {

        Buku buku1 = new Buku("B001", "Pemrograman Java", 2024, "Jono");
        Buku buku2 = new Buku("B002", "Dasar Algoritma", 2023, "Joni");
        Komik komik1 = new Komik("K001", "One Piece", 2022, 105);
        Komik komik2 = new Komik("K002", "Attack on Titan", 2021, 34);
        TugasAkhir ta1 = new TugasAkhir("T001", "Analisis Sistem Informasi", 2021, "Dimas");
        TugasAkhir ta2 = new TugasAkhir("T002", "Optimasi Jaringan Komputer", 2022, "Sari");

        Katalog<Buku> katalogBuku = new Katalog<>();
        Katalog<Komik> katalogKomik = new Katalog<>();
        Katalog<TugasAkhir> katalogTA = new Katalog<>();

        katalogBuku.tambahBarang(buku1);
        katalogBuku.tambahBarang(buku2);
        katalogKomik.tambahBarang(komik1);
        katalogKomik.tambahBarang(komik2);
        katalogTA.tambahBarang(ta1);
        katalogTA.tambahBarang(ta2);

        System.out.println("=== Katalog Buku ===");
        katalogBuku.printDaftar();

        System.out.println("=== Katalog Komik ===");
        katalogKomik.printDaftar();

        System.out.println("=== Katalog Tugas Akhir ===");
        katalogTA.printDaftar();

        AnggotaPerpus anggota = new AnggotaPerpus("Giorno");

        System.out.println("=== Proses Peminjaman ===");
        anggota.pinjamBarang(buku1);   // berhasil
        anggota.pinjamBarang(buku1);   // gagal, sudah dipinjam
        anggota.pinjamBarang(komik1);  // berhasil

        System.out.println("\n=== Proses Pengembalian ===");
        anggota.kembalikanBarang(buku1);
        anggota.kembalikanBarang(komik1);

        System.out.println("\n=== Pencarian Barang ===");
        BarangPerpus hasilCari = katalogBuku.cariBarang("B002");
        if (hasilCari != null) {
            System.out.println("Barang ditemukan:");
            hasilCari.printBarang();
            hasilCari.printJenisBarang();
        } else {
            System.out.println("Barang dengan ID tersebut tidak ditemukan.");
        }
    }
}