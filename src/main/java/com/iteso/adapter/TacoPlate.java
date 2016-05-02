package com.iteso.adapter;

import java.util.ArrayList;

/**
 * Created by rvillalobos on 11/16/14.
 */
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
   
   public String getContent(){
	   if (tacos.size()==0) return "The plate is empty";
	    String result = "";
	    for (int i = 0; i < tacos.size(); i++) 
	        result += ((Taco)tacos.get(i)).printDescription() + ", ";
	    return result.substring(0, result.length()-2);
  }
}
