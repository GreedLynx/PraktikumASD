import java.util.Scanner;

public class RuangBaca {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // 1. BUAT SATU MANAGER UTAMA UNTUK SELURUH PROGRAM
            PeminjamanManager19 manager = new PeminjamanManager19();

            Mahasiswa19 mhs1 = new Mahasiswa19 ("22001", "Andi", "Teknik Informatika");
            Mahasiswa19 mhs2 = new Mahasiswa19 ("22002", "Budi", "Teknik Informatika");
            Mahasiswa19 mhs3 = new Mahasiswa19 ("22003", "Citra", "Teknik Informatika");
            Mahasiswa19 [] daftarMhs = {mhs1, mhs2, mhs3};

            Buku19 buku1 = new Buku19 ("B001", "Algoritma", 2020);
            Buku19 buku2 = new Buku19 ("B002", "Basis Data", 2019);
            Buku19 buku3 = new Buku19 ("B003", "Pemrograman", 2021);
            Buku19 buku4 = new Buku19 ("B004", "Fisika", 2024);
            Buku19 [] daftarBuku = {buku1, buku2, buku3, buku4};

            // 2. MASUKKAN DATA LANGSUNG KE DALAM RAK MANAGER
            manager.tambah(new Peminjaman19(mhs1, buku1, 7));
            manager.tambah(new Peminjaman19(mhs2, buku2, 3));
            manager.tambah(new Peminjaman19(mhs3, buku3, 10));
            manager.tambah(new Peminjaman19(mhs3, buku4, 6));
            manager.tambah(new Peminjaman19(mhs1, buku2, 4));

            int pilih; 
            do {
                System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
                System.out.println("1. Tampilkan Mahasiswa");
                System.out.println("2. Tampilkan Buku");
                System.out.println("3. Tampilkan Peminjaman");
                System.out.println("4. Urutkan Berdasarkan Denda");
                System.out.println("5. Cari Berdasarkan NIM");
                System.out.println("0. Keluar");
                System.out.print("Pilih: ");
                pilih = input.nextInt();
                input.nextLine(); // Clear buffer

                switch (pilih) {
                    case 1 -> {
                        System.out.println("\nData Mahasiswa:");
                        for (Mahasiswa19 mhs : daftarMhs ) mhs.tampilMahasiswa();
                    }
                    case 2 -> {
                        System.out.println("\nData Buku:");
                        for (Buku19 buku : daftarBuku ) buku.tampilBuku();
                    }
                    case 3 -> {
                        // PERBAIKAN: Akses langsung fungsi dari manager, jangan pakai array mentah
                        manager.tampilSemuaTransaksi(); 
                    }
                    case 4 -> {
                        manager.urutBerdasarkanDenda();
                        System.out.println("\nData Peminjaman Setelah Diurutkan:");
                        manager.tampilSemuaTransaksi();
                    }
                    case 5 -> {
                        System.out.print("Masukkan NIM yang ingin dicari: ");
                        String nimCari = input.nextLine();
                        manager.cariBerdasarkanNIM(nimCari);
                    }
                    case 0 -> System.out.println("Keluar program...");
                    default -> System.out.println("Pilihan tidak valid.");
                }
            } while (pilih != 0);
        }
    }
}