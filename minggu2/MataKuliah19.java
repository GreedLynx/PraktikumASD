public class MataKuliah19 {
    String kodeMk;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah19() {
    
    }

    public MataKuliah19 (String kodeMk, String nama, int sks, int jumlahJam) {
        this.kodeMk = kodeMk;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
        void tampilInformasi (){
            System.out.println("Kode Mata Kuliah: " + kodeMk);
            System.out.println("Nama Mata Kuliah: " + nama);
            System.out.println("SKS: " + sks);
            System.out.println("Jumlah Jam: " + jumlahJam);
        }

        void ubahSks (int sksBaru){
            sks = sksBaru;
        }

        void tambahJam (int jamTambahan){
            jumlahJam += jamTambahan;
        }

        void kurangiJam (int jamPengurangan){
            jumlahJam -= jamPengurangan;
        }
    
}