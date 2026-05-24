public class Mahasiswa19 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    public Mahasiswa19(String nama, String nim, String kelas, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.println(nim + " - " + nama + " - " + kelas + " - " + ipk );
    }
    
}