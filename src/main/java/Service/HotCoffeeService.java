package Service;


import Entity.HotCoffee;
import Repositories.HotCoffeeRepository;
import Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class HotCoffeeService {
    HotCoffeeRepository hcr;


    Connection conn = ConnectionUtil.getConnection();

    public HotCoffeeService() throws  SQLException{
    hcr = new HotCoffeeRepository();
    }



    public HotCoffeeService( HotCoffeeRepository hcr) throws SQLException {
        this.hcr = hcr;

       }
//
 public List<HotCoffee> getAllHotCoffees() {

     return hcr.getAllHotCoffees();
 }
 public HotCoffee getHotCoffeeById(int id){
  return hcr.getAllHotCoffeesById(id);
 }

    public void removeHotCoffeeById(int id ){
        hcr.removeHotCoffeeById(id);
    }
    public HotCoffee updateHotCoffeeById(HotCoffee hotCoffee){
        return hcr.updateHotCoffeeById(hotCoffee);
    }
    public void addHotCoffee(HotCoffee coffee){
       hcr.addHotCoffee(coffee);
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
