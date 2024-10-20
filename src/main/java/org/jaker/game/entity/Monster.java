package org.jaker.game.entity;

public abstract class Monster implements Entity, Attackable{

    private String name;
    private double damage;
    private double hp;
    public Monster(String name, double hp, double damage){
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    @Override
    public void attack(Entity entity) {
        entity.setHp(entity.getHp()-damage);
        if(entity.getHp()<0){
            entity.setHp(0);
        }
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
}
