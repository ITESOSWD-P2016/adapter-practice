package com.iteso.adapter;

import static org.junit.Assert.assertEquals;

import com.iteso.adapter.impl.TacoAdapter;
import com.iteso.adapter.impl.TacoLengua;
import com.iteso.adapter.impl.TortaBistec;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by alexabeas on 5/5/16.
 */
public class TacoAdapterTest {

    Taco taco;
    Torta torta;
    TortaPlate tortaplate;

    @Before
    public void setUp(){
        taco = new TacoLengua();
        torta = new TortaBistec();
        tortaplate = new TortaPlate();
    }

    @Test
    public void testAddTortaWhenTorta(){
        tortaplate.addTorta(torta);
        tortaplate.servePlate();
        assertEquals("Bistec Torta, ", tortaplate.getAll());

    }

    @Test
    public void testAddTortaWhentaco(){
        Torta tacotorta = new TacoAdapter(taco);
        tortaplate.addTorta(tacotorta);
        assertEquals("Lengua Taco, ", tortaplate.getAll());

    }
}
