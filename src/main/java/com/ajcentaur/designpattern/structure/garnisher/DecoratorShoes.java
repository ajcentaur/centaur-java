package com.ajcentaur.designpattern.structure.garnisher;

public class DecoratorShoes extends Decorator {

    public DecoratorShoes(People people) {
        super(people);
    }

    @Override
    public void wear() {
        super.wear();
        System.out.println("穿双鞋子！");
    }
}
