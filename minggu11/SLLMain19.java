import java.util.Scanner;
public class SLLMain19 {
    // Membuat objek Scanner untuk input
    public static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Membuat objek SingleLinkedList19
        SingleLinkedList19 SingList = new SingleLinkedList19();

        // Modifikasi input data Mahasiswa
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = input.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = input.nextDouble();
        Mahasiswa19 mhs = new Mahasiswa19(nama, nim, kelas, ipk);
        SingList.addFirst(mhs);

        // Percobaan 1
        Mahasiswa19 mhs1 = new Mahasiswa19("Rizky", "123456789", "TI-1A", 3.5);
        Mahasiswa19 mhs2 = new Mahasiswa19("Dewi", "987654321", "TI-1B", 3.8);
        Mahasiswa19 mhs3 = new Mahasiswa19("Andi", "456789123", "TI-1C", 3.2);
        Mahasiswa19 mhs4 = new Mahasiswa19("Siti", "321654987", "TI-1D", 3.9);

        SingList.print();
        SingList.addFirst(mhs4);
        SingList.print();
        SingList.addLast(mhs1);
        SingList.print();
        SingList.insertAfter(mhs3, "Rizky");
        SingList.inserAt(mhs4, 2);
        SingList.print();

        // Percobaan 2
        System.out.println("Data indeks 1: ");
        SingList.getData(1);

        System.out.println("Data Mahasiswa dengan nama Rizky berada pada indeks: " + SingList.indexOf("Rizky"));
        System.out.println("");

        SingList.removeFirst();
        SingList.removeLast();
        SingList.print();
        SingList.removeAt(0);
        SingList.print();
    }
}
