package org.jaker.game.entity;

public interface Entity {

    String getName();

    void setHp(double hp);

    double getHp();

    boolean hasGravity();

    void setGravity();

}
