package com.iteso.adapter;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.iteso.adapter.impl.TacoAdapter;
import com.iteso.adapter.impl.TacoLengua;
import com.iteso.adapter.impl.TortaBistec;

public class TacoAdapterTest {
	Taco tacoLengua;
    Torta tortaBistec;
    TortaPlate tortaPlate;
    
    @Before
    public void setUp(){
    	tacoLengua = new TacoLengua();
    	tortaBistec = new TortaBistec();
    	tortaPlate = new TortaPlate();
    }
    
    @Test
    public void testAddingATortaToATortaPlate(){
    	tortaPlate.addTorta(tortaBistec);
    	tortaPlate.servePlate();
    	assertEquals("Bistec Torta", tortaPlate.getContent());
    }
    
    @Test
    public void testAddingATacoToATortaPlate(){
    	Torta tacoConvertedToTorta = new TacoAdapter(tacoLengua); 
    	tortaPlate.addTorta(tacoConvertedToTorta);
    	tortaPlate.servePlate();
    	assertEquals("Lengua Taco", tortaPlate.getContent());
    }
    
    @Test
    public void testAddingTacosAndTortasToATortaPlate(){
    	Torta tacoConvertedToTorta = new TacoAdapter(tacoLengua); 
    	tortaPlate.addTorta(tacoConvertedToTorta);
    	tortaPlate.addTorta(tortaBistec);
    	tortaPlate.servePlate();
    	assertEquals("Lengua Taco, Bistec Torta", tortaPlate.getContent());
    }
}
