package org.jaker.game.entity;

public abstract class Monster implements Entity, Attackable{

    private final String name;
    private double hp;
    private double damage;

    public Monster(String name, double hp,double damage){
        this.name = name;
        this.hp = hp;
        this.damage = damage;
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
    public void attack(Entity entity) {
        entity.setHp(entity.getHp()-damage);
    }
}
