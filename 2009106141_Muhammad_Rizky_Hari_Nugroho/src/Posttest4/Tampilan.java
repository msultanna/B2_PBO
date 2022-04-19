
package Posttest4;

import java.util.ArrayList;
import java.util.Scanner;

public class Tampilan {
    ArrayList<Android> temp;
    ArrayList<Ios> temp_2;
     
    Tampilan()
    {
        //instansiasi
        temp = new ArrayList<>();
        temp_2 = new ArrayList<>();
    }
    
    void tambahData(int id, String nm, String mrk, int st, int hg){
        temp.add(new Android(id,nm,mrk,st,hg));
    }
    
    void tambahData_2(int id, String nm, String mrk, int st, int hg){
        temp_2.add(new Ios(id,nm,mrk,st,hg));
    }

    void hapusData(int idd){
        temp.removeIf(item -> item.getId() ==(idd));
    }
    
    void hapusData_2(int idd){
        temp_2.removeIf(item -> item.getId() ==(idd));
    }

    void ubahData(int idd, int id, String nm, String mrk, int st, int hg){

        int cek = -1;
        for(int i=0; i<temp.size(); i++){
            if (temp.get(i).getId() == idd){
                cek = i;
                System.out.println(cek);   
                temp.set(cek,new Android(id,nm,mrk,st,hg));
            }
        }
    }
    
    void ubahData_2(int idd, int id, String nm, String mrk, int st, int hg){

        int cek = -1;
        for(int i=0; i<temp_2.size(); i++){
            if (temp_2.get(i).getId() == idd){
                cek = i;
                System.out.println(cek);   
                temp_2.set(cek,new Ios(id,nm,mrk,st,hg));
            }
        }
    }

    void tampilData()
    {
        for(Android android:temp)
        {
            System.out.println("\nid Handphone : "+android.getId()+""+", \nNama Handphone : "+android.getNm()+""+", \nMerk : "+android.getMrk()+", \nStok : "+android.getSt()+""+", \nHarga : "+android.getHg()+"");
            System.out.println("");
        }
    }
    
    void tampilData_2()
    {
        for(Ios ios:temp_2)
        {
            System.out.println("\nid Handphone : "+ios.getId()+""+", \nNama Handphone : "+ios.getNm()+""+", \nMerk : "+ios.getMrk()+", \nStok : "+ios.getSt()+""+", \nHarga : "+ios.getHg()+"");
            System.out.println("");
        }
    }
    
    public static void main(String args[]){
        Scanner inputan = new Scanner (System.in);
        int Ulang = 1;
        Tampilan td = new Tampilan();
        while(Ulang==1){
            System.out.println("=============================");
            System.out.println("|       Galaxy Store        |");
            System.out.println("=============================");
            System.out.println("| 1.Tambah Handphone        |");
            System.out.println("| 2.Lihat Daftar Handphone  |");
            System.out.println("| 3.Ubah Handphone          |");
            System.out.println("| 4.Hapus Handphone         |");
            System.out.println("| 5.Exit                    |");
            System.out.println("=============================");
            int pilihan,pilihan2;
            System.out.print("Masukan Pilihan [1-5] : ");
            pilihan = inputan.nextInt();
            System.out.println("\n---------------------------------");
            System.out.println("|            Jenis OS           |");
            System.out.println("--------------------------------|");
            System.out.println("| 1.Android                     |");
            System.out.println("| 2.Ios                         |");
            System.out.println("---------------------------------");
            System.out.print("Masukan Pilihan [ 1-2 ] : ");
            pilihan2 = inputan.nextInt();
            if (pilihan == 1){
                int ID;
                String NAMA;
                String MERK;
                int STOK;
                int HARGA;

                System.out.print("ID                : ");
                ID = inputan.nextInt();

                System.out.print("Nama Handphone    : ");
                NAMA = inputan.next();

                System.out.print("Nama Merk         : ");
                MERK = inputan.next();
        
                System.out.print("Stok Handphone    : ");
                STOK = inputan.nextInt();

                System.out.print("Masukan Harga     : ");
                HARGA = inputan.nextInt();

                td.tambahData(ID,NAMA,MERK,STOK,HARGA);
            }
            else if (pilihan == 2){  
                td.tampilData();     
            }
            else if (pilihan == 3){
                int ID;
                String NAMA;
                String MERK;
                int STOK;
                int HARGA;
                int pilih;

                System.out.print("Pilih ID Handphone Yang Ingin Di Ubah : ");
                pilih = inputan.nextInt();

                System.out.print("ID                   : ");
                ID = inputan.nextInt();

                System.out.print("Nama Handphone Baru  : ");
                NAMA = inputan.next();

                System.out.print("Nama Merk Baru   : ");
                MERK = inputan.next();

                System.out.print("Stok Handphone Baru  : ");
                STOK = inputan.nextInt();

                System.out.print("Masukan Harga Baru   : ");
                HARGA = inputan.nextInt();
                td.ubahData(pilih,ID,NAMA,MERK,STOK,HARGA);
             }
            else if (pilihan == 4){
                int pil_hapus;
                System.out.print("Pilih ID Handphone    : ");
                pil_hapus = inputan.nextInt();
                td.hapusData(pil_hapus);
                 }
            else if (pilihan == 5){
            System.out.println("Terima Kasih");
            System.out.println();
            break;
                 }        
            }
        }
}
