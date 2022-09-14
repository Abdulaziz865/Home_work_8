package kg.geekteck.game.general.player;

public class Berserk extends Hero {
    public Berserk(int hp, int damage) {
        super(hp, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        if (boss.getHp() > 0) {
            this.setDamage(this.getDamage() + boss.getDamage() / 7);
            System.out.println("berserk blocking damage and up damage = " + boss.getDamage() / 7);

        }


    }
}

