import com.larionov.core.Measure;
import com.larionov.core.Record;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Measure<Double> b = new Measure<>(9.0);
        Measure<Integer> i = new Measure<Integer>(5);

        List<Measure> list = new ArrayList<>();
        list.add(b);
        list.add(i);

        list.stream().forEach(measure -> System.out.println(measure.quantity));

        Record r = new Record();
        r.unit = i;
        System.out.println(r.unit.quantity);

        System.out.println(b.quantity.getClass().toString());
    }
}
