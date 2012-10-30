package cityxs.buildings;

/**
 * A Residential House
 * rewards low incomes
 * @author Alexandre Terrasa
 */
public class ResidentialHome {
    
    public Integer dailyIncomes() {
        Integer value = 100000;
        Integer occupants = 3;
        return value * occupants * 1/1000;
    }
}
