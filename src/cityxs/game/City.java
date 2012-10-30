/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cityxs.game;

import cityxs.buildings.Home;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author morriar
 */
public class City {
    private List<Home> homes = new ArrayList<Home>();

    public List<Home> getHomes() {
        return homes;
    }

    public void setHomes(List<Home> homes) {
        this.homes = homes;
    }
    
}
