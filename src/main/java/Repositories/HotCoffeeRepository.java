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

