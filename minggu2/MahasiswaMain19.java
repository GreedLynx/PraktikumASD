package minggu2;

public class MahasiswaMain19 {
    public static void main(String[] args) {
        Mahasiswa19 mhs1 = new Mahasiswa19();
        mhs1.nama = "Muahammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI-2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI-2K");
        mhs1.updateIPK(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa19 mhs2 = new Mahasiswa19("Anisa Nabila", "2141720160", "TI-2L", 3.20);
        mhs2.updateIPK(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa19 mhsNopal = new Mahasiswa19("Nopal", "2241720172", "SI-2J", 3.00);
        mhsNopal.updateIPK(3.10);
        mhsNopal.tampilkanInformasi();

    }
}
