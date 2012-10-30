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
        return getValue() * occupants * 1/1000;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
