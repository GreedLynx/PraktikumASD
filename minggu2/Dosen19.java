public class Dosen19 {
    String IdDosen;
    String Nama; 
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen19(){

    }

    public Dosen19(String IdDosen, String Nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian){
        this.IdDosen = IdDosen;
        this.Nama = Nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }
    
    void tampilDataDosen(){
        System.out.println("Id Dosen: " + IdDosen);
        System.out.println("Nama: " + Nama);
        System.out.println("Status Aktif: " + statusAktif);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }

    void setStatusAktif(boolean ubahStatusAktif){
        statusAktif = ubahStatusAktif;
    }

    void hitungMasaKerja(int tahunSekarang){
        int masaKerja = tahunSekarang - tahunBergabung;
        System.out.println("Masa Kerja: " + masaKerja + " tahun");
    }

    void ubahKeahlian(String keahlianBaru){
        bidangKeahlian = keahlianBaru;
    }
}
