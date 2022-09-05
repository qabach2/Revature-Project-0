package Repositories;

import Entity.HotCoffee;
import Entity.IcedCoffee;


import Util.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class IcedCoffeeRepository {
    Connection conn;


    public  IcedCoffeeRepository() throws SQLException {
        conn = ConnectionUtil.getConnection();
    }
    public IcedCoffeeRepository(Connection conn){
//        why do we need 2?
//        Mockito allows us to make 'dummy' mock objects that do exactly
//        what we tell them for specific scenarios
//        eg, we can say 'this mock resultset ALWAYS returns this mock data'
        this.conn = conn;
    }
    public List<IcedCoffee> getAllIcedCoffees(){
        List<IcedCoffee> allIcedCoffees = new ArrayList<>();
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("Select * From IcedCoffee");
            while(rs.next()){
                IcedCoffee loadedIcedCoffees = new IcedCoffee((rs.getInt("id_number")),(rs.getString("name_of_coffee")),(rs.getString("about")));
                allIcedCoffees.add(loadedIcedCoffees);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return allIcedCoffees;
    }

    public IcedCoffee getAllIcedCoffeesByName(int id) {
        IcedCoffee loadedIcedCoffee = null;
        try{
            PreparedStatement statement = conn.prepareStatement("Select * from IcedCoffee where id = ?");
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            loadedIcedCoffee = new IcedCoffee((rs.getInt("id_number")),(rs.getString("name_of_coffee")),(rs.getString("about")));
        }catch(SQLException e){
            e.printStackTrace();

        }
        return loadedIcedCoffee;
    }

    public void removeIcedCoffeeById(int id ){
        try{
            PreparedStatement statement = conn.prepareStatement("Delete from IcedCoffee where id_number = ?");
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
        }catch(SQLException e){
            e.printStackTrace();
        }}
    public void addIcedCoffee(IcedCoffee icedCoffee){

        try{
            PreparedStatement statement = conn.prepareStatement("insert into IcedCoffee (id_number, name_of_coffee, about) " +
                    "values (?, ?, ?)");
            statement.setInt(1,icedCoffee.getId_number());
            statement.setString(2,icedCoffee.getName_of_coffee());
            statement.setString(3,icedCoffee.getAbout());

            statement.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public  IcedCoffee updateIcedCoffeeById(IcedCoffee icedCoffee ){
        IcedCoffee returnvalue  = null;
        try{
            PreparedStatement statement = conn.prepareStatement("Update IcedCoffee set name_of_coffee = ?,about = ? where id_number = ?");
            statement.setString(2, icedCoffee.getName_of_coffee());
            statement.setString(3, icedCoffee.getAbout());
            ResultSet rs = statement.executeQuery();
            returnvalue = new IcedCoffee((rs.getInt("id_number")),(rs.getString("name_of_coffee")),(rs.getString("about")));
        }catch(SQLException e){
            e.printStackTrace();
        }
        return returnvalue;
    }}
//


