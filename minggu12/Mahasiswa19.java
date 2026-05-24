public class Mahasiswa19 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    public Mahasiswa19(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampil() {
        System.out.println(
            "NIM     :" + nim + 
            "\nNAMA  :" + nama + 
            "\nKELAS :" + kelas + 
            "\nIPK   :" + ipk );
    }
    
}