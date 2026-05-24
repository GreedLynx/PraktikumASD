import java.util.Scanner;

public class SLLMain19 {

    public static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Membuat objek SingleLinkedList19
        SingleLinkedList19 SingList = new SingleLinkedList19();

        // Membuat objek Mahasiswa19
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

    }
}
