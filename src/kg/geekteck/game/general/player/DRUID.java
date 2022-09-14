package kg.geekteck.game.general.player;

import kg.geekteck.game.general.RPG_GAME;

public class DRUID extends Hero{


    public DRUID(int hp, int damage) {
        super(hp, damage,SuperAbility.ASSIST);
    }



    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        if (boss.getHp() > 0 && this.getHp()>0){
            int k = RPG_GAME.random.nextInt(15);
           boolean j =  RPG_GAME.random.nextBoolean();
           if (j){
               if (boss.getHp() < boss.getHp() / 2) {
                   boss.setDamage(boss.getDamage() + boss.getDamage() / 2);
               }else {

               }

               System.out.println("Druid byte Super Assistent - Ворон ");
           }
        }
    }


}
