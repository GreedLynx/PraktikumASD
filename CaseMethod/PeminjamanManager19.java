public class PeminjamanManager19 {
    Peminjaman [] daftarPinjam = new Peminjaman [100];
    int idx = 0;

    // Fungsi 1
    public void tambah(Peminjaman p) {
        if (idx < daftarPinjam.length) {
            daftarPinjam[idx] = p;
            idx++;
        } else {
            System.out.println("Data peminjaman sudah penuh.");
        }
    }

    // Fungsi 2
    public void tampilSemua() {
        for (int i = 0; i < idx; i++) {
            daftarPinjam[i].tampilPeminjaman();
        }
    }

    // Fungsi 3
    public void urutBerdasarkanDenda() {
        for (int i = 1; i < idx; i++) {
            Peminjaman temp = daftarPinjam[i];
            int j = i - 1;

            while (j >= 0 && daftarPinjam[j].denda > temp.denda) {
                daftarPinjam[j + 1] = daftarPinjam[j];
                j--;
            }
            daftarPinjam[j + 1] = temp;
        }
    }
}