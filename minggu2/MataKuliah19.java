public class MataKuliah19 {
    // Atribut-atribut mata kuliah
    String kodeMk;
    String nama;
    int sks;
    int jumlahJam;

    // Konstruktor tanpa parameter
    public MataKuliah19() {
    
    }

    // Konstruktor dengan parameter
    public MataKuliah19 (String kodeMk, String nama, int sks, int jumlahJam) {
        this.kodeMk = kodeMk;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    // Method untuk menampilkan informasi mata kuliah
        void tampilInformasi (){
            System.out.println("Kode Mata Kuliah: " + kodeMk);
            System.out.println("Nama Mata Kuliah: " + nama);
            System.out.println("SKS: " + sks);
            System.out.println("Jumlah Jam: " + jumlahJam);
        }

        // Method untuk mengubah jumlah SKS mata kuliah
        void ubahSks (int sksBaru){
            sks = sksBaru;
        }

        // Method untuk menambah jumlah jam mata kuliah
        void tambahJam (int jamTambahan){
            jumlahJam += jamTambahan;
        }

        // Method untuk mengurangi jumlah jam mata kuliah
        void kurangiJam (int jamPengurangan){
            jumlahJam -= jamPengurangan;
        }
    
}