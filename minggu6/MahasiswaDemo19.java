import java.util.Scanner;

public class MahasiswaDemo19 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            MahasiswaBerprestasi19 list = new MahasiswaBerprestasi19();
            
            System.out.print("Masukkan jumlah mahasiswa: ");
            int jumMhs = sc.nextInt();
            sc.nextLine(); // clear buffer
            
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

            System.out.println("Data mahasiswa sebelum sorting: ");
            list.tampil();

            System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC): ");
            list.bubbleSort();
            list.tampil();
        }
    }
}
