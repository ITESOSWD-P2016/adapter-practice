package com.iteso.adapter;

import java.util.ArrayList;

public class TacoPlate {
   private ArrayList tacos;

    public TacoPlate(){
        tacos = new ArrayList();
    }

   public void addTaco(Taco taco){
       tacos.add(taco);
   }
   public void servePlate(){
       for (int i = 0; i < tacos.size(); i++){
           Taco taco = (Taco) tacos.get(i);
           taco.fill();
           taco.fold();
           taco.printDescription();
       }
   }
}
