package cityxs.buildings;

/**
 * A Residential House
 * rewards low incomes
 * @author Alexandre Terrasa
 */
public class Home implements Building {
    private Integer cost;
    private Integer occupants;

    public Home() {
        occupants = 3;
        cost = 100000;
    }
    
    @Override
    public Integer dailyIncomes() {
        return getCost() * occupants * 1/1000;
    }

    @Override
    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }
}
