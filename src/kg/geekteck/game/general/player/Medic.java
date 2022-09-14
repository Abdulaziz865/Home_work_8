package kg.geekteck.game.general.player;

public class Medic extends Hero {
    public int getHealthmedic() {
        return healthmedic;
    }

    public void setHealthmedic(int healthmedic) {
        this.healthmedic = healthmedic;
    }

    private int healthmedic;

    public Medic(int hp, int damage, int healthmedic) {
        super(hp, damage, SuperAbility.HEAL);
        this.healthmedic = healthmedic;
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHp() > 0 && this != heroes[i]) {
                heroes[i].setHp(heroes[i].getHp() + this.healthmedic  );
                System.out.println("Medic Health = " + heroes[i].getClass().getSimpleName() + " " + this.healthmedic);
            }


        }
    }
}
