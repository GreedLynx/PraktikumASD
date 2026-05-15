public class PeminjamanManager19 {
    // Array untuk menyimpan data peminjaman
    Peminjaman19 [] daftarPinjam = new Peminjaman19 [100];
    int idx = 0;

    // Fungsi 1 Menambahkan data peminjaman
    public void tambah(Peminjaman19 p) {
        if (idx < daftarPinjam.length) {
            daftarPinjam[idx] = p;
            idx++;
        } else {
            System.out.println("Data peminjaman sudah penuh.");
        }
    }

    // Fungsi 2 Menampilkan semua data peminjaman
    public void tampilSemuaTransaksi() {
        if (idx == 0) {
            System.out.println("Belum ada data peminjaman.");
            return;
        }
        System.out.println("Data peminjaman:");
        for (int i = 0; i < idx; i++) {
            daftarPinjam[i].tampilPeminjaman();
        }
    }

    // Fungsi 3 Mengurutkan data peminjaman berdasarkan denda Descending insertion sort
    public void urutBerdasarkanDenda() {
        for (int i = 1; i < idx; i++) {
            Peminjaman19 temp = daftarPinjam[i];
            int j = i - 1;

            while (j >= 0 && daftarPinjam[j].denda < temp.denda) {
                daftarPinjam[j + 1] = daftarPinjam[j];
                j--;
            }
            daftarPinjam[j + 1] = temp;
        }
        System.out.println("Data peminjaman berhasil diurutkan berdasarkan denda.");
    }

    // Fungsi 4 Cari berdasarkan NIM 
    public void urutBerdasarkanNIM () {
        for (int i = 1; i < idx; i++) {
            Peminjaman19 temp = daftarPinjam[i];
            int j = i - 1;

            while (j >= 0 && daftarPinjam[j].mhs.nim.compareTo(temp.mhs.nim) > 0) {
                daftarPinjam[j + 1] = daftarPinjam[j];
                j--;
            }   
            daftarPinjam[j + 1] = temp;
        }
    }

    public void cariBerdasarkanNIM (String nimCari) {
        urutBerdasarkanNIM();

        int left = 0;
        int right = idx - 1;
        boolean ketemu = false;

        // Binary search untuk mencari NIM yang sama
        while (left <= right) {
            int mid = left + right / 2;
            if (daftarPinjam[mid].mhs.nim.equals(nimCari)) {
                System.out.println("Data ditemukan:");
                daftarPinjam[mid].tampilPeminjaman();
                ketemu = true;
                
                // Cek ke kiri dan kanan untuk data dengan NIM yang sama
                int tempKiri = mid -1;
                while (tempKiri >= 0 && daftarPinjam[tempKiri].mhs.nim.equals(nimCari)) {
                    daftarPinjam[tempKiri].tampilPeminjaman();
                    tempKiri--;
                }

                // Cek ke kanan untuk data dengan NIM yang sama
                int tempKanan = mid + 1;
                while (tempKanan < idx && daftarPinjam[tempKanan].mhs.nim.equals(nimCari)){
                    daftarPinjam[tempKanan].tampilPeminjaman();
                    tempKanan++;
                }
                return;
            } else if (nimCari.compareTo(daftarPinjam[mid].mhs.nim) < 0) {
                right = mid -1;
            } else {
                left = mid + 1;
            }
            
        }
        if (!ketemu) {
            System.out.println("Data tidak ditemukan.");
        }
    }

    // Modifikasi B3 sorting 
    public void urutBerdasarkanNama () {
        for (int i = 1; i < idx; i++) {
            Peminjaman19 temp = daftarPinjam[i];
            int j = i - 1;

            while (j >= 0 && daftarPinjam[j].mhs.nama.compareTo(temp.mhs.nama) > 0) {
                daftarPinjam[j + 1] = daftarPinjam[j];
                j--;
            }   
            daftarPinjam[j + 1] = temp;
        }
    }

    // Modifikasi B3 cari berdasarkan nama
    public void cariBerdasarkanNama (String namaCari){
        urutBerdasarkanNama();

        int left = 0;
        int right = idx - 1;
        boolean ketemu = false;

        // Binary search untuk mencari nama yang sama
        while (left <= right) {
            int mid = left + right / 2;
            if (daftarPinjam[mid].mhs.nama.equals(namaCari)) {
                System.out.println("Data ditemukan:");
                daftarPinjam[mid].tampilPeminjaman();
                ketemu = true;
                
                // Cek ke kiri dan kanan untuk data dengan Nama yang sama
                int tempKiri = mid -1;
                while (tempKiri >= 0 && daftarPinjam[tempKiri].mhs.nama.equals(namaCari)) {
                    daftarPinjam[tempKiri].tampilPeminjaman();
                    tempKiri--;
                }

                // Cek ke kanan untuk data dengan Nama yang sama
                int tempKanan = mid + 1;
                while (tempKanan < idx && daftarPinjam[tempKanan].mhs.nama.equals(namaCari)){
                    daftarPinjam[tempKanan].tampilPeminjaman();
                    tempKanan++;
                }
                return;
            } else if (namaCari.compareTo(daftarPinjam[mid].mhs.nama) < 0) {
                right = mid -1;
            } else {
                left = mid + 1;
            }
            
        }
        if (!ketemu) {
            System.out.println("Data tidak ditemukan.");
        }
    }

    // Modifikasi C3 Hitung Rerata lama pinjam 
    double hitungRerataLamaPinjamPerMahasiswa(){

        double totalLamaPinjam = 0;
        double rerataLamaPinjam = 0;

        for (int i = 0; i < idx ; i++){
            if (daftarPinjam[i].lamaPinjam > 0) {
                totalLamaPinjam += daftarPinjam[i].lamaPinjam;
                rerataLamaPinjam = totalLamaPinjam / idx;
            }
        }
        return rerataLamaPinjam;
    }
}