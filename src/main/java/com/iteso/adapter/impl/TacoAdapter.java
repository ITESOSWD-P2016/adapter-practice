package com.iteso.adapter.impl;

import com.iteso.adapter.Taco;
import com.iteso.adapter.Torta;

public class TacoAdapter implements Torta{
    Taco taco;
    public TacoAdapter(Taco taco){
        this.taco = taco;
    }

    @Override
    public void cutByHalf() {
    }

    @Override
    public void fill() {
        taco.fill();
    }

    @Override
    public void cover() {
        taco.fold();
    }

    @Override
    public void printDescription() {
        taco.printDescription();
    }
}