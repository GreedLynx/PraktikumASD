package minggu1;

import java.util.Scanner;

public class coba1 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            // Inisialisasi array penonton
        String[][] penonton = new String[4][2];

        // Menu utama
        System.out.println("Menu Utama: ");
        System.out.println("1. Input Penonton");
        System.out.println("2. Tampilkan Penonton");
        System.out.println("3. keluar");
        System.out.print("Pilih menu (1/2/3): ");
        int menu = input.nextInt();
        input.nextLine(); //buat spasi
        
        // Proses berdasarkan pilihan menu
            switch (menu) {
                case 1 -> {
                    String namaPenonton;
                    int baris, kolom;
    
                    while(true) { // Loop untuk validasi input baris/kolom
                    System.out.print("Masukkan nama penonton: ");
                    namaPenonton = input.nextLine();
                    System.out.print("Masukkan baris (1-4): ");
                    baris = input.nextInt();
                    System.out.print("Masukkan kolom (1-2): ");
                    kolom = input.nextInt();
                    input.nextLine(); // Consume newline

                    // --- VALIDASI BATAS ARRAY (SOAL 3) ---
                    if (baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[0].length) {
                        System.out.println("❌ ERROR: Nomor baris/kolom tidak valid (di luar batas array). Ulangi.");
                        continue; // Ulangi loop validasi
                    }
                    
                    // --- VALIDASI KURSI TERISI (SOAL 4) ---
                    // Pengecekan pada indeks array [baris-1][kolom-1]
                    if (penonton[baris - 1][kolom - 1] != null) { 
                        System.out.println("⚠️ WARNING: Kursi sudah terisi oleh penonton lain. Masukkan baris dan kolom kembali.");
                        continue; // Ulangi loop validasi
                    }
                    
                    // Jika validasi lolos, masukkan data
                    penonton[baris - 1][kolom - 1] = namaPenonton;
                    System.out.println("✅ Penonton berhasil ditambahkan.");
                    break; // Keluar dari loop validasi (while(true))
                        }
                        break;
                    }
                case 2 -> {
                    System.out.println("Daftar Penonton: ");
                    for (int i = 0; i < penonton.length; i++) {
                        System.out.println("Penonton pada baris ke-" + (i+1) + " : " + String.join(", ", penonton[i]));
                    }
                }
                default -> System.out.println("Keluar dari program.");
            }
        }
    }
}