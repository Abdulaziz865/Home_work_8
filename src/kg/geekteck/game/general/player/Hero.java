package kg.geekteck.game.general.player;

public abstract class Hero extends GameEntity implements HavingSuperAbility{
    private SuperAbility superAbility;
    public Hero(int hp, int damage,SuperAbility superAbility) {
        super(hp, damage);
        this.superAbility=superAbility;
    }


    public abstract void applySuperAbility(Boss boss, Hero[] heroes);
}
