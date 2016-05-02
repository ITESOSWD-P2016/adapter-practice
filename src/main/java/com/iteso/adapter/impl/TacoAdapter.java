package com.iteso.adapter.impl;

import com.iteso.adapter.Taco;
import com.iteso.adapter.Torta;

/**
 * Created by Sebastian on 01/05/16.
 */
public class TacoAdapter implements Torta {
    Taco taco;

    public TacoAdapter (Taco taco){
        this.taco = taco;
    }

    public void cutByHalf() {
        taco.fill();
    }

    public void fill() {
        taco.fold();

    }

    public void cover() {

    }

    public void printDescription() {
        taco.printDescription();

    }
}
