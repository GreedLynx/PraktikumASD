import java.util.Scanner;

public class RuangBaca {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Membuat objek Mahasiswa
            Mahasiswa19 mhs1 = new Mahasiswa19 ("22001", "Andi", "Teknik Informatika");
            Mahasiswa19 mhs2 = new Mahasiswa19 ("22002", "Budi", "Teknik Informatika");
            Mahasiswa19 mhs3 = new Mahasiswa19 ("22003", "Citra", "Teknik Informatika");

            // Membuat objek Buku
            Buku19 buku1 = new Buku19 ("B001", "Algoritma", 2020);
            Buku19 buku2 = new Buku19 ("B002", "Basis Data", 2019);
            Buku19 buku3 = new Buku19 ("B003", "Pemrograman", 2021);
            Buku19 buku4 = new Buku19 ("B004", "Fisika", 2024);

            // Membuat objek Peminjaman
            Peminjaman pinjam1 = new Peminjaman (mhs1, buku1, 7);
            Peminjaman pinjam2 = new Peminjaman (mhs2, buku2, 3);
            Peminjaman pinjam3 = new Peminjaman (mhs3, buku3, 10);
            Peminjaman pinjam4 = new Peminjaman (mhs3, buku4, 6);
            Peminjaman pinjam5 = new Peminjaman (mhs1, buku2, 4);

            // Menampilkan informasi peminjaman
            System.out.println("Peminjaman 1:");
            pinjam1.tampilPeminjaman();
            System.out.println();
        }
    }
}
