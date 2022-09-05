package Service;

import Entity.HotCoffee;
import Entity.IcedCoffee;
import Repositories.HotCoffeeRepository;
import Repositories.IcedCoffeeRepository;
import Util.ConnectionUtil;

import java.awt.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class IcedCoffeeService {
//    HotCoffeeRepository hcr;
     IcedCoffeeRepository icr;
    public IcedCoffeeService() throws  SQLException{
        icr = new IcedCoffeeRepository();
    }

//    Connection conn = ConnectionUtil.getConnection();
    public IcedCoffeeService( IcedCoffeeRepository icr) throws SQLException {
        this.icr = icr;

    }

          //
    public List<IcedCoffee> getAllIcedCoffees() {

        return icr.getAllIcedCoffees();
    }
//    public IcedCoffee getIcedCoffee(){
//        return icr.getAllIcedCoffees();
//    }

    public void removeIcedCoffeeByIdNumber(int id ){
        icr.removeIcedCoffeeById(id);
    }
    public IcedCoffee updateIcedCoffeeById(IcedCoffee icedCoffee){
        return icr.updateHotCoffeeById(icedCoffee);
    }
    public void addIcedCoffee(IcedCoffee coffee) {
        icr.addIcedCoffee(coffee);
    }
}


//

