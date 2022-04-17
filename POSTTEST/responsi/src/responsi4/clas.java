/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi4;

/**
 *
 * @author AelAwyR
 */
public class clas {
    
    
}

class parent {
    String gender = "Laki";
    String kulit = "Gelap";
    public void lihat(){
    
        System.out.println(this.gender);
}
}

class anak extends parent{
    public void lihat(){
        System.out.println(this.kulit);
    }
}




