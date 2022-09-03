package Repositories;

import Entity.IcedCoffee;


import Util.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class IcedCoffeeRepository {
    Connection conn;
    public void IcedCoffeeRepository() throws SQLException {
        conn = ConnectionUtil.getConnection();
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
//    public List<HotCoffee> getAllPaintingsByArtistID(int id){
//        List<HotCoffee> paintings = new ArrayList<>();
//        try{
//            PreparedStatement statement = conn.prepareStatement("Select * from Painting where artistID = ?");
////            parameterindexes start from 1 and go in order of the '?' in the sql string
//            statement.setInt(1, id);
//            ResultSet rs = statement.executeQuery();
//            while(rs.next()){
//                HotCoffee loadedCoffee = new HotCoffee((rs.getInt("id")),(rs.getString("name")),(rs.getString("description")));
//                HotCoffee.add(loadedHotCoffee);
//            }
//        }catch(SQLException e){
//            e.printStackTrace();
//        }
//        if(HotCoffee.size() == 0){
//            return HotCoffee;
//        }else{
//            return HotCoffee;
//        }
//
//    }
//    public void addCoffee(HotCoffee hc){
//        try{
//            PreparedStatement statement = conn.prepareStatement("insert into HotCoffee(id, HotCoffeeID) " +
//                    "values (?, ?)");
//            statement.setString(1, hc.getId());
//            statement.setInt(2, hc.getHotCoffeeID());
//            statement.executeUpdate();
//        }catch(SQLException e){
//            e.printStackTrace();
//        }
//    }
//    public HotCoffee getHotCoffeeByTitle(String title){
//        try{
//            PreparedStatement statement = conn.prepareStatement("select * from Painting where title = ?");
//            statement.setString(1, title);
//            ResultSet rs = statement.executeQuery();
//            while(rs.next()){
//                HotCoffee loadedCoffee = new HotCoffee((rs.getInt("id")),(rs.getString("name")),(rs.getString("description")));
//                return rs;
//            }
//        }catch(SQLException e){
//
//        }
//        return null;
}


