package posttes1_132;
import java.util.ArrayList;
import java.util.Scanner;


public class Posttes1_132 {
        static ArrayList<String> dataToko = new ArrayList<String>();
        static Scanner input = new Scanner(System.in);
        public static void main(String[] args){
        showMenu();
    
    }
    static void showMenu(){
            System.out.println(" ");
            System.out.println("==========================");
            System.out.println("===TOKO PAKAIAN RHIANNA===");
            System.out.println("==========================");
            System.out.println("1. Masukan Stok Pakaian");
            System.out.println("2. Tampilkan Stok Pakaian");
            System.out.println("3. Edit Stok Pakaian");
            System.out.println("4. Hapus Stok Pakaian");
            System.out.println("5. Keluar");
            System.out.println("--------------------------");
            System.out.println("Pilih [1-5]");
            int p = input.nextInt();
            switch (p){
                case 1:
                    addDataToko();
                    break;
                case 2:
                    showdataToko();
                    break;
                case 3:
                    editDataToko();
                    break;
                case 4:
                    deleteDataToko();
                    break;
                case 5:
                    System.out.println("selesai");
                default:
                    showMenu();
                    
            }
        }
    static void addDataToko(){
        System.out.println(" Stok Pakaian = ");
        String pick = input.next();
        dataToko.add(pick);
        backMenu();
    }
    static void showdataToko(){
        for(int i = 0 ; i < dataToko.size();i++){
        System.out.println("Stok Pakaian["+ i +"] : "+ dataToko.get(i));
        }
        backMenu();
    } 
    static void editDataToko(){
        for(int i = 0 ; i < dataToko.size(); i++){
        System.out.println("Stok Pakaian["+ i +"] : "+ dataToko.get(i));}
        System.out.println("masukkan index = ");
        int a = input.nextInt();
        System.out.println("ubah menjadi = ");
        String iv = input.next();
        dataToko.set(a, iv);
        backMenu();   
    }
    static void deleteDataToko(){
                for(int i = 0 ; i < dataToko.size();i++){
                System.out.println("Stok Pakaian["+ i +"] : "+ dataToko.get(i));
                }

                System.out.println("masukkan index yang ingin di hapus = ");
                int t = input.nextInt();
                dataToko.remove(t);
                backMenu();
    }
    static void backMenu(){
                System.out.println("input Y & Enter to Continue");
                input.next();
                showMenu();
    }
}

