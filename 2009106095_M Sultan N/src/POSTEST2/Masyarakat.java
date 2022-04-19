/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package POSTEST2;

/**
 *
 * @author ACER
 */
public class Masyarakat {
   String Nama;
   String alamat;
   String laporan;
   Integer no_hp;
   
   public Masyarakat(String Nama,String alamat, String laporan, Integer no_hp){
       this.Nama = Nama;
       this.alamat = alamat;
       this.laporan = laporan;
       this.no_hp = no_hp;
   }
   
   void pengaduanDiterima(){
       System.out.println("Pengaduan di terima");
   }
   void pengaduanTidakDiterima(){
       System.out.println("Pengaduan Tidak di terima");
   }
}
