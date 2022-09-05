package Service;

import Entity.IcedCoffee;
import Repositories.IcedCoffeeRepository;

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
    public IcedCoffee getAllIcedCoffeesById( int id){
        return icr.getAllIcedCoffeesByName(id);
    }

    public void removeIcedCoffeeByIdNumber(int id ){
        icr.removeIcedCoffeeById(id);
    }
    public IcedCoffee updateIcedCoffeeById(IcedCoffee icedCoffee){
        return icr.updateIcedCoffeeById(icedCoffee);
    }
    public void addIcedCoffee(IcedCoffee coffee) {
        icr.addIcedCoffee(coffee);
    }
}


//

