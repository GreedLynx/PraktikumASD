public class Pelanggan {
    int noAntrian;
    String namaPembeli;
    String noHP;
    Pesanan pesanan;

    public Pelanggan(int noAntrian, String namaPembeli, String noHP) {
        this.noAntrian = noAntrian;
        this.namaPembeli = namaPembeli;
        this.noHP = noHP;
        this.pesanan = null;
    }

    public void tampil() {
        System.out.println(
            "NOMER ANTRIAN :" + noAntrian + 
            "\nNAMA  :" + namaPembeli + 
            "\nNO HP :" + noHP );
    }
    
}