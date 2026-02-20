package minggu1;

import java.util.Scanner;

public class Percobaan3 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
        
            String[] mataKuliah = {"Pancasila", "KTI", "CTPS", "MatDas", "B.Ing", "DasPro", "PrakDasPro", "K3"};
            int[] sks = {2, 2, 2, 3, 2, 2, 3, 2}; // Asumsi bobot SKS umum 
            int[] nilaiAngka = new int[mataKuliah.length];
            String[] nilaiHuruf = new String[mataKuliah.length];
            double[] bobotNilai = new double[mataKuliah.length];
            
            System.out.println("Program Menghitung IP Semester");
            System.out.println("==============================");
            
            for (int i = 0; i < mataKuliah.length; i++) {
                System.out.print("Masukkan nilai Angka untuk MK " + mataKuliah[i] + ": ");
                nilaiAngka[i] = input.nextInt();
                
                // Konversi Nilai [cite: 72]
                if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                    nilaiHuruf[i] = "A"; bobotNilai[i] = 4.0;
                } else if (nilaiAngka[i] > 73) {
                    nilaiHuruf[i] = "B+"; bobotNilai[i] = 3.5;
                } else if (nilaiAngka[i] > 65) {
                    nilaiHuruf[i] = "B"; bobotNilai[i] = 3.0;
                } else if (nilaiAngka[i] > 60) {
                    nilaiHuruf[i] = "C+"; bobotNilai[i] = 2.5;
                } else if (nilaiAngka[i] > 50) {
                    nilaiHuruf[i] = "C"; bobotNilai[i] = 2.0;
                } else if (nilaiAngka[i] > 39) {
                    nilaiHuruf[i] = "D"; bobotNilai[i] = 1.0;
                } else {
                    nilaiHuruf[i] = "E"; bobotNilai[i] = 0.0;
                }
            }
            
            System.out.println("==============================");
            System.out.println("Hasil Konversi Nilai");
            System.out.println("==============================");
            System.out.printf("%-40s %-12s %-12s %-12s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
            
            double totalBobotSKS = 0;
            double totalSKS = 0;
            
            for(int i=0; i<mataKuliah.length; i++){
                System.out.printf("%-40s %-12d %-12s %-12.2f\n", mataKuliah[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
                totalBobotSKS += (bobotNilai[i] * sks[i]);
                totalSKS += sks[i];
            }
            
            double ipSemester = totalBobotSKS / totalSKS; // Rumus IP [cite: 70]
            System.out.println("==============================");
            System.out.printf("IP : %.2f\n", ipSemester);
        }
    }
}