public class AntrianLayanan {
    Mahasiswa [] data;
    Mahasiswa [] riwayatlayanan;
    int front; 
    int rear;
    int size;
    int max;
    int log = 0; // Variabel untuk melacak jumlah mahasiswa yang sudah dilayani
    int totalMahasiswaDPA = 30;

    // Konstruktor
    public AntrianLayanan(int n){
        max = n;
        data = new Mahasiswa[max];
        front = rear = -1;
        size = 0;
        riwayatlayanan = new Mahasiswa[totalMahasiswaDPA]; // Array untuk menyimpan riwayat layanan mahasiswa
    }

    // Method untuk mengecek apakah antrian kosong atau penuh
    public boolean isEmpty(){
        if (size == 0){
            return true;
        }else {
            return false;
        }
    }

    // Method untuk mengecek apakah antrian penuh atau tidak
    public boolean isFull(){
        if (size == max){
            return true;
        } else {
            return false;
        }
    }

    // Method untuk melihat mahasiswa yang berada di depan antrian
    public Mahasiswa[] lihatTerdepan(){
        if (isEmpty()){
            return null;
        } else {
            int batasLoop = (size >= 2) ? 2 : 1;
            Mahasiswa[] dataKeluar = new Mahasiswa[batasLoop];
            for (int i = 0; i < batasLoop; i++) {
                int indexSementara = (front + i) % max; 
                dataKeluar[i] = data[indexSementara];
            }
            return dataKeluar;
        }
    }

    // Method untuk menampilkan semua mahasiswa dalam antrian
    public void tampilkanSemua(){
        if (isEmpty()){
            System.out.println("Antrian masih kosong");
            return;
        } 
        System.out.println("Daftar Mahasiswa dalam Antrian: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++){
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    // Method untuk mengosongkan antrian
    public void kosongkanAntrian (){
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan");
        } else { 
            System.out.println("Antrian masih kosong");
        }
    }

    // Method untuk menambahkan mahasiswa ke dalam antrian
    public void tambahAntrian (Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh, tidak dapat menambah mahasiswa");
            return;
        } 
        if (isEmpty()) {
            front = rear = 0; 
        } else {
            rear = (rear + 1) % max;
        }
        
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }

    // Method untuk melayani mahasiswa di depan antrian
    public Mahasiswa[] LayaniMahasiswa(){
        if (isEmpty()){
            System.out.println("Antrian masih kosong");
            return null;
        } 
        
        int batasLoop = (size >= 2) ? 2 : 1; // Melayani maksimal 2 mahasiswa
        Mahasiswa[] dataKeluar = new Mahasiswa[batasLoop];
        for (int i = 0; i < batasLoop; i++) {
            dataKeluar[i] = data[front];
            riwayatlayanan[log] = dataKeluar[i]; // Simpan ke riwayat layanan
            log++; // Increment log untuk setiap mahasiswa yang dilayani
            front = (front + 1) % max;
            size--;
        }
        if (isEmpty()) {
            front = rear = -1;
        }
        return dataKeluar;
    }

    // Method untuk mendapatkan jumlah mahasiswa dalam antrian
    public int getJumlahAntrian() {
        return size;
    }

    // Method untuk melihat mahasiswa yang berada di akhir antrian
    public void lihatAkhir(){
        if(isEmpty()){
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terakhir: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }

    public void lihatDilayani(){
        if (riwayatlayanan[0] == null) {
            System.out.println("Belum ada mahasiswa yang dilayani.");
        } else {
            System.out.println("Mahasiswa yang sudah dilayani: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            for (int i = 0; i < log; i++) {
                if (riwayatlayanan[i] != null) {
                    riwayatlayanan[i].tampilkanData();
                } else {
                    break;
                }
            }
            System.out.println("Jumlah Mahasiswa yang sudah dilayani: " + log);
        }
    }

    public void jumlahBelumKRS() {
        int jumlahBelumKRS = totalMahasiswaDPA - log;
        System.out.println("Jumlah Mahasiswa yang belum melakukan proses KRS: " + jumlahBelumKRS);
    }
}