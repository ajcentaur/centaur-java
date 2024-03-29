package com.ajcentaur.designpattern.create.factory.abstractfactory;

public class AK_Factory implements Factory {

    @Override
    public Gun produceGun() {
        return new AK();
    }

    @Override
    public Bullet produceBullet() {
        return new AK_Bullet();
    }
}
