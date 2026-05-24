public class Mahasiswa19 {
    String nama;
    String nim;
    String kelas;
    String jurusan;

    public Mahasiswa19(String nama, String nim, String kelas, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.jurusan = jurusan;
    }

    public void tampilInformasi() {
        System.out.println(nim + " - " + nama + " - " + kelas + " - " + jurusan );
    }
    
}