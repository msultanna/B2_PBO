package Posttest4;

import java.util.Formatter;  

public class Handphone {
     //Atribut
    protected int Id;
    protected String Nama;
    protected String Merk;
    protected int Stok;
    protected int Harga;
 
    // konstruktor
    Handphone(int P_Id,String P_Nama,String P_Merk,int P_Stok,int P_Harga){
        this.Id  = P_Id;
        this.Nama      = P_Nama;
        this.Merk      = P_Merk;
        this.Stok      = P_Stok;
        this.Harga     = P_Harga;
    }
    Handphone(){
        this.Id        = 0;
        this.Nama      = "-";
        this.Merk      = "-";
        this.Stok      = 0;
        this.Harga     = 0;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getMerk() {
        return Merk;
    }

    public void setMerk(String Merk) {
        this.Merk = Merk;
    }

    public int getStok() {
        return Stok;
    }

    public void setStok(int Stok) {
        this.Stok = Stok;
    }

    public int getHarga() {
        return Harga;
    }

    public void setHarga(int Harga) {
        this.Harga = Harga;
    }
}
