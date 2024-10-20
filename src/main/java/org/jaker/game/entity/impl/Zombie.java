package org.jaker.game.entity.impl;

import org.jaker.game.entity.Attackable;
import org.jaker.game.entity.Entity;
import org.jaker.game.entity.Movementable;

public class Zombie implements Entity, Attackable, Movementable {


    @Override
    public void attack(Entity entity) {

    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public void setHp(double hp) {

    }

    @Override
    public double getHp() {
        return 0;
    }

    @Override
    public boolean hasGravity() {
        return false;
    }

    @Override
    public void setGravity() {

    }

    @Override
    public double getSpeed() {
        return 0;
    }

    @Override
    public void setSpeed(double speed) {

    }
}
