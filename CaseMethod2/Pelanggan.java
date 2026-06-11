public class Pelanggan {
    int NoAntrian;
    String namaPembeli;
    String noHP;
    Pesanan pesanan;

    public Pelanggan(int NomerAntrian, String namaPembeli, String noHP) {
        this.NoAntrian = NomerAntrian;
        this.namaPembeli = namaPembeli;
        this.noHP = noHP;
        this.pesanan = null;
    }

    public void tampil() {
        System.out.println(
            "NOMER ANTRIAN :" + NoAntrian + 
            "\nNAMA  :" + namaPembeli + 
            "\nNO HP :" + noHP );
    }
    
}