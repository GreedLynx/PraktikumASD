public class StackSurat19 {
    Surat19[] data;
    int top;
    int size;

    // Konstruktor untuk inisialisasi stack dengan ukuran tertentu
    public StackSurat19 (int size) {
        this.size = size;
        data = new Surat19[size];
        top = -1;
    }

    // Metode untuk memeriksa apakah stack penuh atau tidak
    boolean isFull () {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    // Metode untuk memeriksa apakah stack kosong atau tidak
    boolean isEmpty () {
        if (top == -1) { 
            return true;
        } else {
            return false;
        }
    }

    // Metode untuk menambahkan data mahasiswa ke dalam stack
    void push (Surat19 surat) {
        if (!isFull()) {
            top++;
            data[top] = surat;
        } else {
            System.out.println("Stack penuh, tidak dapat menambahkan data.");
        }
    }

    // Metode untuk menghapus data mahasiswa dari stack 
    public Surat19 pop () {
        if (!isEmpty()) {
            Surat19 surat = data[top];
            top --;
            return surat;
        } else {
            System.out.println("Stack kosong, tidak dapat menghapus data.");
            return null;
        }
    }
    
    // Metode untuk melihat data mahasiswa yang berada di puncak stack tanpa menghapusnya
    public Surat19 peek () {
        if (!isEmpty()) {
            return data[top];
        } else {
            System.out.println ("Stack kosong! Tidak ada data untuk dikumpulkan");
            return null; 
        }
    }

    // Metode untuk mencetak semua data mahasiswa yang ada di dalam stack
    public void print () {
        System.out.println("Data stack:");
        for (int i = 0; i <= top; i++) {
            System.out.println(data[i].namaMahasiswa + "\t" + data[i].idSurat + "\t" + data[i].kelas);
        }
        System.out.println ("");
    }

    // Metode untuk mencari surat berdasarkan nama Mahasiswa
    public void cariSurat (String namaDicari) {
        boolean found = false;
        for (int i = 0; i <= top; i++) {
            if (data[i].namaMahasiswa.equalsIgnoreCase(namaDicari)) {
                System.out.println("Surat ditemukan:");
                System.out.println("ID Surat: " + data[i].idSurat);
                System.out.println("Nama Mahasiswa: " + data[i].namaMahasiswa);
                System.out.println("Kelas: " + data[i].kelas);
                System.out.println("Jenis Izin: " + data[i].jenisIzin);
                System.out.println("Durasi: " + data[i].durasi + " hari");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Surat dengan nama mahasiswa " + namaDicari + " tidak ditemukan.");
        }
    }


}
