import java.util.Scanner;

public class MahasiswaDemo19 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            MahasiswaBerprestasi19 list = new MahasiswaBerprestasi19();
            
            int jumMhs = 5;
            
            for(int i = 0; i < jumMhs; i++) {
                System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
                System.out.print("NIM: ");
                String nim = sc.nextLine();
                System.out.print("Nama: ");
                String nama = sc.nextLine();
                System.out.print("Kelas: ");
                String kelas = sc.nextLine();
                System.out.print("IPK: ");
                double ipk = sc.nextDouble();
                sc.nextLine(); // clear buffer
                
                Mahasiswa19 m = new Mahasiswa19(nim, nama, kelas, ipk);
                list.tambah(m);
            }
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
            

        }
    }
}
