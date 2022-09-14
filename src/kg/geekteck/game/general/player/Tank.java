package kg.geekteck.game.general.player;

public class Tank extends Hero {
    public Tank(int hp, int damage) {
        super(hp, damage, SuperAbility.TANK);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        int l = boss.getDamage() /5;
        if (boss.getHp() > 0 && this.getHp() > 0) {
        for (int i = 0; i < heroes.length; i++) {
            this.setHp(this.getHp() - boss.getDamage() * 1 / 5);
            heroes[i].setHp(heroes[i].getHp() + boss.getDamage() * 1 / 5);

        } System.out.println("Tank tanking  = " + l );}
    }
}
