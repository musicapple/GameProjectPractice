package org.jaker.game.entity;

public interface Entity {

    String getDisplayName();

    double getHp();

    void setHp(double hp);   // hp조정

    double getMoventmentSpeed();

    void setSpeed(double speed);    // speed 조정



}
