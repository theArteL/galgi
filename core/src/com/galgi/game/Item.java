package com.galgi.game;

public class Item {
    Player player =  new Player();

    private String name;
    private  String info;
    private  int price;
    boolean isSold = false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    public void getStats(){

    }
    public void use(){

    }
    public int sell(){

        isSold = true; // пока не надо

        player.getMoney += price;

        return player.getMoney;
    }
}
