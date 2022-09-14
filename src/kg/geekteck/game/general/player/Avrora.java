package kg.geekteck.game.general.player;

public class Avrora extends Hero{
    public Avrora(int hp, int damage) {
        super(hp, damage, SuperAbility.INVISIBLE);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {

    }
}
