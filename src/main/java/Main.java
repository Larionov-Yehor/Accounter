import com.larionov.core.Commodity;
import com.larionov.core.Measure;
import com.larionov.core.Record;
import com.larionov.core.discount.FixedDiscount;
import com.larionov.core.discount.PercentDiscount;

public class Main {
    public static void main(String[] args) {

        FixedDiscount discount = new FixedDiscount();
        discount.amount = 100;

        PercentDiscount percentDiscount = new PercentDiscount();
        percentDiscount.percent = 10;


        Record r = new Record();
        r.commodity = new Commodity();
        r.commodity.price=200;
        r.unit = new Measure(1);
        r.discount=discount;
        r.summation();
        System.out.println(r.getSum());

        Record r2 = new Record();
        r2.commodity = new Commodity();
        r2.commodity.price=200;
        r2.unit = new Measure(1);
        r2.discount= percentDiscount;
        r2.summation();
        System.out.println(r2.getSum());

    }
}
