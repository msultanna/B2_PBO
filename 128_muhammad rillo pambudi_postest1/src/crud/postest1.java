/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;


class mobil {
    String merk;
    String pemilik;
    double ukuranmobil;    

    void hidupkanmobil(){
        system.out.println("mobil dinyalakan");
}
    void matikanmobil (){
        system.out.println("mobil dimatikan");
    }
          
}
public class main{
    public static void main(string[]args) throw exception {
        mobil mobilrillo = new mobil();
        mobil mobilazadin = new mobil();
        
        mobilrillo.merk = "inova"
        mobilrillo.pemilik = "rillo"
        mobilrillo.ukuranlayar = 1.0;
        
        system.out.println(mobilrillo.merk);
        system.out.println(mobilrillo.pemilik);
        system.out.println(mobilrillo.ukuranmobil);
        
    }
}   