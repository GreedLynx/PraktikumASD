public class Dosen19 {
    // Atribut-atribut dosen
    String IdDosen;
    String Nama; 
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    // Konstruktor tanpa parameter
    public Dosen19(){

    }

    // Konstruktor dengan parameter
    public Dosen19(String IdDosen, String Nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian){
        this.IdDosen = IdDosen;
        this.Nama = Nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }
    
    // Method untuk menampilkan data dosen
    void tampilDataDosen(){
        System.out.println("Id Dosen: " + IdDosen);
        System.out.println("Nama: " + Nama);
        System.out.println("Status Aktif: " + statusAktif);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }

    // Method untuk mengubah status aktif dosen
    void setStatusAktif(boolean ubahStatusAktif){
        statusAktif = ubahStatusAktif;
    }

    // Method untuk menghitung masa kerja dosen
    void hitungMasaKerja(int tahunSekarang){
        int masaKerja = tahunSekarang - tahunBergabung;
        System.out.println("Masa Kerja: " + masaKerja + " tahun");
    }

    // Method untuk mengubah bidang keahlian dosen
    void ubahKeahlian(String keahlianBaru){
        bidangKeahlian = keahlianBaru;
    }
}
