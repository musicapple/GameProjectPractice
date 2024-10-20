package org.jaker.game.entity.impl;

import org.jaker.game.entity.Entity;
import org.jaker.game.entity.MagicAttackable;
import org.jaker.game.entity.Monster;
import org.jaker.game.entity.Movementable;

public class Animal extends Monster implements Movementable, MagicAttackable {

    private double speed=15;
    private double magicDamage;

    public Animal(String name, double hp, double damage, double magicDamage) {
        super(name, hp, damage);
        this.magicDamage = magicDamage;
    }

    @Override
    public void magicAttack(Entity entity) {
        entity.setHp(entity.getHp()-magicDamage);
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
