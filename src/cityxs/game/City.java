/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cityxs.game;

import cityxs.buildings.ResidentialHome;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author morriar
 */
public class City {
    private List<ResidentialHome> homes = new ArrayList<ResidentialHome>();

    public List<ResidentialHome> getHomes() {
        return homes;
    }

    public void setHomes(List<ResidentialHome> homes) {
        this.homes = homes;
    }
    
}
