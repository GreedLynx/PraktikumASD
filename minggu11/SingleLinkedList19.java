public class SingleLinkedList19 {
    NodeMahasiswa19 head;
    NodeMahasiswa19 tail;

    boolean isEmpty() {
        return (head == null);
    }

    public void print () {
        if (!isEmpty()) {
            NodeMahasiswa19 tmp = head;
            System.out.println("Isi Linked List: \t");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("Linked list kosong.");
            System.out.println();
        }
    }

    public void addFirst(Mahasiswa19 input) {
        NodeMahasiswa19 ndInput = new NodeMahasiswa19(input, null);
        if (isEmpty()) {
            head = tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa19 input) {
        NodeMahasiswa19 ndInput = new NodeMahasiswa19(input, null);
        if (isEmpty()) {
            head = tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(Mahasiswa19 input, String key) {
        NodeMahasiswa19 ndInput = new NodeMahasiswa19(input, null);
        NodeMahasiswa19 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void inserAt(Mahasiswa19 input, int index) {
        if (index < 0) {
            System.out.println ("Indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodeMahasiswa19 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            } 
            temp.next = new NodeMahasiswa19 (input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

}
