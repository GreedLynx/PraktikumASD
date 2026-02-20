import java.util.Scanner;

public class Percobaan1 {
public static void main(String[] args) {
    try(Scanner scanner = new Scanner(System.in)){

        System.out.println("Program Menghitung Nilai Akhir dan Menentukan Grade Mahasiswa");
        System.out.println("================================================");
        //input komponen nilai 
        System.out.print("Masukkan nilai tugas (0-100): ");
        double tugas = scanner.nextDouble();
        System.out.print("Masukkan nilai kuis (0-100): ");
        double kuis = scanner.nextDouble();
        System.out.print("Masukkan nilai uts (0-100): ");
        double uts = scanner.nextDouble();
        System.out.print("Masukkan nilai uas (0-100): ");
        double uas = scanner.nextDouble();

        System.out.println("================================================");
        //pengecekan validasi nilai 
        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || 
            uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("nilai tidak valid");
        } else {
            //menghitung nilai akhir sesuai bobot
            //bobot: tugas 20%, kuis 20%, uts 30%, uas 30%
            double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);
            System.out.printf("Nilai Akhir: %.2f%n", nilaiAkhir);

            //menentukan grade
            String grade;
            String kualifikasi;
            String Status;

            if (nilaiAkhir >= 80) {
                grade = "A";
                kualifikasi = "Sangat Baik";
            } else if (nilaiAkhir >= 73) {
                grade = "B+";
                kualifikasi = "Lebih dari Baik";
            } else if (nilaiAkhir >= 65) {
                grade = "B";
                kualifikasi = "Baik";
            } else if (nilaiAkhir >= 60) {
                grade = "C";
                kualifikasi = "Lebih dari Cukup";
            } else if (nilaiAkhir >= 50) {
                grade = "D";
                kualifikasi = "Cukup";
            } else if (nilaiAkhir >= 39) {
                grade = "D";
                kualifikasi = "Kurang";
            } else {
                grade = "E";
                kualifikasi = "gagal";
            }

            //tentukan status lulus atau tidak
            if (grade.equalsIgnoreCase("D") || grade.equalsIgnoreCase("E")) {
                Status = "Anda TIDAK LULUS";
            } else {
                Status = "Selamat Anda LULUS";
            }

            System.out.println("================================================");
            //menampilkan hasil
            System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Grade: " + grade);
            System.out.println("=================================================");
            System.out.println(Status);
        }
    }
}
}
