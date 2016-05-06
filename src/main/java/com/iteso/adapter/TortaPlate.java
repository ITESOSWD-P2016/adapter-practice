package com.iteso.adapter;

import java.util.ArrayList;

/**
 * Created by Sebastian on 01/05/16.
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
            torta.fill();
            torta.cover();
            torta.printDescription();
        }
    }

    public String getPlateContent(){
        String result = "";
        for (int i = 0; i < tortas.size(); i++)
            result += ((Torta) tortas.get(i)).printDescription() + ", ";
        return result;
    }
}
