package kg.geekteck.game.general.player;

public abstract class GameEntity {
    private int hp;

    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
        }else {
            this.hp = hp;
        }
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    private int damage;



    public GameEntity(int hp, int damage) {
        this.hp = hp;
        this.damage = damage;
    }
}
