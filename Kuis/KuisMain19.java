public class KuisMain19 {
    public static void main(String[] args) {

        
        Kuis19 [] datKaryawans = new Kuis19[4];
        datKaryawans[0] = new Kuis19("116", "Irfan", 2500000, 20 );

        datKaryawans[1] = new Kuis19("121", "Timina", 2750000, 24);
        datKaryawans[0].idPegawai = "121";
        datKaryawans[0].nama = "Timina";
        datKaryawans[0].gajiPokok = 2750000;
        datKaryawans[0].hariKerja = 24;

        datKaryawans[2] = new Kuis19("134", "Luvi", 2500000, 25);
        datKaryawans[0].idPegawai = "134";
        datKaryawans[0].nama = "Luvi";
        datKaryawans[0].gajiPokok = 2500000;
        datKaryawans[0].hariKerja = 25;

        datKaryawans[3] = new Kuis19("147", "Siti", 3000000, 24);
        datKaryawans[0].idPegawai = "147";
        datKaryawans[0].nama = "Siti";
        datKaryawans[0].gajiPokok = 3000000;
        datKaryawans[0].hariKerja = 24;

        for (int i = 0; i < datKaryawans.length; i++) {
            System.out.println("Data Karyawan: ");
            datKaryawans[i].tampilkanInformasi();
            double gajiBulanan = datKaryawans[i].hitungGajiBulanan();
            System.out.println("Gaji Bulanan: " + gajiBulanan);
        }


    }
}
