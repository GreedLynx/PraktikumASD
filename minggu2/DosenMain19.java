public class DosenMain19 {
    public static void main(String[] args) {
        // Membuat objek dosen1 menggunakan konstruktor tanpa parameter
        Dosen19 dosen1 = new Dosen19();
        dosen1.IdDosen = "D001";
        dosen1.Nama = "Dr. Andi";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2010;
        dosen1.bidangKeahlian = "Biologi";

        // Menampilkan data dosen1 dan melakukan perubahan
        dosen1.tampilDataDosen();
        dosen1.hitungMasaKerja(2025);
        dosen1.setStatusAktif(false);
        dosen1.ubahKeahlian("Kimia");

        // Menampilkan data dosen1 setelah perubahan
        System.out.println("\nSetelah perubahan:");
        dosen1.tampilDataDosen();

        // Membuat objek dosen2 menggunakan konstruktor dengan parameter
        Dosen19 dosen2 = new Dosen19("D002", "Dr. Budi", false, 2015, "Fisika");
        
        // Menampilkan data dosen2 dan melakukan perubahan
        System.out.println();
        dosen2.tampilDataDosen();
        dosen2.hitungMasaKerja(2025);
        dosen2.setStatusAktif(true);
        dosen2.ubahKeahlian("Matematika");

        // Menampilkan data dosen2 setelah perubahan
        System.out.println("\nSetelah perubahan:");
        dosen2.tampilDataDosen();
    }
}
