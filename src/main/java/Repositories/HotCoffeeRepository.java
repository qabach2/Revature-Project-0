package Repositories;

import Entity.HotCoffee;

import Util.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HotCoffeeRepository {
    Connection conn;
    public void HotCoffeeRepository() throws SQLException {
        conn = ConnectionUtil.getConnection();
    }
    public List<HotCoffee> getAllHotCoffees(){
        List<HotCoffee> allHotCoffees = new ArrayList<>();
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("Select * From HotCoffee");
            while(rs.next()){
                HotCoffee loadedHotCoffees = new HotCoffee((rs.getInt("id")),(rs.getString("name")),(rs.getString("description")));
                allHotCoffees.add(loadedHotCoffees);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return allHotCoffees;
    }

    public HotCoffee getAllHotCoffeesById(int id) {
        HotCoffee loadedHotCoffee = null;
        try{
           PreparedStatement statement = conn.prepareStatement("Select * from HotCoffee where id = ?");
           statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            loadedHotCoffee = new HotCoffee((rs.getInt("id")),(rs.getString("name")),(rs.getString("description")));
        }catch(SQLException e){
            e.printStackTrace();

    }
        return loadedHotCoffee;
    }

    public void removeHotCoffeeById(int id ){
        try{
            PreparedStatement statement = conn.prepareStatement("Delete * from HotCoffee where id = ?");
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
        }catch(SQLException e){
            e.printStackTrace();
    }}
    public void addHotCoffee(HotCoffee hotCoffee){

        try{
            PreparedStatement statement = conn.prepareStatement("insert into HotCoffee(id, name, description) " +
                    "values (?, ?, ?)");
            statement.setInt(1,hotCoffee.getId());
            statement.setString(2,hotCoffee.getName());
           statement.setString(3,hotCoffee.getDescription());

            statement.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public  HotCoffee updateHotCoffeeById(HotCoffee hotCoffee ){
       HotCoffee returnval  = null;
        try{
            PreparedStatement statement = conn.prepareStatement("Update HotCoffee set name= ?,description = ? where id = ?");
            statement.setString(2, hotCoffee.getName());
            statement.setString(3, hotCoffee.getDescription());
            ResultSet rs = statement.executeQuery();
            returnval = new HotCoffee((rs.getInt("id")),(rs.getString("name")),(rs.getString("description")));
        }catch(SQLException e){
            e.printStackTrace();
        }
        return returnval;
    }}
//
