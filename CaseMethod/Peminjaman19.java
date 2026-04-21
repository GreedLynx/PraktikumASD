public class Peminjaman19 {
    Mahasiswa19 mhs;
    Buku19 buku;

    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;

    Peminjaman19 (Mahasiswa19 mhs, Buku19 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;

        hitungDenda();
    }

    void hitungDenda(){
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * 2000;
        } else {
            terlambat = 0;
            denda = 0;
        }
    }

    void tampilPeminjaman() {
        System.out.println( mhs.nama + " | " + buku.judul + " | Lama: " + lamaPinjam + " hari | Terlambat: " + terlambat + " hari | Denda: Rp" + denda);
    }
}
