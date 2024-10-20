package org.jaker.game.entity.impl;

import org.jaker.game.entity.Attackable;
import org.jaker.game.entity.Entity;
import org.jaker.game.entity.MagicAttackable;
import org.jaker.game.entity.Movementable;

public class Player implements Entity, Movementable, Attackable, MagicAttackable {

    private final String name;
    private double hp = 50;
    private double speed = 5;
    private double power = 5;
    private double magicPower = 10;

    public Player(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getHp() {
        return hp;
    }

    @Override
    public void setHp(double hp) {
        this.hp = hp;
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
    public void attack(Entity entity) {
        entity.setHp(entity.getHp()-power);
        if(entity.getHp()<0){
            entity.setHp(0);
        }
    }

    @Override
    public void magicAttack(Entity entity) {
        entity.setHp(entity.getHp()-magicPower);
    }
}
