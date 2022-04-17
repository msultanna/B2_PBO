/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author AelAwyR
 */
public class kucing extends hewan {
    private String warnaMata;
    private int jumlahKaki;
    
    public kucing (String nama, String gender, int umur,String warnaMata, int jumlahKaki){
        super(nama,gender,umur);
        this.warnaMata = warnaMata;
        this.jumlahKaki = jumlahKaki;
        
    }
    
    public void tampilkanData(){
        super.tampilkan();
        System.out.println("Warna Mata: "+this.warnaMata);
        System.out.println("Jumlah Kaki: "+this.jumlahKaki);
    }
    
    public void makan(){
        System.out.println(super.getNama()+" sedang makan Sesuatu");
    }
    
    public void makan(String makanan){
        System.out.println(super.getNama()+" sedang makan "+makanan);
    }

    public String getWarnaMata() {
        return warnaMata;
    }

    public void setWarnaMata(String warnaMata) {
        this.warnaMata = warnaMata;
    }

    public int getJumlahKaki() {
        return jumlahKaki;
    }

    public void setJumlahKaki(int jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }
    
}
