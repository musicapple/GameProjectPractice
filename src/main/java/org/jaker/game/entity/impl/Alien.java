package org.jaker.game.entity.impl;

import org.jaker.game.entity.Entity;
import org.jaker.game.entity.Monster;
import org.jaker.game.entity.Movementable;

public class Alien extends Monster implements Movementable {

    public Alien(String name, double hp) {
        super(name, hp,2.5);
    }

    @Override
    public boolean hasGravity() {
        return true;
    }

    @Override
    public void setGravity() {
        throw new UnsupportedOperationException("unsupported operation setGravity() to zombie");
    }

    @Override
    public double getSpeed() {
        return 1.2;
    }

    @Override
    public void setSpeed(double speed) {

    }
}
