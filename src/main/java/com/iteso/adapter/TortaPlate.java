package com.iteso.adapter;

import java.util.ArrayList;

/**
 * Created by jorge on 01/05/16.
 */
public class TortaPlate {
    private ArrayList tortas;

    public TortaPlate(){
        tortas = new ArrayList();
    }

    public void addTorta(Torta torta){
        tortas.add(torta);
    }

    public void servePlate(){
        for (int i = 0; i < tortas.size(); i++){
            Torta torta = (Torta) tortas.get(i);
            torta.cutByHalf();
            torta.fill();
            torta.cover();
            torta.printDescription();
        }
    }
}
