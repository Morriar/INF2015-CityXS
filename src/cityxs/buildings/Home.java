package cityxs.buildings;

/**
 * A Residential House
 * rewards low incomes
 * @author Alexandre Terrasa
 */
public class Home implements Building {
    private Integer value;
    private Integer occupants;

    public Home() {
        occupants = 3;
        value = 100000;
    }
    
    @Override
    public Integer dailyIncomes() {
        return getValue() * occupants * 1/1000;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}