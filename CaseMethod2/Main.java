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
            System.out.println("2. Cetak Antrean");
            System.out.println("3. Hapus antrian dan pesan");
            System.out.println("4. Tampilkan Laporan Pendapatan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // Clear the newline character

            switch (pilihan) {
                case 1 -> {
                    System.out.print("Masukkan Nama Pelanggan : ");
                    String nama = input.nextLine();

                    System.out.print("Masukkan no HP          : ");
                    String noHP = input.nextLine();

                    Pelanggan pelangganBaru = new Pelanggan(noAntrian, nama, noHP);
                    antrean.tambahPelanggan(pelangganBaru);
                    noAntrian++;
                    System.out.println("Pelanggan berhasil ditambahkan ke antrean.");
                }

                case 2 -> antrean.tampilkanAntreanTunggu();

                case 3 -> {
                    Pelanggan p = antrean.layaniPelanggan();
                    if (p != null) {
                        System.out.print("Kode Pesanan    : ");
                        int kodePesanan = input.nextInt();
                        input.nextLine(); // Clear the newline character

                        System.out.print("Nama Pesanan    : ");
                        String namaPesanan = input.nextLine();

                        System.out.print("Harga           : ");
                        int harga = input.nextInt();
                        input.nextLine(); // Clear the newline character
                        p.pesanan = new Pesanan(kodePesanan, namaPesanan, harga);
                        riwayat.tambahPelanggan(p);
                    } else {
                        System.out.println("Tidak ada pelanggan dalam antrean.");
                    }
                }

                case 4 -> riwayat.tampilkanLaporanPendapatan();

                case 5 -> System.out.println("Terima kasih telah menggunakan sistem antrian.");

                default -> System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);
    }
}
