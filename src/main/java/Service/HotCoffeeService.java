package Service;


import Repositories.HotCoffeeRepository;
import Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class HotCoffeeService {
    HotCoffeeRepository hcr;

    Connection conn = ConnectionUtil.getConnection();

    public HotCoffeeService() {

    }

    public void HotCoffeeRepository() throws SQLException {
        hcr = new HotCoffeeRepository();}

    public HotCoffeeService( HotCoffeeRepository hcr) throws SQLException {
        this.hcr = hcr;

       }
//

    public boolean removeHotCoffeeById(){

        return false;
    }
    public boolean updateHotCoffeeByName(){
        return false;
    }
    public boolean addHotCoffeeByName(){
       return false;
    }
    public static boolean getAllHotCoffeesByCoffeeName(){


        return false;
    }


//    public void addCoffee(String name, int id) throws SQLException {
//        Coffee existingCoffee = cr.getcoffeeById(id);
//        if(existingPainting == null) {
//            Painting newPainting = new Painting(title, id);
//            pr.addPainting(newPainting);
//        }else{
////            do nothing
//        }
//        conn.commit();
//    }
//    public List<Painting> getAllPaintingsByArtistName(String name){
//        int id = as.getArtistIDFromName(name);
//        return pr.getAllPaintingsByArtistID(id);
//    }
//}
}
