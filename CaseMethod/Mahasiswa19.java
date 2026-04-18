public class Mahasiswa19 {
    String [] dataMahasiswa;
    String nim;
    String nama;
    String prodi;

    Mahasiswa19 (String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    void tampilMahasiswa (){
        System.out.println("Nim : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi : " + prodi);
    }

}