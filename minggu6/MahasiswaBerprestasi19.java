public class MahasiswaBerprestasi19 {
    Mahasiswa19[] listMhs = new Mahasiswa19[5];
    int idx;

    void tambah(Mahasiswa19 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil() {
        for (Mahasiswa19 m : listMhs) {
            m.tampilInformasi();
            System.out.println("-------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                // Sorting secara Descending (Besar ke Kecil)
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa19 tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }
}