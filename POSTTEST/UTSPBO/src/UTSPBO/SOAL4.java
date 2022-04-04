/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UTSPBO;

import java.util.Scanner;

/**
 *
 * @author AelAwyR
 */
public class SOAL4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nilai : ");
        int nilai = input.nextInt();
        if (nilai >= 90 && nilai <=100){
            System.out.println("Nilai A");
            
        }
        else if(nilai >=80 && nilai<=89){
            System.out.println("Nilai B");
        }
        else if(nilai >=70 && nilai<=79){
            System.out.println("Nilai C");
        }
        else if(nilai >=60 && nilai<=69){
            System.out.println("Nilai d");
        }
        else{
            System.out.println("Nilai E");
        }
    }
    
}
