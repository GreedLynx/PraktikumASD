import java.util.Scanner;

public class MahasiswaDemo{
    public static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Membuat array of object Mahasiswa19
        Mahasiswa19 [] arrayOfMahasiswa19s = new Mahasiswa19[3];
        String dummy; 

        // Mengisi data mahasiswa ke dalam array of object Mahasiswa19 dengan input dari user
        for (int i = 0; i < arrayOfMahasiswa19s.length; i++) {
            arrayOfMahasiswa19s[i] = new Mahasiswa19();
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            System.out.print("NIM: ");
            arrayOfMahasiswa19s[i].nim = input.nextLine();
            System.out.print("Nama: ");
            arrayOfMahasiswa19s[i].nama = input.nextLine();
            System.out.print("Kelas: ");
            arrayOfMahasiswa19s[i].kelas = input.nextLine();
            System.out.print("IPK: ");
            arrayOfMahasiswa19s[i].ipk = input.nextFloat();
            dummy = input.nextLine(); // Membersihkan buffer setelah membaca float
            System.out.println("-----------------------------------");  
        }

        // Menampilkan data mahasiswa yang telah diisi
        for (int i = 0; i < arrayOfMahasiswa19s.length; i++) {
            System.out.println("Data mahasiswa ke-" + (i+1));
            arrayOfMahasiswa19s[i].cetakInfo();
            System.out.println("-----------------------------------");
        }
    }
}