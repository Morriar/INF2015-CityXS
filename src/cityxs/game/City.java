/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cityxs.game;

import cityxs.buildings.Building;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author morriar
 */
public class City {
    private List<Building> buildings = new ArrayList<Building>();

    public List<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(List<Building> homes) {
        this.buildings = homes;
    }
    
}
