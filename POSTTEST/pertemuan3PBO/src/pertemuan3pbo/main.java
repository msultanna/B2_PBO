/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan3pbo;

import java.util.ArrayList;

/**
 *
 * @author AelAwyR
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> isiGudang = new ArrayList<>();
        isiGudang.add("sikat Gigi");
        isiGudang.add("Odol");
        gudang gudang = new gudang(isiGudang);
        System.out.println("Isi Gudang Sebelum");
        for (String item: gudang.getIsi()){
            System.out.println(item);
        }
    }
    
}
