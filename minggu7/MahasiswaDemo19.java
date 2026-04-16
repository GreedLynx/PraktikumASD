import java.util.Scanner;

public class MahasiswaDemo19 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            MahasiswaBerprestasi19 list = new MahasiswaBerprestasi19();
            
            System.out.print("Masukkan jumlah mahasiswa: ");
            int jumMhs = sc.nextInt();
            sc.nextLine(); // clear buffer
            
            Mahasiswa19 m1 = new Mahasiswa19("1234", "Andi", "TI-1A", 3.5);
            Mahasiswa19 m2 = new Mahasiswa19("2345", "Budi", "TI-1B", 3.8);
            Mahasiswa19 m3 = new Mahasiswa19("3456", "Citra", "TI-1C", 3.2);
            Mahasiswa19 m4 = new Mahasiswa19("4567", "Dewi", "TI-1D", 3.9);
            Mahasiswa19 m5 = new Mahasiswa19("5678", "Eka", "TI-1E", 3.7);
            
            // menambahkan data mahasiswa ke dalam list
            list.tambah(m1);
            list.tambah(m2);
            list.tambah(m3);
            list.tambah(m4);
            list.tambah(m5);

            // menampilkan data mahasiswa sebelum diurutkan
            list.tampil();
            
            // mengurutkan data mahasiswa berdasarkan IPK menggunakan bubble sort
            list.bubbleSort();
            list.tampil();

            // melakukan pencarian menggunakan metode sequential 
            System.out.println("--------------------------------");
            System.out.println("Pencarian data");
            System.out.println("--------------------------------");
            System.out.println("Masukan IPK yang ingin dicari: ");
            System.out.print("IPK:");
            double cari = sc.nextDouble();

            System.out.println("Menggunakan Sequential Searching");
            double posisi = list.sequentialSearch(cari);
            int pss = (int) posisi;
            list.tampilPosisi(cari, pss);
            list.tampilDataSearch(cari, pss);
            
            // Melakukan pencarian data binary
            System.out.println("--------------------------------");
            System.out.println("Pencarian data");
            System.out.println("--------------------------------");
            System.out.println("Masukan IPK yang ingin dicari: ");
            System.out.print("IPK:");
            double cari2 = sc.nextDouble();

            System.out.println("--------------------------------");
            System.out.println("Menggunakan Binary Searching");
            System.out.println("--------------------------------");

            double posisi2 = list.findBinarySearch(cari, 0, jumMhs-1);
            int pss2 = (int) posisi2;
            list.tampilPosisi(cari2, pss2);
            list.tampilDataSearch(cari2, pss2);            
        }
    }
}
