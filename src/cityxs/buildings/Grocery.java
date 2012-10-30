package cityxs.buildings;

/**
 * A Grocery rewards more incomes than an house but have a higher cost
 * @author Alexandre Terrasa
 */
public class Grocery implements Building {
    private Integer cost = 300000;
    
    @Override
    public Integer dailyIncomes() {
        return getCost() * 10 * 1/1000;
    }

    @Override
    public Integer getCost() {
        return this.cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }
    
}
