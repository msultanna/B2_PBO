/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;
import java.io.*; 
import java.util.ArrayList; 
import java.util.Scanner; 

 *
 * @author HP
 */
public class rillo {
    
    //deklarasi variabel
    static ArrayList<String> ListDataPeserta = new ArrayList<>();
    static ArrayList<String> ListPesertaPrivate = new ArrayList<>();
    static ArrayList<String> ListPesertaRegular = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    static int pilih;
    
    static void menuUtama(){
        
        system.out.println("DATA PESERTA SLIKEY");
        system.out.println("[1]Peserta Private");
        system.out.println("[2]Peserta Regular");
        
        system.out.println("Masukan Pilihan :");
        pilih = input.nextInt(pilih);
        switch(pilih){
    }
    
  
    static void showMenu(){
        System.out.println("SISTEM PENDATAAN PENERIMA PESERTA KURSUS");
        System.out.println("======= MENU AWAL =======");
        System.out.println("1. Admin");
        System.out.println("2. User ");
        System.out.println("0. Keluar");
        System.out.println("-------------------------");
        System.out.print("Pilih menu> ");
        
        String selectedMenu = input.nextLine();
        
        switch (selectedMenu) {
            case "1":
                menuAdmin();
                break;
            case "2":
                menuUser();
                break;
            case "0":
                System.exit(0);
            default:
                System.out.println("SALAH PILIH");
                backToMenu();
                break;
        }
    }
    static void menuAdmin(){
        System.out.println("===== MENU ADMIN =====");
        System.out.println("1. Lihat Data Peserta");
        System.out.println("2. Tambah Data Peserta");
        System.out.println("3. Edit Data Peserta");
        System.out.println("4. Hapus Data Peserta");
        System.out.println("0. Keluar");
        System.out.println("Pilih menu : ");
                
        String selectedMenu = input.nextLine();
        
        switch (selectedMenu) {
            case "1":
                showDataPeserta();
                break;
            case "2":
                addDataPeserta();
                break;
            case "3":
                editDataPeserta();
                break;
            case "4":
                deleteDataPeserta();
                break;
            case "0":
                System.exit(0);
            default:
                System.out.println("Kamu salah pilih menu bestie !!!");
                break;
        }
    }
    static void menuUser(){
        System.out.println("===== MENU USER =====");
        System.out.println("1. Lihat Data Peserta");
        System.out.println("0. Keluar");
        System.out.println("Pilih menu : ");
                
        String selectedMenu = input.nextLine();
        
        switch (selectedMenu) {
            case "1":
                showDataPeserta();
                break;
            case "0":
                System.exit(0);
            default:
                System.out.println("salah pilih");
                break;
        }
    }
    static void backToMenu(){
       System.out.println("");
       System.out.println("Tekan[Enter] untuk kembali..");
       input.nextLine();
       clearScreen();
    }
    static void readDataPeserta(){
        try {
            File file = new File(fileName);
            Scanner fileReader = new Scanner(file);
            
            //load isi file ke dalam array
            datapeserta.clear();
            while (fileReader.hasNextLine()){
                String data = fileReader.nextLine();
                dataToko.add(data);
            }
        } catch (FileNotFoundException e){
            System.out.println("Eror karena: "+ e.getMessage());
        }
    }
    static void showDataToko() {
        clearScreen();
        readDataToko();
        if (dataToko.size()>0){
            System.out.println(" Stok Pakaian : ");
            int index = 0;
            for (String data : dataToko) {
                System.out.println(String.format("[%d] %s",index, data ));
                index++;
            }
        } else {
            System.out.println("Tidak ada data!");
        }
        if (!isEditing) {
            backToMenu();
        }
    }
    static void addDataToko(){
        clearScreen();
        
        System.out.println("Stok apa yang ingin ditambahkan?");
        System.out.println("Jawab: ");
        String newdataToko = input.nextLine();
        
        try {
            try ( //tulis file
                    FileWriter fileWriter = new FileWriter(fileName, true)) {
                fileWriter.append(String.format("%s%n",newdataToko));
            }
            System.out.println("Berhasil ditambahkan!");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan karena: " + e.getMessage());
        }
        
        backToMenu();
    }
    static void editDataToko(){
        isEditing = true;
        showDataToko();
        
        try {
            System.out.println("-------------------");
            System.out.print("Pilih Indeks> ");
            int index = Integer.parseInt(input.nextLine());
            
            if (index > dataToko.size()) {
                throw new IndexOutOfBoundsException("Kamu Memasukkan Data yang salah");
                
            } else {
                System.out.print("Stok Baru : ");
                String newStok = input.nextLine();
                
                //update data
                dataToko.set(index, newStok);
                
                System.out.println(dataToko.toString());
                
                try {
                    //write new stok
                    try (FileWriter fileWriter = new FileWriter(fileName, false)) {
                        //write new stok
                        for (String data : dataToko) {
                            fileWriter.append(String.format("%s%n",data));
                        }
                    }
                    
                    System.out.println("Berhasil diubah!");
                    
                } catch (IOException e) {
                    System.out.println("Terjadi kesalahan karena: " + e.getMessage());
                    
                }
            }
        } catch (IndexOutOfBoundsException | NumberFormatException e ) {
            System.out.println(e.getMessage());
        }
        isEditing = false;
        backToMenu();
    }
    static void deleteDataToko(){
        isEditing = true;
    showDataToko();

    System.out.println("-----------------");
    System.out.print("Pilih Indeks> ");
    int index = Integer.parseInt(input.nextLine());

    try {
        if (index > dataToko.size()) {
            throw new IndexOutOfBoundsException("Kamu memasukan data yang salah!");
        } else {

            System.out.println("Kamu akan menghapus:");
            System.out.println(String.format("[%d] %s", index, dataToko.get(index)));
            System.out.println("Apa kamu yakin?");
            System.out.print("Jawab (y/t): ");
            String jawab = input.nextLine();

            if (jawab.equalsIgnoreCase("y")) {
                // hapus data
                dataToko.remove(index);

                // tulis ulang file
                try {
                    // write new data
                    try (FileWriter fileWriter = new FileWriter(fileName, false)) {
                        // write new data
                        for (String data : dataToko) {
                            fileWriter.append(String.format("%s%n", data));
                        }
                    }

                    System.out.println("Berhasil dihapus!");
                } catch (IOException e) {
                    System.out.println("Terjadi kesalahan karena: " + e.getMessage());
                }
            }
        }
    } catch (IndexOutOfBoundsException e) {
        System.out.println(e.getMessage());
    }

    isEditing = false;
    backToMenu();

    }