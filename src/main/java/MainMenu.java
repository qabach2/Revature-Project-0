import Service.HotCoffeeService;
import Service.IcedCoffeeService;
import Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) throws SQLException {
        Connection connection = ConnectionUtil.getConnection();

        HotCoffeeService hotCoffeeService = new HotCoffeeService();
        IcedCoffeeService icedCoffeeService = new IcedCoffeeService();

        boolean HaveCoffee = true;
        while (HaveCoffee) {
            System.out.println("SELECT ONE: ( all coffees ,  add coffee, remove coffee, update coffee ,exit )");
            Scanner ab = new Scanner(System.in);
            String UserInput = ab.nextLine();
            if (UserInput.equals("all coffees")) {
                System.out.println("hot coffees, iced coffees");
                UserInput = ab.nextLine();
                if (UserInput.equals("hot Coffees")){
                    System.out.println(HotCoffeeService.getAllHotCoffeesByCoffeeName());
                }else if (UserInput.equals("iced coffees")) {
                    System.out.println(IcedCoffeeService.getAllIcedCoffeesByCoffeeName());
                }}

             else if (UserInput.equals("add coffee")) {
                System.out.println("hot coffees, iced coffees");
                UserInput = ab.nextLine();
                if (UserInput.equals("hot Coffees")){
                    hotCoffeeService.addHotCoffeeByName();
                }else if (UserInput.equals("iced coffees")) {
                    IcedCoffeeService.addIcedCoffeeByName();
            }}
            else if (UserInput.equals("remove coffee")) {
                System.out.println("hot coffees, iced coffees");
                UserInput = ab.nextLine();
                if (UserInput.equals("hot Coffees")){
                    hotCoffeeService.removeHotCoffeeById();
                }else if (UserInput.equals("iced coffees")) {
                    IcedCoffeeService.removeIcedCoffeeById();
                }}

            else if (UserInput.equals("update coffee")) {
                System.out.println("hot coffees, iced coffees");
                UserInput = ab.nextLine();
                if (UserInput.equals("hot Coffees")){
                    hotCoffeeService.updateHotCoffeeByName();
                }else if (UserInput.equals("iced coffees")) {
                    IcedCoffeeService.updateIcedCoffeeById();
                }}

             else if(UserInput.equals("exit")){
                HaveCoffee=false;
               System.out.println("THANK YOU!!");}
           else{
                System.out.println("see you next time ");
            }

//
//            } else if (UserInput.equals("remove coffee")) {
//                System.out.println(drinkService.removeCoffeeById());
//
//            } else if (UserInput.equals("update coffee")) {
//                System.out.println(drinkService.updateCoffeeByName());
//            }else if(UserInput.equals("exit")){
//                HaveCoffee=false;
//                System.out.println("THANK YOU!!");}
//            else{
//                System.out.println("see you next time ");


        }
    }}





