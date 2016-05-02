package com.iteso.adapter;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.iteso.adapter.impl.TacoLengua;
import com.iteso.adapter.impl.TortaAdapter;
import com.iteso.adapter.impl.TortaBistec;

public class TortaAdapterTest {
	Taco tacoLengua;
    Torta tortaBistec;
    TacoPlate tacoPlate;
    
    @Before
    public void setUp(){
    	tacoLengua = new TacoLengua();
    	tortaBistec = new TortaBistec();
    	tacoPlate = new TacoPlate();
    }
    
    @Test
    public void testAddingATacoToATacoPlate(){
    	tacoPlate.addTaco(tacoLengua);
    	tacoPlate.servePlate();
    	assertEquals("Lengua Taco", tacoPlate.getContent());
    }
    
    @Test
    public void testAddingATortaToATacoPlate(){
    	Taco tortaConvertedToTaco = new TortaAdapter(tortaBistec); 
    	tacoPlate.addTaco(tortaConvertedToTaco);
    	tacoPlate.servePlate();
    	assertEquals("Bistec Torta", tacoPlate.getContent());
    }
    
    @Test
    public void testAddingTacosAndTortasToATacoPlate(){
    	Taco tortaConvertedToTaco = new TortaAdapter(tortaBistec); 
    	tacoPlate.addTaco(tortaConvertedToTaco);
    	tacoPlate.addTaco(tacoLengua);
    	tacoPlate.servePlate();
    	assertEquals("Bistec Torta, Lengua Taco", tacoPlate.getContent());
    }
}
