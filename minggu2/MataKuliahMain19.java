public class MataKuliahMain19 {
    public static void main(String[] args) {
        MataKuliah19 mk1 = new MataKuliah19();
        mk1.kodeMk = "SI-101";
        mk1.nama = "Pemrograman Dasar";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        mk1.tampilInformasi();
        mk1.ubahSks(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(2);

        MataKuliah19 mk2 = new MataKuliah19("SI-102", "Struktur Data", 4, 8);

        mk2.tampilInformasi();
        mk2.ubahSks(5);
        mk2.tambahJam(3);
        mk2.kurangiJam(1);
    }
}
