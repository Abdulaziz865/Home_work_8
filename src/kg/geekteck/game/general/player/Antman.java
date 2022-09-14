package kg.geekteck.game.general.player;

import kg.geekteck.game.general.RPG_GAME;

public class Antman extends Hero{
    public Antman(int hp, int damage) {
        super(hp, damage, SuperAbility.BIG_SMALL);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        if (boss.getHp() > 0 && this.getHp()>0){
            int hp  = RPG_GAME.random.nextInt(50);
            int damage  = RPG_GAME.random.nextInt(7);
            this.setHp(this.getHp() + hp);
            this.setDamage(this.getDamage() + damage);
            System.out.println("Antman Bigged = " + hp);
            System.out.println("Antman Upped = " + damage);
        }
    }
}
