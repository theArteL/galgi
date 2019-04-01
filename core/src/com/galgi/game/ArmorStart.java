package com.galgi.game;

public class ArmorStart extends Armor {


    Item item = new Item();


    public String info;
    public String name;

    public ArmorStart(){

        info = item.getInfo();
        name = item.getName();
        item.setInfo("Start Armor");
        item.setName("Armor");

    }


}
