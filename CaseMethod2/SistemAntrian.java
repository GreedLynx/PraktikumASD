public class SistemAntrian {
    NodePelanggan head;
    NodePelanggan tail;

    public boolean isEmpty(){
        return (head == null);
    }
    // AddLast
    public void tambahPelanggan (Pelanggan data) {
        NodePelanggan newNode = new NodePelanggan(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Memanggil dan menghapus pelanggan yang sedang dilayani remove first
    public Pelanggan layaniPelanggan() {
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
            return;
        } 
        NodePelanggan temp = head;
        System.out.println("Daftar Pelanggan dalam Antrean:");
        System.out.println("Nomer Antrian \t | Nama \t | No HP ");
        while (temp != null) {
            System.out.println(temp.data.noAntrian + "\t\t | " + temp.data.namaPembeli + " \t | " + temp.data.noHP);
            temp = temp.next;
        }
    }

    public void tampilkanLaporanPendapatan () {
        // jangan kasih kendor, kasih aman biar gak nullpointerexception 
        if (isEmpty()) {
            System.out.println("Belum ada pesanan yang diselesaikan.");
            return;
        }

        // 1. Sorting Bubble Sort
        boolean swap;
        NodePelanggan current;
        do {
            swap = false;
            current = head;
            while (current.next != null) {
                // Pengaman: pastikan keduanya memiliki data pesanan sebelum membandingkan
                if (current.data.pesanan != null && current.next.data.pesanan != null) {
                    if (current.data.pesanan.namaPesanan.compareToIgnoreCase(current.next.data.pesanan.namaPesanan) > 0) {
                        Pelanggan temp = current.data;
                        current.data = current.next.data;
                        current.next.data = temp;
                        swap = true;
                    }
                }
                current = current.next;
            }
        } while (swap);

        // 2. Cetak Laporan
        NodePelanggan temp = head;
        double totalPendapatan = 0;
        System.out.println("\n=== Laporan Transaksi & Pendapatan ===");
        System.out.println("No\t | Nama Pelanggan\t | Pesanan \t| Harga");
        
        while (temp != null) {
            if (temp.data.pesanan != null) {
                System.out.println(temp.data.noAntrian + "\t | " + temp.data.namaPembeli + 
                                    " \t\t| " + temp.data.pesanan.namaPesanan + 
                                    "\t| Rp" + temp.data.pesanan.harga);
                totalPendapatan += temp.data.pesanan.harga;
            }
            temp = temp.next;
        }
        System.out.println("---------------------------------------");
        System.out.println("Total Pendapatan: Rp" + totalPendapatan);
    }
}
