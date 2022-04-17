/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi3;

/**
 *
 * @author AelAwyR
 */
public class Kamar{
        private int nomorKamar;
        private String sizeKamar;
        private int harga;
    
        public void setNomorKamar(int nomorKamar){
            this.nomorKamar = nomorKamar;
        
    }
        public void setSizeKamar(String sizeKamar){
            this.sizeKamar = sizeKamar;
        }
        
        public void setHarga(int harga){
            this.harga = harga;
        }
        
        public int getNomorKamar(){
            return nomorKamar;
        }
        
        public String getSizeKamar(){
            return sizeKamar;
        }
        
        public int getHarga(){
            return harga;
        }
}
