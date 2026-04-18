public class Buku19 {
    String [] dataBuku;
    String kodeBuku;
    String judul;
    int tahunTerbit;

    Buku19 (String kodeBuku, String judul, int tahunTerbit){
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    void tampilBuku (){
        System.out.println("Kode Buku : " + kodeBuku);
        System.out.println("Judul : " + judul);
        System.out.println("Tahun Terbit : " + tahunTerbit);
    }
}
