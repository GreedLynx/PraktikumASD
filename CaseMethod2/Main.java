import java.util.Scanner;

public class Main {
    public final static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        int noAntrian = 1;
        SistemAntrian antrean = new SistemAntrian();
        SistemAntrian riwayat = new SistemAntrian();
        do {
            System.out.println("\n=== Sistem Antrian Pelanggan ===");
            System.out.println("1. Tambah Pelanggan");
            System.out.println("2. Layani Pelanggan");
            System.out.println("3. Tampilkan Antrean Tunggu");
            System.out.println("4. Tampilkan Laporan Pendapatan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // Clear the newline character

            switch (pilihan) {
                case 1:
                    input.nextLine(); // Clear the newline character
                    System.out.print("Masukkan Nama Pelanggan: ");
                    String nama = input.nextLine();

                    Pelanggan pelangganBaru = new Pelanggan(noAntrian, nama, "Belum memesan", 0);
                    antrean.TambahPelanggan(pelangganBaru);
                    noAntrian++;
                    System.out.println("Pelanggan berhasil ditambahkan ke antrean.");
                    break;

                case 2:
                    Pelanggan Dilayani = antrean.LayaniPelanggan();
                    
                    if (Dilayani != null) {
                        System.out.println("Melayani Pelanggan Nomer Antrian: " + Dilayani.NoAntrian + ", Nama: " + Dilayani.nama);
                        System.out.print("Masukkan Pesanan: ");
                        Dilayani.Pesanan = input.nextLine();
                        System.out.print("Masukkan Harga: ");
                        Dilayani.harga = input.nextDouble();
                        input.nextLine(); // Clear the newline character
                        riwayat.TambahPelanggan(Dilayani);
                        System.out.println("Pelanggan telah dilayani dan ditambahkan ke riwayat.");}
                    break;

                case 3:
                    antrean.tampilkanAntreanTunggu();
                    break;

                case 4:
                    riwayat.tampilkanLaporanPendapatan();
                    break;

                case 5:
                    System.out.println("Terima kasih telah menggunakan sistem antrian.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);
    }
}
