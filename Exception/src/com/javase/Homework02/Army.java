package com.javase.Homework02;

public class Army {
    private Weapon[] weapons;
    public Army(int count){
        weapons = new Weapon[count];
    }
    public void addWeapon(Weapon weapon) throws AddWeaponException {
        for(int i =0; i< weapons.length; i++){
            if(weapons[i] ==null){
                weapons[i] = weapon;
                return;
            }
        }
        throw new AddWeaponException("武器数量达到上限!");
    }
    public void allAttack(){
        for(int i =0; i< weapons.length; i++){
            if(weapons[i] instanceof Shotable){
                Shotable shotable = (Shotable)weapons[i];
                shotable.shot();
            }
        }
    }
    public void allMove(){
        for(int i = 0; i < weapons.length ; i++){
            if(weapons[i] instanceof Moveable){
                Moveable moveable = (Moveable)weapons[i];
                moveable.move();
            }
        }
    }
}
