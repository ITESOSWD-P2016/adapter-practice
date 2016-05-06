package com.iteso.adapter;

import com.iteso.adapter.impl.TacoAdapter;
import org.junit.Before;
import org.junit.Test;

import com.iteso.adapter.impl.TacoLengua;
import com.iteso.adapter.impl.TortaAdapter;
import com.iteso.adapter.impl.TortaBistec;

import static org.junit.Assert.assertEquals;

/**
 * Created by Sebastian on 05/05/16.
 */
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
    public void TestWhenAddingTorta(){
        tortaPlate.addTorta(tortaBistec);
        tortaPlate.servePlate();
        assertEquals("Bistec Torta, ",tortaPlate.getPlateContent());
    }

    @Test
    public void TestWhenAddingTaco(){
        Torta convertedtaco= new TacoAdapter(tacoLengua);
        tortaPlate.addTorta(convertedtaco);
        tortaPlate.servePlate();
        assertEquals("Lengua Taco, ",tortaPlate.getPlateContent());
    }



}
