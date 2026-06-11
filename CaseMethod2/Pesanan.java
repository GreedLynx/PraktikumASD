public class Pesanan {
    int kodePesanan;
    String namaPesanan;
    int harga;

    public Pesanan(int kodePesanan, String namaPesanan, int harga) {
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.harga = harga;
    }

    public void tampil() {
        System.out.println(
            "KODE PESANAN :" + kodePesanan + 
            "\nNAMA PESANAN  :" + namaPesanan + 
            "\nHARGA :" + harga );
    }
}
