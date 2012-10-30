package cityxs.buildings;

/**
 * A Residential House
 * rewards low incomes
 * @author Alexandre Terrasa
 */
public class Home extends AbstractBuilding {
    private Integer occupants;

    public Home() {
        super(100000);
        occupants = 3;
    }
    
    @Override
    public Integer dailyIncomes() {
        return getCost() * occupants * 1/1000;
    }
}
