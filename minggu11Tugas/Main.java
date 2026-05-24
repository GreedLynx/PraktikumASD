import java.util.Scanner;

public class Main {
    public static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int pilihan;
        AntrianMahasiswa19 antrian = new AntrianMahasiswa19();

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Cek Antrian Terdepan");
            System.out.println("4. Cek Antrian Terakhir");
            System.out.println("5. Cek Jumlah Antrian");
            System.out.println("6. Mengosongkan Antrian");
            System.out.println("7. Cek Antrian kosong atau tidak");
            System.out.println("8. Apakah Antrian penuh atau tidak");
            System.out.println("0. Keluar");
            pilihan = input.nextInt();
            input.nextLine();

            switch(pilihan) {
                case 1 -> {
                    System.out.print("Masukkan NIM: ");
                    String nim = input.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = input.nextLine();
                    System.out.print("Masukkan Jurusan: ");
                    String jurusan = input.nextLine();
                    Mahasiswa19 mhs = new Mahasiswa19(nama, nim, kelas, jurusan);
                    antrian.tambahAntrian(mhs);
                }
                case 2 -> {
                    antrian.panggilAntrian();
                }
                case 3 -> {
                    antrian.tampilAntrianTerdepan();
                }
                case 4 -> {
                    antrian.tampilAntrianTerakhir();
                }
                case 5 -> {
                    System.out.println("Jumlah Antrian: " + antrian.jumlahAntrian());
                }
                case 6 -> {
                    antrian.mengkosongkanAntrian();
                }
                case 7 -> {
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong.");
                    } else {
                        System.out.println("Antrian tidak kosong.");
                    }
                }
                case 8 -> {
                    if (antrian.isFull()) {
                        System.out.println("Antrian penuh.");
                    } else {
                        System.out.println("Antrian tidak penuh.");
                    }
                }
            }
        } while (pilihan != 0);
    }
    
}