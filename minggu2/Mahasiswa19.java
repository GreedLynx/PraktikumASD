package minggu2;

public class Mahasiswa19 {
    // Atribut-atribut mahasiswa
    String nama;
    String nim;
    String kelas;
    double ipk;

    // Konstruktor tanpa parameter
    public Mahasiswa19(){
        
    }

    // Konstruktor dengan parameter
    public Mahasiswa19(String nama, String nim, String kelas, double ipk){
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    // Method untuk menampilkan informasi mahasiswa
    void tampilkanInformasi(){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }

    // Method untuk mengubah kelas mahasiswa
    void ubahKelas(String kelasBaru){
        kelas = kelasBaru;
    }

    // Method untuk memperbarui IPK mahasiswa
    void updateIPK(double ipkBaru){
        ipk = ipkBaru;
    }

    // Method untuk menentukan nilai kinerja berdasarkan IPK
    String nilaiKinerja(){
        if(ipk < 0.00 || ipk > 4.00){
            return  "IPK tidak valid. Harus antara 0.0 dan 4.0";
        }
        else if (ipk >= 3.5) {
            return "Kinerja Sangat Baik";
        } else if (ipk >= 3.0) {
            return "Kinerja Baik";
        } else if (ipk >= 2.0) {
            return "Kinerja Cukup";
        } else {
            return "Kinerja Kurang";
        }
    }
}