public class Percobaan2 {
    public static void main(String[] args) {
        String NIM = "254107020208";

        // 1. Ambil 2 digit terakhir dari NIM
        long nimAngka = 254107020208L; //pake long karena lebih dari 12 digit
        long duaDigitTerakhir = nimAngka % 100;
        // 2. Cek kondisi n < 10
        int n = (int) duaDigitTerakhir; 
        if (n < 10) {
            n += 10;
        }

        System.out.println("n = " + n); // (Opsional: untuk cek nilai n)

        // 3. Proses Perulangan (Looping)
        for (int i = 1; i <= n; i++) {
            
            // a. Bilangan 10 dan 15 tidak dicetak (skip)
            if (i == 10 || i == 15) {
                continue; 
            }

            // b. Cek Kelipatan 3
            if (i % 3 == 0) {
                System.out.print("# ");
            } 
            // c. Cek Genap (selain kelipatan 3, karena sudah dicek di atas)
            else if (i % 2 == 0) {
                System.out.print(i + " ");
            } 
            // d. Sisanya adalah Ganjil
            else {
                System.out.print("* ");
            }
        }
    }
}
