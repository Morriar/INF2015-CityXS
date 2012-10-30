package cityxs.game;

/**
 * The player who own the city
 * @author Alexandre Terrasa
 */
public class Player {
    private Integer cash = 0;
    private City city;

    public Player(City city) {
        this.city = city;
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
