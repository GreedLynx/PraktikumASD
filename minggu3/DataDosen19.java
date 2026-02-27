public class DataDosen19 {
    public void DataSemuaDosen (Dosen19[] arrayOfDosen){
        System.out.println("\n=== DATA SEMUA DOSEN ===");
        for (Dosen19 dsn : arrayOfDosen) {
            System.out.println("Kode          : " + dsn.kode);
            System.out.println("Nama          : " + dsn.nama);
            System.out.println("Jenis Kelamin : " + (dsn.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + dsn.usia);
            System.out.println("-------------------------------");
        }
    }   

    public void jumlahDosenPerJenisKelamin(Dosen19[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen19 dsn : arrayOfDosen) {
            if (dsn.jenisKelamin == true) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("\n=== JUMLAH DOSEN PER JENIS KELAMIN ===");
        System.out.println("Pria   : " + pria);
        System.out.println("Wanita : " + wanita);
    }

    // c. Menampilkan rerata usia dosen per jenis kelamin [cite: 1610]
    public void rerataUsiaDosenPerJenisKelamin(Dosen19[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int countPria = 0, countWanita = 0;

        for (Dosen19 dsn : arrayOfDosen) {
            if (dsn.jenisKelamin == true) {
                totalUsiaPria += dsn.usia;
                countPria++;
            } else {
                totalUsiaWanita += dsn.usia;
                countWanita++;
            }
        }

        System.out.println("\n=== RERATA USIA DOSEN PER JENIS KELAMIN ===");
        if (countPria > 0) {
            System.out.println("Rata-rata usia Pria   : " + ((double) totalUsiaPria / countPria));
        }
        if (countWanita > 0) {
            System.out.println("Rata-rata usia Wanita : " + ((double) totalUsiaWanita / countWanita));
        }
    }

    public void infoDosenPalingTua(Dosen19[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;
        Dosen19 tertua = arrayOfDosen[0];
        for (Dosen19 dsn : arrayOfDosen) {
            if (dsn.usia > tertua.usia) {
                tertua = dsn;
            }
        }
        System.out.println("\n=== DOSEN PALING TUA ===");
        System.out.println("Nama          : " + tertua.nama);
        System.out.println("Usia          : " + tertua.usia);
    }

    // e. Menampilkan dosen paling muda [cite: 1612]
    public void infoDosenPalingMuda(Dosen19[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;
        Dosen19 termuda = arrayOfDosen[0];
        for (Dosen19 dsn : arrayOfDosen) {
            if (dsn.usia < termuda.usia) {
                termuda = dsn;
            }
        }
        System.out.println("\n=== DOSEN PALING MUDA ===");
        System.out.println("Nama          : " + termuda.nama);
        System.out.println("Usia          : " + termuda.usia);
    }
}
