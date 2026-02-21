public class MataKuliahMain19 {
    public static void main(String[] args) {
        // Membuat objek mata kuliah1 menggunakan konstruktor tanpa parameter
        MataKuliah19 mk1 = new MataKuliah19();
        mk1.kodeMk = "SI-101";
        mk1.nama = "Pemrograman Dasar";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        // Menampilkan informasi mata kuliah1, mengubah SKS dan jumlah jam, lalu menampilkan kembali
        mk1.tampilInformasi();
        mk1.ubahSks(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(2);

        // Membuat objek mata kuliah2 menggunakan konstruktor dengan parameter
        MataKuliah19 mk2 = new MataKuliah19("SI-102", "Struktur Data", 4, 8);

        // Menampilkan informasi mata kuliah2, mengubah SKS dan jumlah jam, lalu menampilkan kembali
        mk2.tampilInformasi();
        mk2.ubahSks(5);
        mk2.tambahJam(3);
        mk2.kurangiJam(1);
    }
}
