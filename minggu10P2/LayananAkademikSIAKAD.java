import java.util.Scanner;

public class LayananAkademikSIAKAD {
    public static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        AntrianLayanan antrian = new AntrianLayanan(5);
        int pilihan;
        do {
            System.out.println("\n=== Layanan Akademik SIAKAD ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Tampilkan Semua Antrian");
            System.out.println("5. Jumlah Mahasiswa dalam Antrian");
            System.out.println("6. Lihat Mahasiswa Terakhir");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // Clear buffer

            switch (pilihan) {
                case 1 -> {
                    System.out.print("Masukkan NIM: ");
                    String nim = input.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan Prodi: ");
                    String prodi = input.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = input.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                }
                case 2 -> {
                    Mahasiswa dilayani = antrian.LayaniMahasiswa();
                    if (dilayani != null) {
                        System.out.println("Melayani Mahasiswa: ");
                        dilayani.tampilkanData();
                    }
                }
                case 3 -> antrian.lihatTerdepan();
                case 4 -> antrian.tampilkanSemua();
                case 5 -> System.out.println("Jumlah Mahasiswa dalam Antrian: " + antrian.getJumlahAntrian());
                case 6 -> antrian.lihatAkhir();
                case 0 -> System.out.println("Terima kasih telah menggunakan layanan akademik SIAKAD.");
                default -> System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (pilihan != 0); 
    }
}
