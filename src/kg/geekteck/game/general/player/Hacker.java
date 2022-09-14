package kg.geekteck.game.general.player;

import kg.geekteck.game.general.RPG_GAME;

public class Hacker extends Hero {
    public Hacker(int hp, int damage) {
        super(hp, damage, SuperAbility.HACK);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        if (boss.getHp() > 0 && this.getHp() > 0) {
            int minus = RPG_GAME.random.nextInt(10);
            int heal = RPG_GAME.random.nextInt(heroes.length);
            for (int i = 0; i < 1; i++) {
                boss.setHp(boss.getHp() - minus);
                heroes[heal].setHp(heroes[heal].getHp() + minus);
            }
            System.out.println("Hacker hacked hp boss = " + minus + ", and healed heroes index" + minus);
        }
    }
}
