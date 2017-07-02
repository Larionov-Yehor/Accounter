package com.larionov.core;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class RecordTest {

    @Test
    public void shouldRoundDoubleNumberTillTwoDigits() {

        Record record = new Record();

        assertEquals(record.round(199.995), 200.00, 0);
        assertNotEquals(record.round(199.994), 200.00, 0);

        assertEquals(record.round(99.9999), 100, 0);
        assertNotEquals(record.round(99.9999), 99.99, 0);

        assertEquals(record.round(99.99), 99.99, 0);

        assertEquals(record.round(100.0000001), 100.00, 0);
        assertEquals(record.round(100.0099999), 100.01, 0);
        assertEquals(record.round(0.09), 0.09, 0);
        assertEquals(record.round(0.33333), 0.33, 0);
        assertEquals(record.round(0.99999), 1.00, 0);
    }

    @Test
    public void shouldCountRecordsAmountRoundingItCorrectly() {
        Measure<Integer> computerNumber = new Measure<>(7);
        Measure<Double> meatWeight = new Measure<>(19.125);
        Measure<Long> balloonNumber = new Measure<>(1822293L);

        Commodity computer = new Commodity();
        computer.price = 1999.99;
        Commodity meat = new Commodity();
        meat.price = 130.89;
        Commodity balloon = new Commodity();
        balloon.price = 0.098;

        Record computerRec = new Record();
        computerRec.unit = computerNumber;
        computerRec.commodity = computer;

        Record meatRec = new Record();
        meatRec.unit = meatWeight;
        meatRec.commodity = meat;

        Record balloonRec = new Record();
        balloonRec.unit = balloonNumber;
        balloonRec.commodity = balloon;

        computerRec.summation();
        meatRec.summation();
        balloonRec.summation();

        assertEquals(computerRec.getSum(), 13999.93, 0);
        assertEquals(meatRec.getSum(), 2503.27, 0);
        assertEquals(balloonRec.getSum(), 178584.71, 0);
    }



}
