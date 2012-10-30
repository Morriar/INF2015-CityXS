package cityxs.buildings;

/**
 * A Residential House
 * rewards low incomes
 * @author Alexandre Terrasa
 */
public class ResidentialHome {
    private Integer value;
    private Integer occupants;

    public ResidentialHome() {
        occupants = 3;
        value = 100000;
    }
    
    public Integer dailyIncomes() {
        return value * occupants * 1/1000;
    }
}
