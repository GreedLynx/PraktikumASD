import java.util.Scanner;

public class DosenDemo19 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            String kode, nama, dummy;
            Boolean jenisKelamin;
            int usia;

            System.out.print("Masukkan jumlah dosen yang akan diinput: ");
            int jumlah = input.nextInt();
            input.nextLine(); // Membersihkan buffer setelah membaca int

            Dosen19[] arrayOfDosen = new Dosen19[jumlah];
            for (int i = 0; i < arrayOfDosen.length; i++) {
                System.out.println("Masukkan data dosen ke-" + (i+1));
                System.out.print("Kode: ");
                kode = input.nextLine();
                System.out.print("Nama: ");
                nama = input.nextLine();

                System.out.print("Jenis Kelamin (true untuk Pria, false untuk Wanita): ");
                dummy = input.nextLine();
                Boolean jk = false;
                if (dummy.equalsIgnoreCase("Pria")){
                    jk = true;
                }

                System.out.print("Usia: ");
                usia = input.nextInt();
                input.nextLine(); // Membersihkan buffer setelah membaca int

                arrayOfDosen[i] = new Dosen19(kode, nama, jk, usia);
            }

            System.out.println("\n=== DATA DOSEN ===");
            for (Dosen19 dsn : arrayOfDosen) {
                System.out.println("Kode          : " + dsn.kode);
                System.out.println("Nama          : " + dsn.nama);
                System.out.println("Jenis Kelamin : " + (dsn.jenisKelamin ? "Pria" : "Wanita"));
                System.out.println("Usia          : " + dsn.usia);
                System.out.println("-------------------------------");
            }

            DataDosen19 dataDosen = new DataDosen19();
            dataDosen.jumlahDosenPerJenisKelamin(arrayOfDosen);
            dataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
            dataDosen.infoDosenPalingTua(arrayOfDosen);
            dataDosen.infoDosenPalingMuda(arrayOfDosen);
        }
    }
}
