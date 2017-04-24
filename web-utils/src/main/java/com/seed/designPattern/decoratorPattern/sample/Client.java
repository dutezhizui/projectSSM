package com.seed.designPattern.decoratorPattern.sample;

/**
 * 客户端类
 */
public class Client {
    public static void main(String args[]){
        TheGreatestSage theGreatestSage=new Monkey();
        //theGreatestSage.move();
        TheGreatestSage fish=new Fish(theGreatestSage);
        TheGreatestSage bird=new Bird(fish);
        TheGreatestSage fish1=new Fish(new Bird(theGreatestSage));
        //bird.move();
        fish1.move();
    }
}
