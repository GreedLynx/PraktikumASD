public class Kuis19 {
    String idPegawai;
    String nama;
    double gajiPokok, gajiBulanan;
    int hariKerja;

    public Kuis19(String idPegawai, String nama, double gajiPokok, int hariKerja){
        this.idPegawai = idPegawai;
        this.nama = nama;
        this.gajiPokok = gajiPokok;
        this.hariKerja = hariKerja;
    }

    double hitungGajiBulanan(){
        gajiBulanan = gajiPokok * hariKerja / 25;
        return gajiBulanan;
    }

    void tampilkanInformasi(){
        System.out.println("Id Pegawai: " + idPegawai);
        System.out.println("Nama: " + nama);
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Hari Kerja: " + hariKerja);
        System.out.println("-------------------");
        System.out.println();
    }

    
}