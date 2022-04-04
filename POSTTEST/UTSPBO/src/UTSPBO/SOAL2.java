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
public class SOAL2 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan suatu tahun : ");
        int tahun = input.nextInt();
        System.out.print(tahun+" Apakah Tahun leap ??");
        if (tahun % 4 == 0){
            if (tahun %100 ==0){
               System.out.println(" False"); 
            }
            else{
               System.out.println(" True"); 
            }
            
            
        }
        else{
        System.out.println(" True");
        }
    }
    
}
