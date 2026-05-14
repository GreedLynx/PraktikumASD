public class StackTugasMahasiswa19 {
    Mahasiswa19[] stack;
    int top;
    int size;

    StackTugasMahasiswa19 (int size) {
    this.size = size;
    stack = new Mahasiswa19[size];
    top = -1;
    }

    boolean isFull () {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty () {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    void push (Mahasiswa19 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh, tidak dapat menambahkan data.");
        }
    }

    public Mahasiswa19 pop () {
        if (!isEmpty()) {
            Mahasiswa19 m = stack[top];
            top --;
            return m;
        } else {
            System.out.println("Stack kosong, tidak dapat menghapus data.");
            return null;
        }
    }
    
    public Mahasiswa19 peek () {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println ("Stack kosong! Tidak ada data untuk dikumpulkan");
            return null; 
        }
    }

    public void print () {
        System.out.println("Data stack:");
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println ("");
    }
}
