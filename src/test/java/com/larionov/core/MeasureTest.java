package com.larionov.core;
import org.junit.Before;
import org.junit.Test;

import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class MeasureTest {

    @Test
    public void shouldCreateListWithDif() {
        Measure<Integer> ones = new Measure<>(5);
        Measure<Long> longMeasure = new Measure<>(5288283942993218391L);
        Measure<Double> doubleMeasure = new Measure<>(12.7);

        List<Measure> measures = new ArrayList<>();
        measures.add(ones);
        measures.add(longMeasure);
        measures.add(doubleMeasure);

        assertEquals(measures.get(0).quantity.getClass(), Integer.class );
        assertEquals(measures.get(1).quantity.getClass(), Long.class );
        assertEquals(measures.get(2).quantity.getClass(), Double.class );
    }


}
