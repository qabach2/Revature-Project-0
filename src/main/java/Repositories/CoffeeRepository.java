package Repositories;

import Entity.Coffee;
import Util.ConnectionUtil;

import javax.lang.model.element.Name;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CoffeeRepository {
    Connection conn;
    public CoffeeRepository() throws SQLException {
        conn = ConnectionUtil.getConnection();
    }
    public CoffeeRepository(Connection conn) {
        this.conn = conn;
    }
    public List<Coffee> getAllCoffee(){
        List<Coffee> allCoffee = new ArrayList<>();
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("Select * From Coffee");
            while(rs.next()){
                Coffee loadedCoffee = new Coffee((rs.getInt("id")),(rs.getString("name")),(rs.getString("description")));

                allCoffee.add(loadedCoffee);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return allCoffee;
    }
    public List<Coffee> getAllCoffeeByName(String name){
        List<Coffee> allCoffee = new ArrayList<>();
        try {
            Statement statement = conn.createStatement();

            ResultSet rs = statement.executeQuery("Select * From Coffee where name = ?");
            while(rs.next()){
                Coffee loadedCoffee = new Coffee((rs.getInt("id")),(rs.getString("name")),(rs.getString("description")));

                allCoffee.add(loadedCoffee);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return allCoffee;
    }
    public List<Coffee> getAllCoffeeById( int id){
        List<Coffee> allCoffee = new ArrayList<>();
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("Select * From Coffee where Id = ?");
            while(rs.next()){
                Coffee loadedCoffee = new Coffee((rs.getInt("id")),(rs.getString("name")),(rs.getString("description")));

                allCoffee.add(loadedCoffee);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return allCoffee;
    }


}
