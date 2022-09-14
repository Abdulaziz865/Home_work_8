package kg.geekteck.game.general.player;

import kg.geekteck.game.general.RPG_GAME;

public class Warrior extends Hero {
    public Warrior(int hp, int damage) {
        super(hp, damage,SuperAbility.CRITICAL_DAMAGE);
    }
    @Override
    public void applySuperAbility(Boss boss, Hero[]heroes) {
        if (boss.getHp() > 0 && this.getHp()>0) {
            int coeff = RPG_GAME.random.nextInt(4) + 2;
            boss.setHp(boss.getHp() - this.getDamage() * coeff);
            System.out.println("Warrior critical hits boss = " + this.getDamage() * coeff);
        }


    }
}



