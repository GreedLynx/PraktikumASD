package minggu1;

import java.util.Scanner;

public class coba {

    //deklarasi global scanner hehe
    private static final Scanner input = new Scanner(System.in);

    //fungsi input data dari user
    public static void input(int data[][]) {
        System.out.println("Masukan data rekap penjualan selama 7 hari: ");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Masukan data rekap menu ke-"+ (i+1));
            for (int j = 0; j < data[0].length; j++) {
                System.out.print("hari ke-"+(j+1)+": ");
                data[i][j] = input.nextInt();
                input.nextLine();
            }
        }
    }

    //fungsi menampilkan data dalam bentuk tabel 
    public static void tabelData(int data[][], String dataMenu[]){

        //menampilkan tabel rekap data penjualan selama 7 hari
        System.out.println("===============================");
        System.out.printf("| %-10s\t", "Menu");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.printf("| %-10s", "Hari ke-"+(j+1));
            }
            System.out.print("|");
        }
        for (int i = 0; i < data.length; i++) {
            System.out.printf("\n| %-10s\t", dataMenu[i]);
            for (int j = 0; j < data[i].length; j++) {
                System.out.printf("| %-10d", data[i][j]);
            }
            System.out.print("|");
        }
        System.out.println();

        //beda lagi nih
        //menampilkan menu dengan penjualan tertinggi
        int tertinggi = 0, menuTertinggi = 0;

        //proses menjumlahkan total penjualan per menu selama 7 hari
        System.out.println("=============================");
        for (int i = 0; i < data.length; i++) {
            int totalPenjualanPerHari = 0;
            for (int j = 0; j < data[i].length; j++) {
                totalPenjualanPerHari += data[i][j];
            }
            //proses menentukan menu dengan penjualana tertinggi
            if (totalPenjualanPerHari > tertinggi){
                tertinggi = totalPenjualanPerHari;
                menuTertinggi = i;
            }
        }
        System.out.println("Menu dengan penjualan tertinggi: "+ dataMenu[menuTertinggi] + "\nDengan total penjualan: "+tertinggi+" buah");

        //beda lagi nih
        //proses menentukan rata rata penjualan setiap menu
        System.out.println("=============================");
        for (int i = 0; i < data.length; i++) {
            double totalPenjualanPerHari = 0;
            for (int j = 0; j < data[i].length; j++) {
                totalPenjualanPerHari += data[i][j];
            }
            System.out.println("Rata rata penjualan menu "+dataMenu[i]+": "+totalPenjualanPerHari/4+" buah");
        }
    }

    //fungsi main wak wkwk
    public static void main(String[] args) {
        int data [][] = new int[5][7];
        String dataMenu [] = {"Kopi", "Teh", "Kelapa Muda", "Roti Bakar", "Gorengan"};

        //nahh way, manggil fungsi input
        input (data);
        //nah wayy, manggil fungsi output tabel rekap data penjualan
        tabelData(data, dataMenu);
        //Ternyata prosesnya disuruh di fungsi main, bete guwe. lupa gak kubaca sampai selesai instruksinya
    }
}