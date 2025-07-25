package ex_20_Accessmodifiers.criminal;

import ex_20_Accessmodifiers.police.Cop;

public class SubClass extends Cop
{


    public SubClass(int bullet) {
        super(bullet);
    }

    public static void main(String[] args) {
//        new SubClass().thisisDefaultF1();
//        new SubClass().canIShoot();
    }
}