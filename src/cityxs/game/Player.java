package cityxs.game;

import cityxs.buildings.Home;

/**
 * The player who own the city
 * @author Alexandre Terrasa
 */
public class Player {
    private Integer cash = 100000;
    private City city;

    public Player(City city) {
        this.city = city;
    }
    
    public void buy(Home home) {
        spendMoney(home.getValue());
        city.getHomes().add(home);
    }

    public Integer getCash() {
        return cash;
    }

    public void setCash(Integer cash) {
        this.cash = cash;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    private void spendMoney(Integer cost) {
        setCash(getCash() - cost);
    }
    
}
