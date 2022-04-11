package Posttest3;

import Posttest2.*;

class Inventory {
    private String nama_item;  
    private String rarity_item;
    private String level_item;
    int amount_item;

public void getnama_item(String nama_item){
    this.nama_item = nama_item;
}
public void getrarity_item(String rarity_item){
    this.rarity_item = rarity_item;
}
public void getlevel_item(String level_item){
    this.level_item = level_item;
}
public void getamount_item(int amount_item){
    this.amount_item = amount_item;
}

public String setnama_item(){
return nama_item;
}
public String setrarity_item(){
return rarity_item;
}
public String setlevel_item(){
return level_item;
}
public int setamount_item(){
return amount_item;
}

void itempick() {
    System.out.println("Item Is Add to Inventory!!");
}
void itemcha() {
    System.out.println("Item has Change!!");
}
void itemdel() {
    System.out.println("Item Trow Out of Inventory!!");
}

}
