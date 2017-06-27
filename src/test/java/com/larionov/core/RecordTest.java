package com.larionov.core;

import org.junit.Test;

public class RecordTest {

    @Test
    public void shouldCountRecordAmount() {
        Measure<Integer> computerNumber = new Measure<>(7);
        Measure<Double> meatWeight = new Measure<>(19.00);
        Measure<Long> balloonNumber = new Measure<>(19822293L);

        Commodity computer = new Commodity();
        computer.price = 1999.99;
        Commodity meat = new Commodity();
        meat.price = 130.89;
        Commodity balloon = new Commodity();
        balloon.price = 0.08;

        Record computerRec = new Record();
        computerRec.unit = computerNumber;
        computerRec.commodity = computer;

        Record meatRec = new Record();
        meatRec.unit = meatWeight;
        meatRec.commodity = meat;

        Record balloonRec = new Record();
        balloonRec.unit = balloonNumber;
        balloonRec.commodity = balloon;





    }

}
