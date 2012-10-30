package cityxs.buildings;

/**
 * A Grocery rewards more incomes than an house but have a higher cost
 * @author Alexandre Terrasa
 */
public class Grocery extends AbstractBuilding {

    public Grocery() {
        super(300000);
    }
    
    @Override
    public Integer dailyIncomes() {
        return getCost() * 10 * 1/1000;
    }
    
}
