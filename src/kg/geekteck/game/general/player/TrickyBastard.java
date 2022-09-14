package kg.geekteck.game.general.player;

import kg.geekteck.game.general.RPG_GAME;

public class TrickyBastard extends Hero{
    public TrickyBastard(int hp, int damage) {
        super(hp, damage, SuperAbility.FALSE);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        if (boss.getHp()>0 && this.getHp()>0) {
           int y =  RPG_GAME.random.nextInt(4);
           if (y == 3){
              this.setHp(this.getHp() + boss.getDamage());
               this.setDamage(0);
               System.out.println("TrickyBastard Falsed by Boss ");
           }else {
               boss.setDamage(boss.getDamage());
               this.setDamage(this.getDamage());
           }
        }
    }
}
