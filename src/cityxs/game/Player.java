package cityxs.game;

import cityxs.buildings.ResidentialHome;

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
    
    public void buy(ResidentialHome home) {
        Integer cost = home.getValue();
        setCash(getCash() - cost);
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
    
}
