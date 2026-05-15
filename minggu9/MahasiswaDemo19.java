import java.util.Scanner;


public class MahasiswaDemo19 {
    public static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        StackTugasMahasiswa19 stack = new StackTugasMahasiswa19(5);
        System.out.println("Masukkan jumlah mahasiswa yang akan dimasukkan ke dalam stack (maksimal 5): ");
        int pilih;
        

        do {
            System.out.println ("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah");
            System.out.println("6. Menghitung Jumlah Tugas");
            System.out.println("7. Keluar");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
            input.nextLine(); // Membersihkan buffer

            switch (pilih) {
                case 1 -> {
                    System.out.print("Nama: ");
                    String nama = input.nextLine();
                    System.out.print("NIM: ");
                    String nim = input.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = input.nextLine();
                    Mahasiswa19 mhs = new Mahasiswa19(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf ("Tugas %s berhasil dikumpulkan", mhs.nama);
                    break;
                }
                case 2 -> {
                    Mahasiswa19 dinilai = stack.peek();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = input.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah nilai %d\n", dinilai.nama, nilai);
                    }
                    break;
                }
                case 3 -> {
                    Mahasiswa19 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh:" + lihat.nama);
                    }
                    break;
                }
                case 4 -> {
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                }
                case 5 -> {
                    stack.bottomPrint();
                    break;
                }
                case 6 -> {
                    System.out.println("Jumlah tugas yang telah dikumpulkan: " + stack.count());
                    break;
                }
                case 7 -> System.out.println("Keluar dari program.");
                default -> System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (pilih >= 1 && pilih <= 6);
    }
}