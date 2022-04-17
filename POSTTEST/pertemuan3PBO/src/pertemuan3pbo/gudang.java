/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3pbo;

import java.util.ArrayList;

/**
 *
 * @author AelAwyR
 */
public class gudang {
    private ArrayList<String> isi;
    
    public gudang(ArrayList<String> isi){
        this.isi = isi;
    }
    public ArrayList<String> getIsi(){
        ArrayList<String> cloneIsi = (ArrayList<String>) isi.clone();
        return cloneIsi;
    }
    public void settIsi(ArrayList<String> newisi){
        ArrayList<String> cloneIsi = (ArrayList<String>) newisi.clone();
        this.isi = cloneIsi;
    }
}
