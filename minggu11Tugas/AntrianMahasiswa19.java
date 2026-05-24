public class AntrianMahasiswa19 {
    NodeMahasiswa19 head;
    NodeMahasiswa19 tail;

    // cek antrian kosong atau tidak
    public boolean isEmpty() {
        return (head == null);
    }

    // Method tambah antrian 
    public void tambahAntrian (Mahasiswa19 data) {
        NodeMahasiswa19 ndInput = new NodeMahasiswa19(data, null);
        if (isEmpty()) {
            head = tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void mengkosongkanAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong, tidak dapat dihapus.");
        } else {
            head = tail = null;
        } 
    }

    // Method panggil antrian terdepan
    public void panggilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong, tidak dapat dipanggil.");
        } else {
            head.data.tampilInformasi();
            head = head.next;
            if (head == null) {
                tail = null;
            }
        }
    }

    public void tampilAntrianTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong.");
        } else {
            head.data.tampilInformasi();
        }
    }

    public void tampilAntrianTerakhir() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong.");
        } else {
            tail.data.tampilInformasi();
        }
    }

    public int jumlahAntrian() {
        int count = 0;
        NodeMahasiswa19 temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public boolean isFull(){
        return false;
    }
}