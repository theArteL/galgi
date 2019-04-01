package com.galgi.game;

public class Player {
    Armor armor = new Armor();
    Item item = new Item();
    public int hp;
    public int mana;
    public int resistMana;
    public int resistHp;
    public int getMoney;



    public Player(){
        
        if(armor.isEqip){
            armor.putOn();
        }else {
            armor.takeOff();
        }


        
    }
   
}
