package minggu1;

import java.util.Scanner;

public class Tugas2{
    //deklarasi input secara global
    private final static Scanner input = new Scanner(System.in);

    //input data nieh
    public static void inputData(String jadwal[][], String kolom[]){
        for(int i = 0; i < jadwal.length; i++){
            for(int j = 0; j < jadwal[i].length; j++){
                System.out.print("Masukan "+kolom[j]+" ke-"+(i+1)+": ");
                jadwal[i][j] = input.next();
            }
        }
    }

    //tampil data dalam bentuk tabel1
    public static void tampilData(String jadwal[][], String kolom[]){
        System.out.println("===============================================");

        //pengecekan jika data jadwal kosong (belum diinput)
        if (jadwal[0][0] == null) {
            System.out.println("Tidak ada data jadwal yang tersedia.");
            return;
        }

        for(int i = 0; i < kolom.length; i++){
            System.out.printf("| %-15s", kolom[i]);
        }
        System.out.print("|");
        for(int i = 0; i < jadwal.length; i++){
            System.out.println();
            for(int j = 0; j < jadwal[i].length; j++){
                System.out.printf("| %-15s", jadwal[i][j]);
            }
            System.out.print("|");
        }
        System.out.println();
    }

    //tampil data berdasarkan hari yaaa
    public static void tampilDataHari(String jadwal[][], String kolom[]){
        System.out.println("===============================================");

        //pengecekan jika data jadwal kosong (belum diinput)
        if (jadwal[0][0] == null) {
            System.out.println("Tidak ada data jadwal yang tersedia.");
            return;
        }

        System.out.print("Masukan hari yang ingin ditampilkan: ");
        String hari = input.next();
        System.out.println("Jadwal pada hari "+hari+":"); 
        for(int i = 0; i < jadwal.length; i++){
            if(jadwal[i][2].equalsIgnoreCase(hari)){
                for(int j = 0; j < jadwal[i].length; j++){
                    System.out.printf("| %-15s", jadwal[i][j]);
                }
                System.out.println();
                break;
            }
            else {
                System.out.println("Tidak ada jadwal pada hari "+hari+".");
                break;
            }
        }
    }

    //tampil data berdasarkan mata kuliah yaaa
    public static void tampilDataMatkul(String jadwal[][], String kolom[]){
        System.out.println("===============================================");

        //pengecekan jika data jadwal kosong (belum diinput)
        if (jadwal[0][0] == null) {
            System.out.println("Tidak ada data jadwal yang tersedia.");
            return;
        }

        System.out.print("Masukan mata kuliah yang ingin ditampilkan: ");
        String matkul = input.next();
        System.out.println("Jadwal untuk mata kuliah "+matkul+":"); 
        for(int i = 0; i < jadwal.length; i++){
            if(jadwal[i][0].equalsIgnoreCase(matkul)){
                for(int j = 0; j < jadwal[i].length; j++){
                    System.out.printf("| %-15s", jadwal[i][j]);
                }
                System.out.println();
                break;
            }
            else {
                System.out.println("Tidak ada jadwal untuk mata kuliah "+matkul+".");
                break;
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.print("Masukan jumlah jadwal: ");
        int n = input.nextInt();
        String jadwal [][] = new String[n][4];
        String kolom [] = {"Nama Matkul", "Ruang", "Hari", "Jam"};
        int menu;

        // saya pakai DO-WHILE Agar menu muncul terus sampai user memilih keluar (5)
        do {
            System.out.println("\n=== MENU JADWAL KULIAH ===");
            System.out.println("1. Input Data Jadwal");
            System.out.println("2. Menampilkan Data Jadwal");
            System.out.println("3. Menampilkan Data Jadwal Berdasarkan Hari");
            System.out.println("4. Menampilkan Data Jadwal Berdasarkan Mata Kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            menu = input.nextInt();

            switch (menu) {
                case 1 -> inputData(jadwal, kolom);
                case 2 -> tampilData(jadwal, kolom);
                case 3 -> tampilDataHari(jadwal, kolom);
                case 4 -> tampilDataMatkul(jadwal, kolom);
                case 5 -> System.out.println("Terima kasih!");
                default -> System.out.println("Menu tidak valid.");
            }
        } while (menu != 5);
    }
}