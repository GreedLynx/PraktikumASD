public class StackTugasMahasiswa19 {
    // Stack untuk menyimpan data mahasiswa yang mengumpulkan tugas
    Mahasiswa19[] stack;
    int top;
    int size;

    // Konstruktor untuk inisialisasi stack dengan ukuran tertentu
    StackTugasMahasiswa19 (int size) {
    this.size = size;
    stack = new Mahasiswa19[size];
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
    void push (Mahasiswa19 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh, tidak dapat menambahkan data.");
        }
    }

    // Metode untuk menghapus data mahasiswa dari stack 
    public Mahasiswa19 pop () {
        if (!isEmpty()) {
            Mahasiswa19 mhs = stack[top];
            top --;
            return mhs;
        } else {
            System.out.println("Stack kosong, tidak dapat menghapus data.");
            return null;
        }
    }
    
    // Metode untuk melihat data mahasiswa yang berada di puncak stack tanpa menghapusnya
    public Mahasiswa19 peek () {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println ("Stack kosong! Tidak ada data untuk dikumpulkan");
            return null; 
        }
    }

    // Metode untuk mencetak semua data mahasiswa yang ada di dalam stack
    public void print () {
        System.out.println("Data stack:");
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println ("");
    }

    // Metode untuk mencetak data mahasiswa yang berada di paling bawah stack
    public void bottomPrint () {
        if (!isEmpty()) {
            System.out.println("Data stack:");
            System.out.println(stack[0].nama + "\t" + stack[0].nim + "\t" + stack[0].kelas);
        } else {
            System.out.println ("Stack kosong! Tidak ada data untuk ditampilkan");
        }
    }

    // Metode untuk menghitung jumlah data mahasiswa yang ada di dalam stack
    public int count () {
        return top + 1;
    }
}
