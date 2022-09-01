import Service.DrinkService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        DrinkService drinkService = new DrinkService();
        boolean HaveCoffee = true;
        while (HaveCoffee){
            System.out.println("what can i get you hot , iced , exit )");
            String UserInput = ab.nextLine();
            if(UserInput.equals("hot")) {
                System.out.println("latte ,white chocolate mocha , caramel macchiato");
            }else if (UserInput.equals("latte")) {
                System.out.println("espresso shot and milk");
               } else if (UserInput.equals("white chocolate mocha")) {
                System.out.println("espresso shot, white mocha, milk and top with wiped cream");
               } else if (UserInput.equals("caramel macchiato")) {
                System.out.println("espresso shot, vanilla syrup, milk and topped with wiped cream and caramel sauce");
               } else if (UserInput.equals("london fog tea latte")) {
                   System.out.println("english breakfast tea bag topped with steam milk");
               }else if(UserInput.equals("iced")){
                   System.out.println("vanilla been frappuccino,  green tea latte, ");
               } else if (UserInput.equals("vanilla been frappuccino")) {
                   System.out.println("milk ,vanilla been powder , blend with ice and top with wiped cream ");
            } else if (UserInput.equals("green tea latte")) {
                System.out.println("milk , scoop of matcha powder , ice, put in shaker and shake it well ");
              } else if (UserInput.equals("exit")) {
              HaveCoffee =false;
                System.out.println("THANKS FOR VISITING");
            }
        }
        }
        }


