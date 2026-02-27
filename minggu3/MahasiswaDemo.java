import java.util.Scanner;

public class MahasiswaDemo{
    public static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Membuat array of object Mahasiswa19
        Mahasiswa19 [] arrayOfMahasiswa19s = new Mahasiswa19[3];
        String dummy; 

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

        // Mengisi data mahasiswa ke dalam array of object Mahasiswa19
        arrayOfMahasiswa19s[0] = new Mahasiswa19();
        arrayOfMahasiswa19s[0].nim = "24401192019";
        arrayOfMahasiswa19s[0].nama = "AMBA RUDI ANDIKA";
        arrayOfMahasiswa19s[0].kelas = "TI-1A";
        arrayOfMahasiswa19s[0].ipk = (float)3.75;

        arrayOfMahasiswa19s[1] = new Mahasiswa19();
        arrayOfMahasiswa19s[1].nim = "24401192020";
        arrayOfMahasiswa19s[1].nama = "BUDI SANTOSO";
        arrayOfMahasiswa19s[1].kelas = "TI-1A";
        arrayOfMahasiswa19s[1].ipk = (float)3.36;

        arrayOfMahasiswa19s[2] = new Mahasiswa19();
        arrayOfMahasiswa19s[2].nim = "24401192021";
        arrayOfMahasiswa19s[2].nama = "CINDY LESTARI";
        arrayOfMahasiswa19s[2].kelas = "TI-1A";
        arrayOfMahasiswa19s[2].ipk = (float)3.89;

        System.out.println("Data Mahasiswa:");
        System.out.println("NIM    : " + arrayOfMahasiswa19s[0].nim);
        System.out.println("Nama   : " + arrayOfMahasiswa19s[0].nama);
        System.out.println("Kelas  : " + arrayOfMahasiswa19s[0].kelas);
        System.out.println("IPK    : " + arrayOfMahasiswa19s[0].ipk);
        System.out.println("-----------------------------------");

        System.out.println("NIM    : " + arrayOfMahasiswa19s[1].nim);
        System.out.println("Nama   : " + arrayOfMahasiswa19s[1].nama);
        System.out.println("Kelas  : " + arrayOfMahasiswa19s[1].kelas);
        System.out.println("IPK    : " + arrayOfMahasiswa19s[1].ipk);
        System.out.println("-----------------------------------");

        System.out.println("NIM    : " + arrayOfMahasiswa19s[2].nim);
        System.out.println("Nama   : " + arrayOfMahasiswa19s[2].nama);
        System.out.println("Kelas  : " + arrayOfMahasiswa19s[2].kelas);
        System.out.println("IPK    : " + arrayOfMahasiswa19s[2].ipk);
        System.out.println("-----------------------------------");
    }
}