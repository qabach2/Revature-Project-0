import Entity.HotCoffee;
import Entity.IcedCoffee;
import Service.HotCoffeeService;
import Service.IcedCoffeeService;
import Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) throws SQLException {
        Connection connection = ConnectionUtil.getConnection();
        boolean HaveCoffee = true;
        HotCoffeeService hotCoffeeService = new HotCoffeeService();
        IcedCoffeeService icedCoffeeService = new IcedCoffeeService();
        while (HaveCoffee) {
            System.out.println("SELECT ONE: ( all coffees , get all coffees by id, add coffee, remove coffee, update coffee ,exit )");
            Scanner ab = new Scanner(System.in);
            String userInput = ab.nextLine();
//  TO GET ALL COFFES FROM DATA BASE
            if (userInput.equals("all coffees")) {
                System.out.println("hot coffees, iced coffees");
                userInput = ab.nextLine();
                if (userInput.equals("hot coffees")) {
                    System.out.println(hotCoffeeService.getAllHotCoffees());
                } else if (userInput.equals("iced coffees")) {
                    System.out.println(icedCoffeeService.getAllIcedCoffees());
                }}
//  TO GET ALL COFFEeS BY IDS
            else if(userInput.equals("get all coffees by id")){
                System.out.println("hot coffees, iced coffees");
                userInput = ab.nextLine();
                if(userInput.equals("hot coffees")) {
                    System.out.println("input hot coffee id:");
                    int UserInputId = Integer.parseInt(ab.nextLine());
                    System.out.println(hotCoffeeService.getHotCoffeesById(UserInputId));
                } else if (userInput.equals("iced coffees")) {
                    System.out.println("input iced coffee id:");
                    int UserInputId = Integer.parseInt(ab.nextLine());
                    System.out.println(icedCoffeeService.getAllIcedCoffeesById(UserInputId));

                }

            }
//  TO ADD COFFEE TO LIST
            else if (userInput.equals("add coffee")) {
                System.out.println("hot coffees, iced coffees");
               userInput = ab.nextLine();
                if (userInput.equals("hot coffees")) {
                    System.out.println("please add the name");
                    String UserInputName = ab.nextLine();
                    System.out.println("please add description");
                    String UserInputDescription = ab.nextLine();
                    System.out.println("please add id");
                    int UserInputId = Integer.parseInt(ab.nextLine());
                    HotCoffee hotCoffee = new HotCoffee(UserInputId, UserInputName, UserInputDescription);
                    hotCoffeeService.addHotCoffee(hotCoffee);
                } else if (userInput.equals("iced coffees")) {
                    System.out.println("please add the name of coffee");
                    String UserInputName = ab.nextLine();
                    System.out.println("please add about");
                    String UserInputDescription = ab.nextLine();
                    System.out.println("please add id");
                    int UserInputId = Integer.parseInt(ab.nextLine());
                    IcedCoffee icedCoffee = new IcedCoffee(UserInputId, UserInputName, UserInputDescription);
                    icedCoffeeService.addIcedCoffee(icedCoffee);
                } else
                    System.out.println("SELECT ONE: ( all coffees , get all coffees by id, add coffee, remove coffee, update coffee ,exit )");
            }
// TO REMOVE COFFEE
            else if (userInput.equals("remove coffee")) {
                System.out.println("hot coffee, iced coffee");
                userInput = ab.nextLine();
                if (userInput.equals("hot coffee")) {
                    System.out.println("please add id_number");
                    int UserInputId = Integer.parseInt(ab.nextLine());
                    hotCoffeeService.removeHotCoffeeById(UserInputId);
                } else if (userInput.equals("iced coffee")) {
                    System.out.println("please add id_number");
                    int UserInputId = Integer.parseInt(ab.nextLine());
                    icedCoffeeService.removeIcedCoffeeByIdNumber(UserInputId);
//                    IcedCoffeeService.removeIcedCoffeeById();
                } else
                    System.out.println("SELECT ONE: ( all coffees , get all coffees by id,  add coffee, remove coffee, update coffee ,exit )");
//TO UPDATE COFFEE
            } else if (userInput.equals("update coffee")) {
                System.out.println("hot coffee, iced coffee");
                userInput = ab.nextLine();
                if (userInput.equals("hot coffee")) {
                    System.out.println("please add the name");
                    String UserInputName = ab.nextLine();
                    System.out.println("please add new name");
                    String UserInputDescription = ab.nextLine();
                    System.out.println("please add id");
                    int UserInputId = Integer.parseInt(ab.nextLine());
                    HotCoffee hotCoffee = new HotCoffee(UserInputId, UserInputName, UserInputDescription);
                    hotCoffeeService.updateHotCoffeeById(hotCoffee);
                } else if (userInput.equals("iced coffees")) {
                    System.out.println("please add the name_of_coffee");
                    String UserInputName = ab.nextLine();
//                    System.out.println("please add about");
                    String UserInputDescription = ab.nextLine();
                    System.out.println("please add id");
                    int UserInputId = Integer.parseInt(ab.nextLine());
                    IcedCoffee icedCoffee = new IcedCoffee(UserInputId, UserInputName, UserInputDescription);
                    icedCoffeeService.updateIcedCoffeeById(icedCoffee);
//                    IcedCoffeeService.updateIcedCoffeeById();
                } else
                    System.out.println("SELECT ONE: ( all coffees , get all coffees by id, add coffee, remove coffee, update coffee ,exit )");
            }
             else if(userInput.equals("exit")){
                HaveCoffee=false;
               System.out.println("THANK YOU!!");}
           else{
                System.out.println("see you next time ");
            }}}}

//
//





