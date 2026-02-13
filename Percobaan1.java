import java.util.Scanner;

public static void main(String[] args) {
    try(Scanner scanner = new Scanner(System.in)){

        //input komponen nilai 
        System.out.println("Masukkan nilai tugas: (0-100)");
        double tugas = scanner.nextDouble();
        System.out.println("Masukkan nilai kuis: (0-100)");
        double kuis = scanner.nextDouble();
        System.out.println("Masukkan nilai uts: (0-100)");
        double uts = scanner.nextDouble();
        System.out.println("Masukkan nilai uas: (0-100)");
        double uas = scanner.nextDouble();

        //pengecekan validasi nilai 
        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || 
            uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("nilai tidak valid");
        } else {
            //menghitung nilai akhir
            double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);
            System.out.printf("Nilai Akhir: %.2f%n", nilaiAkhir);

            //menentukan grade
            char grade;
            if (nilaiAkhir >= 85) {
                grade = 'A';
            } else if (nilaiAkhir >= 70) {
                grade = 'B';
            } else if (nilaiAkhir >= 55) {
                grade = 'C';
            } else if (nilaiAkhir >= 40) {
                grade = 'D';
            } else {
                grade = 'E';
            }

            System.out.println("Grade: " + grade);
        }
    }
}