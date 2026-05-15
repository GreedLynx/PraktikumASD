public class Peminjaman19 {
    Mahasiswa19 mhs;
    Buku19 buku;

    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;
    // Modifikasi A3
    String kategoriLamaPinjam;

    Peminjaman19 (Mahasiswa19 mhs, Buku19 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;

        hitungDenda();
        // ModifikasiA3
        statusLamaPinjam();
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

    // Modifikasi A3
    void statusLamaPinjam(){
        if (lamaPinjam <= 3) {
            kategoriLamaPinjam = "Cepat";
        } else if (lamaPinjam == 4 || lamaPinjam == 5) {
            kategoriLamaPinjam = "Normal";
        } else {
            kategoriLamaPinjam = "Lama";
        }
    }

    void tampilPeminjaman() {
        System.out.println( mhs.nama + " | " + buku.judul + " | Lama: " + lamaPinjam + " hari | Terlambat: " + terlambat + " hari | Denda: Rp" + denda + " | kategori:" + kategoriLamaPinjam);
    }
}
