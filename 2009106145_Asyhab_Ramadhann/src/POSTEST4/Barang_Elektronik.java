package POSTEST4;

public class Barang_Elektronik extends Barang {
    private int Ukuran;

    public Barang_Elektronik(int id, String nm, String br, String js, int jm, int hg, String jb,int Ukuran) {
        super(id, nm, br, js, jm, hg, jb);
        this.Ukuran = Ukuran;
    }

    public Barang_Elektronik() {
        this.Ukuran = 0;
    }

    public int getUkuran() {
        return Ukuran;
    }

    public void setUkuran(int Ukuran) {
        this.Ukuran = Ukuran;
    }
     void barangbeli(){
        System.out.println("Data Barang Elektronik Telah Tertambah");
    }
    void barangubah(){
        System.out.println("Data Barang Elektronik Telah DiUbah");
    }
    void barangberhasil(){
        System.out.println("Data Barang Elektronik Telah DiHapus");
    }
    
    
}
