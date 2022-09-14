package kg.geekteck.game.general.player;

import kg.geekteck.game.general.RPG_GAME;

public class Thor extends Hero{
    public Thor(int hp, int damage) {
        super(hp, damage, SuperAbility.STUNNED);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
//        if (boss.getHp()>0 && this.getHp()>0){
//            boolean stun = RPG_GAME.random.nextBoolean();
//            if (stun){
//                boss.setDamage(0);
//                System.out.println("Thor Stunning for Boss!!!");
//            } else {
//                boss.setDamage(50);
//            }
//
//        }

    }
}
