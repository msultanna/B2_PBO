package posttest2_132;


public class Pakaian {String nama, bahan, warna;
    int harga;
    
    public Pakaian(String nama, String bahan, String warna, int harga){
        this.nama = nama;
        this.bahan = bahan;
        this.warna = warna;
        this.harga = harga;
        
    }
    
   void BerhasilTambah(){
       System.out.println(" Berhasil Ditambahkan ");
   }
   void BatalTambah(){
       System.out.println(" Berhasil Dibatalkan ");
   }
   void UbahStok(){
       System.out.println(" Berhasil Diubah ");
   }
    
}
