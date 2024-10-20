package org.jaker.game.entity.impl;

import org.jaker.game.entity.Attackable;
import org.jaker.game.entity.Entity;
import org.jaker.game.entity.Movementable;

public class Player implements Entity, Movementable, Attackable {

    private final String name;
    private double speed = 10;
    private double hp = 50;
    private boolean gravity = true;

    public Player(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setHp(double hp) {
        this.hp = hp;
    }

    @Override
    public double getHp() {
        return hp;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public boolean hasGravity() {
        return gravity;
    }

    @Override
    public void setGravity() {
        this.gravity = gravity;
    }

    @Override
    public void attack(Entity entity) {
        entity.setHp(entity.getHp()-1.5);
    }
}
