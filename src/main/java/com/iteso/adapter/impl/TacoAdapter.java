package com.iteso.adapter.impl;

import com.iteso.adapter.Taco;
import com.iteso.adapter.Torta;

/**
 * Created by ChaosInfinityViral on 02/05/16.
 */
public class TacoAdapter implements Torta {
    Taco taco;

    public TacoAdapter(Taco taco){        this.taco = taco;    }

    @Override
    public void cutByHalf() {taco.fill();    }

    @Override
    public void fill() {taco.fold();    }

    public void cover() {    }

    @Override
    public void printDescription() {taco.printDescription();    }
}