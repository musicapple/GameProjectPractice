package org.jaker.game;

import org.jaker.game.entity.Monster;
import org.jaker.game.entity.impl.Animal;
import org.jaker.game.entity.impl.Flower;
import org.jaker.game.entity.impl.Player;

public class GameMain {

    public static void main(String[] args) {

        Player player1 = new Player("드래곤파워");

        Monster m1 = new Animal("황소몬",100.0,10.5,13.5);
        Monster m2 = new Flower("네펜데스",50.0,8.0);

        while(player1.getHp()>0){
            player1.attack(m1); // player가 m1 공격
            System.out.println(player1.getName() + "님의 hp: " + player1.getHp());
            System.out.println(m1.getName()+"의 hp: " + m1.getHp());

            m1.attack(player1); // m1이 player 공격
            System.out.println(player1.getName() + "님의 hp: " + player1.getHp());
            System.out.println(m1.getName()+"의 hp: " + m1.getHp());

            System.out.println("");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
