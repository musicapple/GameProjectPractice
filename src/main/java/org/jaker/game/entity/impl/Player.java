package org.jaker.game.entity.impl;

import org.jaker.game.entity.Entity;

public class Player implements Entity {


    private String name;    // 생성자로부터 name을 받음
    private double hp = 20.0; // 체력은 20으로 초기 설정
    private double speed = 1.0; // speed는 초기에 1로 설정

    public Player(String name){
        this.name = name;
    }

    @Override
    public String getDisplayName() {
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
    public double getMoventmentSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
