public class Peminjaman {
    Mahasiswa19 mhs;
    Buku19 buku;

    int [] dataPeminjaman;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;

    Peminjaman (Mahasiswa19 mhs, Buku19 buku, int lamaPinjam) {
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
        mhs.tampilMahasiswa();
        buku.tampilBuku();
        System.out.println("Lama Pinjam : " + lamaPinjam + " hari");
        System.out.println("Terlambat : " + terlambat + " hari");
        System.out.println("Denda : Rp " + denda);
    }
}
