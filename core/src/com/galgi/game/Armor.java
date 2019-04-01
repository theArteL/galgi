package com.galgi.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class Armor extends Item {

    Player player = new Player();

    private int hp;
    private int mana;
    private int physAttack;
    private int magickAttack;
    private int magickResist;
    private int physResist;
    private int power;
    private int price;
    private int armorType;
    private int qality;
    private int lvl;
    boolean isEqip =true;
    Sprite armor;
    Texture armorTexture;

    public Armor(){
        armor = new Sprite();
        armorTexture = new Texture("");

    }

     void putOn(){
            player.hp += hp;
            player.mana += mana;
            player.resistHp += physResist;
            player.resistMana += magickResist;
    }
     void takeOff(){

        isEqip = false;

    }


}
