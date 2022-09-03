package Service;

import Entity.Coffee;
import Repositories.CoffeeRepository;
import Util.ConnectionUtil;

import java.awt.*;
import java.sql.Connection;
import java.sql.SQLException;

public class CoffeeService {
    CoffeeRepository cr;

    Connection conn = ConnectionUtil.getConnection();

    public CoffeeService() {

    }

    public void CoffeeRepository() throws SQLException {
        cr = new CoffeeRepository();}

    public CoffeeService( CoffeeRepository cr) throws SQLException {
        this.cr = cr;

       }
//

    public void removeCoffeeById( int id ){

    }
    public void updateCoffeeByName( String name){

    }
    public void addCoffeeById(int id ){

    }
    public void getAllPaintingsByCoffeeName(String name){


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
