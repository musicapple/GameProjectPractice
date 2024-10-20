package org.jaker.game;

import org.jaker.game.entity.Monster;
import org.jaker.game.entity.impl.Alien;
import org.jaker.game.entity.impl.Player;
import org.jaker.game.entity.impl.Zombie;

public class GameMain {

    public static void main(String[] args) {

        Player p1 = new Player("jaker");

        Monster m1 = new Alien("옥토퍼스",100.0);
        while(p1.getHp()>0) {
            System.out.println(p1.getName() + "용사님의 체력: " + p1.getHp());
            System.out.println(m1.getName() + "의 체력: " + m1.getHp());
            p1.attack(m1);

            System.out.println(p1.getName() + "용사님의 체력: " + p1.getHp());
            System.out.println(m1.getName() + "의 체력: " + m1.getHp());
            m1.attack(p1);

            try {
                Thread.sleep(1000); //1초
            } catch (InterruptedException e) {
                System.out.println("error");
            }
        }
    }
}
