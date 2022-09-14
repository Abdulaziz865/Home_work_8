package kg.geekteck.game.general.player;

import kg.geekteck.game.general.RPG_GAME;

public class Magic extends Hero {
    public Magic(int hp, int damage) {
        super(hp, damage, SuperAbility.BOOST);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        if (boss.getHp() > 0) {
            for (int i = 0; i <heroes.length ; i++) {
                int coeff  = RPG_GAME.random.nextInt(7) + 1;
                heroes[i].setDamage(heroes[i].getDamage() + coeff);
                System.out.println("Magic upped damage of all = " + coeff);
            }


        }
    }
}
