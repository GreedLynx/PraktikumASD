public class Pelanggan {
    int NoAntrian;
    String nama;
    String Pesanan;
    double harga;

    public Pelanggan(int NomerAntrian, String nama, String Pesanan, double harga) {
        this.NoAntrian = NoAntrian;
        this.nama = nama;
        this.Pesanan = "Belum memesan";
        this.harga = 0;
    }

    public void tampil() {
        System.out.println(
            "NOMER ANTRIAN :" + NoAntrian + 
            "\nNAMA  :" + nama + 
            "\nPESANAN :" + Pesanan + 
            "\nHARGA :" + harga );
    }
    
}