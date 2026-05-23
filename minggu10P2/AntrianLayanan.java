public class AntrianLayanan {
    Mahasiswa [] data;
    int front; 
    int rear;
    int size;
    int max;

    // Konstruktor
    public AntrianLayanan(int n){
        max = n;
        data = new Mahasiswa[max];
        front = rear = -1;
        size = 0;
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
    public void lihatTerdepan(){
        if (isEmpty()){
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
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
    public void clear (){
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
    public Mahasiswa LayaniMahasiswa(){
        if (isEmpty()){
            System.out.println("Antrian masih kosong");
            return null;
        } 
        Mahasiswa mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
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
}