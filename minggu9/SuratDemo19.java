import java.util.Scanner;

public class SuratDemo19 {
    public static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        StackSurat19 stack = new StackSurat19(5);

        int pilih;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terkahir");
            System.out.println("4. Cari Surat Izin");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
            input.nextLine(); // Membersihkan buffer

            switch (pilih) {
                case 1 -> {
                    System.out.print("ID Surat: ");
                    String idSurat = input.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String namaMahasiswa = input.nextLine();
                    System.out.print("Kelas:");
                    String kelas = input.nextLine();
                    System.out.print("Jenis Izin (S = Sakit, I = Izin, A = Alpa): ");
                    char jenisIzin = input.nextLine().charAt(0);
                    System.out.print("Durasi (dalam hari): ");
                    int durasi = input.nextInt();
                    Surat19 surat = new Surat19(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
                    stack.push(surat);
                    System.out.println("Surat Berhasil Dikumpulkan");
                    break;
                }
                case 2 -> {
                    Surat19 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Memproses surat dari " + diproses.namaMahasiswa);
                        System.out.println("ID Surat: " + diproses.idSurat);
                        System.out.println("Kelas: " + diproses.kelas);
                        System.out.println("Jenis Izin: " + diproses.jenisIzin);
                        System.out.println("Durasi: " + diproses.durasi + " hari");
                    } else {
                        System.out.println("Stack kosong, tidak ada surat untuk diproses.");
                    }
                    break;
                }
                case 3 -> {
                    Surat19 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir yang diterima:");
                        System.out.println("ID Surat: " + lihat.idSurat);
                        System.out.println("Nama Mahasiswa: " + lihat.namaMahasiswa);
                        System.out.println("Kelas: " + lihat.kelas);
                        System.out.println("Jenis Izin: " + lihat.jenisIzin);
                        System.out.println("Durasi: " + lihat.durasi + " hari");
                    } else {
                        System.out.println("Stack kosong, tidak ada surat yang diterima.");
                    }
                    break;
                }
                case 4 -> {
                    System.out.print("Nama Mahasiswa yang dicari: ");
                    String namaDicari = input.nextLine();
                    stack.cariSurat(namaDicari);
                    break;
                }
                case 5 -> {
                    System.out.println("Keluar dari program.");
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 5);
    }
}
