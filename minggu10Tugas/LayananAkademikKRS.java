import java.util.Scanner;

public class LayananAkademikKRS {
    public static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        AntrianLayanan antrian = new AntrianLayanan(10);
        int pilihan;
        
        do {
            System.out.println("\n=== Layanan Akademik SIAKAD ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat 2 Mahasiswa Terdepan");
            System.out.println("4. Tampilkan Semua Antrian");
            System.out.println("5. Jumlah Mahasiswa dalam Antrian");
            System.out.println("6. Lihat Mahasiswa Terakhir");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("8. Lihat Apakah Antrian Kosong atau Penuh");
            System.out.println("9. Lihat Mahasiswa yang sudah dilayani");
            System.out.println("10. Jumlah Mahasiswa yang belum melakukan proses KRS");
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
                    Mahasiswa[] dilayaniArray = antrian.LayaniMahasiswa();
                    if (dilayaniArray != null) {
                        System.out.println("Melayani Mahasiswa: ");
                        for (Mahasiswa mhs : dilayaniArray) {
                            if (mhs != null) {
                                mhs.tampilkanData();
                            }
                        }
                    } else {
                        System.out.println("Tidak ada mahasiswa yang dapat dilayani.");
                        break;
                    }   
                }

                case 3 -> {
                    Mahasiswa[] terdepan = antrian.lihatTerdepan();
                    if (terdepan != null) {
                        System.out.println("Mahasiswa Terdepan: ");
                        for (Mahasiswa mhs : terdepan) {
                            if (mhs != null) {
                                mhs.tampilkanData();
                            }
                        }
                    } else {
                        System.out.println("Tidak ada mahasiswa dalam antrian.");
                    }
                }
                case 4 -> antrian.tampilkanSemua();
                case 5 -> System.out.println("Jumlah Mahasiswa dalam Antrian: " + antrian.getJumlahAntrian());
                case 6 -> antrian.lihatAkhir();
                case 7 -> antrian.kosongkanAntrian();
                case 8 -> {
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong.");
                    } else if (antrian.isFull()) {
                        System.out.println("Antrian penuh.");
                    } else {
                        System.out.println("Antrian tidak kosong dan tidak penuh.");
                    }
                }
                case 9 -> antrian.lihatDilayani();
                case 10 -> antrian.jumlahBelumKRS();
                case 0 -> System.out.println("Terima kasih telah menggunakan layanan akademik SIAKAD.");
                default -> System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (pilihan != 0); 
    }
}
