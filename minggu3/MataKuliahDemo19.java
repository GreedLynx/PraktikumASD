import java.util.Scanner;

public class MataKuliahDemo19 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            // Meminta user untuk memasukkan jumlah mata kuliah yang akan diinput
            System.out.print("Masukkan jumlah mata kuliah yang akan diinput: ");
            int jumlahMataKuliah = input.nextInt();
            input.nextLine(); // Membersihkan buffer setelah membaca int

            // Membuat array of object MataKuliah19
            MataKuliah19 [] arrayOfMataKuliah19s = new MataKuliah19[jumlahMataKuliah];
            String kode, nama, dummy;
            int sks, jumlahJam;

            // Mengisi data mata kuliah ke dalam array of object MataKuliah19 dengan input dari user
            for (int i = 0; i < arrayOfMataKuliah19s.length; i++) {
                System.out.println("Masukkan data mata kuliah ke-" + (i+1));
                System.out.print("Kode: ");
                kode = input.nextLine();
                System.out.print("Nama: ");
                nama = input.nextLine();

                System.out.print("SKS: ");
                dummy = input.nextLine(); 
                sks = Integer.parseInt(dummy); // Mengkonversi string ke int

                System.out.print("Jumlah Jam: ");
                jumlahJam = input.nextInt();
                input.nextLine(); // Membersihkan buffer setelah membaca int
                System.out.println("-----------------------------------");

                arrayOfMataKuliah19s[i] = new MataKuliah19(kode, nama, sks);
                arrayOfMataKuliah19s[i].tambahData(kode, nama, sks, jumlahJam);
            }

            for (int i = 0; i < arrayOfMataKuliah19s.length; i++) {
                System.out.println("Data Mata Kuliah ke-" + (i+1));
                arrayOfMataKuliah19s[i].cetakInfo();
            }
        }
    }
}