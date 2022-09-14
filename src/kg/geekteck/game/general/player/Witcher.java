package kg.geekteck.game.general.player;

public class Witcher extends Hero{
    public Witcher(int hp, int damage) {
        super(hp, damage, SuperAbility.RIBIRTH);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        if (boss.getHp() > 0 && this.getHp()>0){
            for (int i = 0; i < heroes.length; i++) {
                if (heroes[i].getHp() <= 0){
                   heroes[i].setHp(heroes[i].getHp() + this.getHp());
                    System.out.println("FAXXXX");
                    break;
                }
            }
        }
    }
}
