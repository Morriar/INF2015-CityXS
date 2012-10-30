/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cityxs.buildings;

/**
 * Building common interface for all building
 * @author Alexandre Terrasa
 */
public interface Building {

    /**
     * Daily rewards of the building
     * @return the daily reward
     */
    Integer dailyIncomes();

    /*
     * Cost of the building
     */
    Integer getValue();
    
}
