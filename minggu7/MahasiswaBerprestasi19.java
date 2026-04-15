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

    int sequentialSearch (double cari){
        int posisi = -1;
        for (int j = 0 ; j < listMhs.length; j++){
            if (listMhs[j].ipk == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi (double x, int pos){
        if (pos != -1){
            System.out.println("data Mahasiswa dengan IPK :" + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data : " + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch (double x, int pos){
        if (pos != -1 ){
            System.out.println("nim\t : " + listMhs[pos].nim);
            System.out.println("nama\t : " + listMhs[pos].nama);
            System.out.println("kelas\t : " + listMhs[pos].kelas);
            System.out.println("ipk\t : " + listMhs[pos].ipk);
        } else {
            System.out.println("data : " + x + " tidak ditemukan");
        }
    }

    int findBinarySearch (double cari, int left, int right){
        int mid;
        if ( right >= left){
            mid = (left + right)/2;
            if (cari == listMhs[mid].ipk){
                return mid;
            } else if (cari < listMhs[mid].ipk){
                return findBinarySearch(cari, mid + 1, right);
            } else {
                return findBinarySearch(cari, left, mid - 1);
            }
        }
        return -1;
    }
}