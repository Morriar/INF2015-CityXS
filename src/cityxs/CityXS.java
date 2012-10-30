package cityxs;

import cityxs.buildings.ResidentialHome;
import java.util.ArrayList;
import java.util.List;

/**
 * CityXL game main routine
 * loop numerous days and collect incomes in houses
 * @author Alexandre Terrasa
 */
public class CityXS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<ResidentialHome> homes = new ArrayList<ResidentialHome>();
        homes.add(new ResidentialHome());
        
        
        Integer gameDays = 10;
        
        Integer cash = 0;
        for(int i = 0; i <= gameDays; i++) {
            System.out.println("Day" + i + ":");
            System.out.println("- Cash = " + cash + ":");
            
            Integer incomes = 0;
            for(ResidentialHome home: homes) {
                incomes += home.dailyIncomes();
            }
            System.out.println("- Incomes = " + incomes + ":");
            
            cash += incomes;
        }
        
        System.out.println("Game end, final cash : " + cash);
        
        
        
    }
}
