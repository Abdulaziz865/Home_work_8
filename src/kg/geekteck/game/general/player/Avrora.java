package kg.geekteck.game.general.player;

import kg.geekteck.game.general.RPG_GAME;

public class Avrora extends Hero {
    public Avrora(int hp, int damage) {
        super(hp, damage, SuperAbility.INVISIBLE);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < 2; i = i + 1) {
            if (boss.getHp() > 0 && this.getHp() > 0) {
                this.setDamage(0);
                boss.setDamage(0);
                break;

            }

        }
        for (int i = 0; i < 1; i++) {
        this.setDamage(this.getDamage() + boss.getDamage() * 2);
    }
    }
}
