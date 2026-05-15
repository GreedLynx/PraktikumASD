public class StackKonversi19 {
    int [] tumpukanBiner;
    int size;
    int top;

    public StackKonversi19() {
        this.size =32; // 32 bit
        this.tumpukanBiner = new int[size];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size -1;
    }

    public void push (int data) {
        if (isFull()) {
            System.out.println("Stack penuh, tidak dapat menambahkan data.");
        } else {
            top++;
            tumpukanBiner[top] = data;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong.");
            return -1;
        } else {
            int data = tumpukanBiner[top];
            top--;
            return data;
        }
    }
}
