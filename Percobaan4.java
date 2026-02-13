public class Percobaan4 {
    // Data stok tanaman di setiap cabang RoyalGarden
    static int[][] stock = {
        {10, 5, 15, 7},  // RoyalGarden 1
        {6, 11, 9, 12},  // RoyalGarden 2
        {2, 10, 10, 5},  // RoyalGarden 3
        {5, 7, 12, 9}    // RoyalGarden 4
    };

    // Harga per jenis tanaman Aglonema=75k, Keladi=50k, Alocasia=60k, Mawar=10k
    static int[] harga = {75000, 50000, 60000, 10000}; 

    
    // Menampilkan Pendapatan dan Status Cabang
    static void cekPendapatanDanStatus() {
        for (int i = 0; i < stock.length; i++) {
            int pendapatan = 0;
            
            // Hitung total pendapatan per cabang (baris)
            for (int j = 0; j < stock[i].length; j++) {
                pendapatan += stock[i][j] * harga[j];
            }

            // Tampilkan Pendapatan
            System.out.print("RoyalGarden " + (i + 1) + " | Pendapatan: Rp " + String.format("%,d", pendapatan));
            
            // Cek Status sesuai ketentuan 
            if (pendapatan > 1500000) {
                System.out.println(" -> Status: Sangat Baik");
            } else {
                System.out.println(" -> Status: Perlu Evaluasi");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("--- Laporan Pendapatan & Status Cabang RoyalGarden ---");
        cekPendapatanDanStatus();
    }
}