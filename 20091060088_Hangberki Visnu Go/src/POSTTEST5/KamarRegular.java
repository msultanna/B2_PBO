/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POSTTEST5;

import java.util.Scanner;

/**
 *
 * @author AelAwyR
 */
public class KamarRegular extends Kamar {

    public KamarRegular(int nomor, int harga, String Status, String ukuran) {
        super(nomor, harga, Status);
        this.ukuran = ukuran;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }
    
    @Override
    public void edit(Scanner input) {
        System.out.print("Masukan Nomor Kamar : ");
        this.nomor = input.nextInt();
        input.nextLine();
        System.out.println("");
        System.out.print("Masukan Status Kamar : ");
        this.Status = input.nextLine();
        System.out.println("");
        System.out.print("Masukan Harga Kamar : ");
        this.harga = input.nextInt();
        input.nextLine();
        System.out.print("Masukan Ukuran Kamar : ");
        this.ukuran = input.nextLine();
        System.out.println("");
    }

}
