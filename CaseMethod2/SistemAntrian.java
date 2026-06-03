public class SistemAntrian {
    NodePelanggan head;
    NodePelanggan tail;

    public boolean isEmpty(){
        return (head == null);
    }
    // AddLast
    public void TambahPelanggan (Pelanggan data) {
        NodePelanggan NewNode = new NodePelanggan(data);
        if (isEmpty()) {
            head = tail = NewNode;
        } else {
            tail.next = NewNode;
            tail = NewNode;
        }
    }

    // Memanggil dan menghapus pelanggan yang sedang dilayani
    public Pelanggan LayaniPelanggan() {
        if (isEmpty()) {
            return null;
        } 

        Pelanggan pelangganDilayani = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return pelangganDilayani;
    }

    // Menampilkan daftar pelanggan yang sedang menunggu dalam antrean
    public void tampilkanAntreanTunggu(){
        if (isEmpty()) {
            System.out.println("Tidak ada pelanggan dalam antrean.");
        } 
        NodePelanggan temp = head;
        System.out.println("Daftar Pelanggan dalam Antrean:");
        while (temp != null) {
            System.out.println("Nomer Antrian: " + temp.data.NoAntrian + ", Nama: " + temp.data.nama);
            temp = temp.next;
        }
    }

    public void tampilkanLaporanPendapatan () {
        if (isEmpty()) {
            System.out.println("Belum ada pesanan yang diselesaikan.");
        }

        NodePelanggan temp = head;
        double totalPendapatan = 0;
        System.out.println("Laporan Transaksi & Pendapatan :");
        System.out.println("No | Nama Pelanggan | Pesanan \t\t| Harga");
        while (temp != null) {
            System.out.println(temp.data.NoAntrian + " | " + temp.data.nama + " | " + temp.data.Pesanan + "\t | " + temp.data.harga);
            totalPendapatan += temp.data.harga;
            temp = temp.next;
        }
        System.out.println("Total Pendapatan: Rp" + totalPendapatan);
    }
}
