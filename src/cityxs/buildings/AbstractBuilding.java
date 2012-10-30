/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cityxs.buildings;

/**
 *
 * @author morriar
 */
public abstract class AbstractBuilding implements Building {
    protected Integer cost = 300000;

    public AbstractBuilding(Integer cost) {
        this.cost = cost;
    }

    @Override
    public Integer getCost() {
        return this.cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

}
