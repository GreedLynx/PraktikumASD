import java.util.Scanner;

public class DoubleLinkedListMain19 {
    public static final Scanner input = new Scanner(System.in);

    public static Mahasiswa19 inputMahasiswa(Scanner input){
        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan kelas: ");
        String kelas = input.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = input.nextDouble();
        input.nextLine();
        return new Mahasiswa19(nim, nama, kelas, ipk);
    }
    public static void main(String[] args) {
        int pilihan;
        DoubleLinkedList list = new DoubleLinkedList();

        do {
            System.out.println("=== Menu: ===");
            System.out.println("1. Tambah Data Pertama");
            System.out.println("2. Tambah Data Terakhir");
            System.out.println("3. Sisipkan Data di tengah (Setelah NIM)");
            System.out.println("4. Hapus Data di awal");
            System.out.println("5. Hapus Data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch(pilihan) {
                case 1 -> {
                    Mahasiswa19 mhsAwal = inputMahasiswa(input);
                    list.addFirst(mhsAwal);
                    break;
                } 
                case 2 -> {
                    Mahasiswa19 mhsAkhir = inputMahasiswa(input);
                    list.addLast(mhsAkhir);
                    break;
                }
                case 3 -> {
                    System.out.print("Masukkan NIM yang dicari: ");
                    String KeyNIM = input.nextLine();
                    System.out.println("Masukkan data baru: ");
                    Mahasiswa19 dataBaru = inputMahasiswa(input);
                    list.insertAfter(KeyNIM, dataBaru);
                    break;
                }
                case 4 -> {
                    list.removeFirst();
                    break;
                }
                case 5 -> {
                    list.removeLast();
                    break;
                }
                case 6 -> {
                    list.print();
                    break;
                }
                case 0 -> {
                    System.out.println("Terima kasih!");
                    break;
                }
                default -> {
                    System.out.println("Pilihan tidak valid!");
                    break;  
                }
            }
        } while (pilihan != 0);
    }
}
