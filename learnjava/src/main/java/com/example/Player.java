package com.example;

import java.util.ArrayList;

/**
 * Created by gaming on 1/16/2016.
 */
public class Player {
    private String handleName;
    private int lives;
    private int level;
    private int score;
    private Weapon weapon;
    private ArrayList<InventoryItem> inventoryItems;


    public Player(){
        this.handleName = "Unknown Player";
        this.lives = 3;
        this.level = 1;
        this.score = 0;
        setDefaultWeapon();
        inventoryItems = new ArrayList<InventoryItem>();
    }
    public Player(String handle){
        this();
        setHandleName(handle);
    }

    public Player(String handle, int level){
        this();
        setHandleName(handle);
        setLevel(level);
    }

    private void setDefaultWeapon(){
        this.weapon = new Weapon("Sword",10,20);
    }

    public String getHandleName(){
        return handleName;
    }

    public void setHandleName(String handle){
        if (handle.length() < 4)
            return;
        handleName = handle;
    }

    public void setNameAndLevel(String name, int level){

 // setHandleName(name);
   //     setLevel(level);
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public ArrayList<InventoryItem> getInventoryItems() {
        return inventoryItems;
    }

//    public void setInventoryItems(ArrayList<InventoryItem> inventoryItems) {
//        this.inventoryItems = inventoryItems;
//    }

    public void addInventoryItem(InventoryItem inventorItem){
        inventorItem.add(InventoryItem);

    }
}
