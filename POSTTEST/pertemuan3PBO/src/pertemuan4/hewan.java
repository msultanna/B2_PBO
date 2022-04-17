/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author AelAwyR
 */
public class hewan {
    private String nama;
    private String gender;
    private int umur;
    
    public hewan(String nama, String gender, int umur){
        this.nama = nama;
        this.gender = gender;
        this.umur = umur;
    }
    
    public void tampilkan(){
        System.out.println("Nama :"+this.nama);
        System.out.println("Gender :"+this.gender);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    
}
