/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3pbo;

/**
 *
 * @author AelAwyR
 */
public class BendaSatu {
    private int jumlah;
    private int harga;
    private double berat;
    
    public BendaSatu(int jumlah, int harga, double berat){
        this.jumlah = jumlah;
        this.harga = harga;
        this.berat = berat;
    }
    
    public int getJumlah(){
        return jumlah;
    }
    
    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }
    
    public int getHarga(){
        return harga;
    }
    
    public void setHarga(int harga){
        this.harga = harga;
        
    }
    public double getBerat(){
        return berat;
    }
    
    public void setBerat(double berat){
        this.berat = berat;
    }
    
    
}
