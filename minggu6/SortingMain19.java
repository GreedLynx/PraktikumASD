public class SortingMain19 {
    public static void main(String[] args) {
        // Mendeklarasikan array angka yang akan diurutkan 
        int a[] = {20, 10, 2, 7, 12};
        int b[] = {30, 20, 2, 8, 14};
        int c[] = {40, 10, 4, 9, 3};

        // Membuat objek 'dataurut1' dari kelas Sorting19 
        Sorting19 dataurut1 = new Sorting19(a, a.length);
        Sorting19 dataurut2 = new Sorting19(b, b.length);
        Sorting19 dataurut3 = new Sorting19(c, c.length);


        // Menampilkan data sebelum diurutkan 
        System.out.println("Data awal 1:");
        dataurut1.tampil();
        System.out.println("Data awal 2:");
        dataurut2.tampil();
        System.out.println("Data awal 3:");
        dataurut3.tampil();

        // Memanggil fungsi bubbleSort untuk mengurutkan data 
        dataurut1.bubbleSort();
        
        // Memanggil fungsi selectionSort untuk mengurutkan data
        dataurut2.selectionSort();

        // Memanggil fungsi insertionSort untuk mengurutkan data
        dataurut3.insertionSort();


        // Menampilkan data setelah diurutkan 
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC):");
        dataurut1.tampil();
        System.out.println("Data sudah diurutkan dengan SELECTION SORT (DESC):");
        dataurut2.tampil();
        System.out.println("Data sudah diurutkan dengan INSERTION SORT (ASC):");
        dataurut3.tampil();

    }
}