package Service;


import Entity.HotCoffee;
import Repositories.HotCoffeeRepository;
import Repositories.IcedCoffeeRepository;
import Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class HotCoffeeService {
    HotCoffeeRepository hcr;
    IcedCoffeeRepository icr;


    Connection conn = ConnectionUtil.getConnection();
    public HotCoffeeService() throws  SQLException{
        hcr = new HotCoffeeRepository();
        icr =new IcedCoffeeRepository();
    }

    public HotCoffeeService( HotCoffeeRepository hcr, IcedCoffeeRepository icr) throws SQLException {
        this.hcr = hcr;
        this.icr =icr;
    }

//
 public List<HotCoffee> getAllHotCoffees() {

     return hcr.getAllHotCoffees();
 }
// public HotCoffee getHotCoffeeById(int id){
//  return hcr.getAllHotCoffeesById(id);
// }

    public void removeHotCoffeeById(int id ){
        hcr.removeHotCoffeeById(id);
    }
    public HotCoffee updateHotCoffeeById(HotCoffee hotCoffee){
        return hcr.updateHotCoffeeById(hotCoffee);
    }
    public void addHotCoffee(HotCoffee coffee) {
        hcr.addHotCoffee(coffee);
    }
    }



//
