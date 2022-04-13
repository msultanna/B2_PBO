//Nama  : Alinda Azzahra
//NIM   : 2009106092
//Kelas : Informatika B 2020
//
//Sistem Pendataan Zakat Fitrah
        
package posttest1;

import java.util.Scanner;
import java.util.ArrayList;

public class Posttest1{
    static ArrayList zakat = new ArrayList();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
    menu_awal();
    }    
        static void menu_awal(){
            System.out.println("+------------------------------------------------+");
            System.out.println("|                SELAMAT DATANG                  |");
            System.out.println("|        DI SISTEM PENDATAAN ZAKAT FITRAH        |");
            System.out.println("+------------------------------------------------+");
            System.out.println("Menu pilihan ZAKAT FITRAH");
            System.out.println("[1] Masukkan Data");
            System.out.println("[2] Tampilkan Data"); 
            System.out.println("[3] Update Data");
            System.out.println("[4] Hapus Data");
            System.out.println("[5] Keluar");
            System.out.println("--------------------------------------------------");
            System.out.print("Pilih menu >> ");
            int pilih = input.nextInt();
            switch (pilih){
            case 1:
                    tambah();
                    break;
            case 2:
                    lihat();
                    break;
            case 3:
                    update();
                    break;
            case 4:
                    hapus();
                    break;
            case 5:
                    System.out.println("            TERIMA KASIH TELAH MENGGUNAKAN PROGRAM INI           ");
                    System.out.println("");
                    System.out.println("+---------------------------------------------------------------+");
                    System.out.println("|  SEMOGA ALLAH MEMBERIKAN PAHALA ATAS APA YANG ENGKAU BERIKAN  |");
                    System.out.println("| DAN SEMOGA ALLAH MEMBERIKAN BERKAH ATAS HARTA YANG KAU SIMPAN |");
                    System.out.println("|         DAN MENJADIKANNYA SEBAGAI PEMBERSIH BAGIMU            |");
                    System.out.println("+---------------------------------------------------------------+");
                    break;
            default:
                menu_awal(); 
            } 
        }

    static void kembali(){
                System.out.println("Tekan x untuk kembali...");
                input.next();
                menu_awal();
    }
    
    static void tambah(){
                System.out.print("Masukkan nama muzakki : ");
                String nama = input.next();
                zakat.add(nama);
                kembali();
    }

    static void lihat(){
                for(int i = 0 ; i < zakat.size();i++){
                System.out.println("Data Muzakki["+ i +"] : "+ zakat.get(i));
                }
                kembali();
    }

    static void update(){
                for(int i = 0 ; i < zakat.size();i++){
                System.out.println("Data Muzakki["+ i +"] : "+ zakat.get(i));}
                System.out.println("Masukkan index yang ingin diupdate : ");
                int j = input.nextInt();
                System.out.println(" ");
                String m = input.next();
                zakat.set(j, m);
                kembali();
    }

    static void hapus(){
                System.out.println("Masukkan index yang ingin dihapus : ");
                int hps = input.nextInt();
                zakat.remove(hps);
                kembali();
    }
}

