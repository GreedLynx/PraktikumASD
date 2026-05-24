
public class DoubleLinkedList {
    Node19 head;
    Node19 tail;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void addFirst (Mahasiswa19 data){
        Node19 newNode = new Node19(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast (Mahasiswa19 data){
        Node19 newNode = new Node19(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void insertAfter (String KeyNIM, Mahasiswa19 data) {
        Node19 current = head;
        while (current != null && !current.data.nim.equals(KeyNIM)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } 

        Node19 newNode = new Node19(data);

        // jika current adalah tail
        if ( current == tail) {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        } else {
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil ditambahkan setelah NIM " + KeyNIM);
        
    }

    public void print(){
        if (isEmpty()) {
            System.out.println("Linked List masih Kosong");
            return;
        } 
        Node19 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
        
    }

    public void removeFirst() {
        if (isEmpty()){
            System.out.println("List Kosong");
            return;
        }
        if (head == tail) {
            System.out.println("Data yang berhasil dihapus adalah Mahasiswa dengan Nama: " + head.data.nama);
            head = tail = null;
        } else {
            System.out.println("Data yang berhasil dihapus adalah Mahasiswa dengan Nama: " + head.data.nama);
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast(){
        if (isEmpty()) {
            System.out.println("List Kosong");
            return;
        } 
        if (head == tail) {
            System.out.println("Data yang berhasil dihapus adalah Mahasiswa dengan Nama: " + head.data.nama);
            head = tail = null;
        } else {
            System.out.println("Data yang berhasil dihapus adalah Mahasiswa dengan Nama: " + tail.data.nama);
            tail = tail.prev;
            tail.next = null;
        }
    }
    
}
