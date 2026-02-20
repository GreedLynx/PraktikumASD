package minggu1;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        
        // Array 2D untuk nama kota 
        // Baris = Jumlah kode, Kolom = Karakter nama kota
        char[][] KOTA = {
            {'B', 'A', 'N', 'T', 'E', 'N'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
            {'B', 'O', 'G', 'O', 'R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'},
            {'T', 'E', 'G', 'A', 'L'}
        };

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Masukkan Kode Plat Nomor: ");
            char input = sc.next().charAt(0);
            
            int indexFound = -1;
            
            // Mencari index kode
            for(int i = 0; i < KODE.length; i++) {
                if(KODE[i] == input) {
                    indexFound = i;
                    break;
                }
            }
            
            if (indexFound != -1) {
                System.out.print("Kota: ");
                for (char c : KOTA[indexFound]) {
                   // Skip karakter kosong jika array diinisialisasi fixed size, 
                   // tapi karena inisialisasi langsung {..}, loop ini aman.
                System.out.print(c);
                }
                System.out.println();
            } else {
                System.out.println("Kode plat tidak ditemukan.");
            }
        }
    }
}
