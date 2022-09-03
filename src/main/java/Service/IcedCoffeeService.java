package Service;

import Repositories.HotCoffeeRepository;
import Repositories.IcedCoffeeRepository;
import Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class IcedCoffeeService {
    HotCoffeeRepository hcr;
    IcedCoffeeRepository icr;

    Connection conn = ConnectionUtil.getConnection();

    public IcedCoffeeService() {

    }




    public void IcedCoffeeRepository() throws SQLException {
        icr = new IcedCoffeeRepository();}

    public IcedCoffeeService( IcedCoffeeRepository icr) throws SQLException {
        this.icr = icr;

    }
//

    public static void removeIcedCoffeeById() {
    }

    public static boolean addIcedCoffeeByName(){
        return false;
    }
    public static boolean getAllIcedCoffeesByCoffeeName(){


        return false;
    }
    public static void updateIcedCoffeeById() {
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

