/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author AelAwyR
 */
public class main {

    public static void main(String[] args) {
        kucing kambing = new kucing("kambing","jantan",5, "biru", 4);
        kambing.tampilkanData();
        kambing.makan();
        kambing.makan("ayam");
    }
    
}
