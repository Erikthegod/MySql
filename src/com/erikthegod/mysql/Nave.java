/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erikthegod.mysql;

/**
 *
 * @author dam
 */
public class Nave {
    private String alias;
    private int posX;
    private int posY;

    public Nave(String alias, int posX, int posY) {
        this.alias = alias;
        this.posX = posX;
        this.posY = posY;
    }

    Nave() {
        
    }

    public String getAlias() {
        return alias;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }


}
