package kg.geekteck.game.general;

import kg.geekteck.game.general.player.*;

import java.util.Random;

public class RPG_GAME {
    public static Random random  = new Random();
    public static void startGame() {

        Boss boss = new Boss(20000, 50);
        Avrora avrora = new Avrora(200,20);
        Hacker hacker = new Hacker(270,19);
        TrickyBastard trickyBastard =new TrickyBastard(210,27);
        DRUID druid =new DRUID(220,11);
        Antman antman =new Antman(250,15);
        Witcher witcher = new Witcher(240,0);
        Tank tank = new Tank(600,3);
        Thor thor = new Thor(300,15);
        Warrior warrior = new Warrior(250, 25);
        Medic medicDoc = new Medic(20, 10, 15);
        Medic assistent = new Medic(250, 20, 5);
        Magic magic = new Magic(220, 20);
        Berserk berserk = new Berserk(210, 20);

        Hero[] heroes = {antman,druid,hacker,avrora,trickyBastard,witcher,tank,thor,warrior, medicDoc, assistent, magic, berserk};
        printStatistics(boss, heroes);

        while (!isGameFinish(boss, heroes)) {
            round(boss, heroes);
        }

    }

    private static void printStatistics(Boss boss, Hero[] heroes) {
        System.out.println("________________________");
        System.out.println("Boss health = " + boss.getHp() + " ||| Boss Damage = " + boss.getDamage());
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i].getClass().getSimpleName() + ": Heroes health = " + heroes[i].getHp() + " ||| Heroes Damage = " + heroes[i].getDamage());

        }
        System.out.println("__________________________-");

    }

    private static boolean isGameFinish(Boss boss, Hero[] heroes) {
        if (boss.getHp() <= 0) {
            System.out.println("HEROES WINS!!!");
            return true;
        }
        boolean allHeroesDead = true;
        for (Hero hero : heroes) {
            if (hero.getHp() > 0) {
                allHeroesDead = false;
                break;
            }
        }
        if (allHeroesDead) {
            System.out.println("BOSS WINS!!!");
        }

        return allHeroesDead;
    }

    private static void bossHits(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHp() > 0) {
                heroes[i].setHp(heroes[i].getHp() - boss.getDamage());
            }
        }
    }

    private static void heroessHits(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHp() > 0 && boss.getHp() > 0) {
                boss.setHp(boss.getHp() - heroes[i].getDamage());
            }
        }
    }

    private static void round(Boss boss, Hero[] heroes) {
        bossHits(boss, heroes);
        heroessHits(boss, heroes);
        heroesAttackSuperAbility(boss,heroes);
        printStatistics(boss, heroes);
    }

    private static void heroesAttackSuperAbility(Boss boss, Hero[] heroes){
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHp() > 0 && boss.getHp() > 0) {
               heroes[i].applySuperAbility(boss,heroes);
            }
        }
    }
}
