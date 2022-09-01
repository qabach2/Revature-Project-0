import Service.DrinkService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        DrinkService drinkService = new DrinkService();
        boolean HaveCoffee = true;
        while (HaveCoffee){
            System.out.println("WHAT CAN I GET YOU: (latte, white chocolate mocha, caramel macchiato,london fog tea latte ,exit");
            String UserInput = ab.nextLine();
            if(UserInput.equals("latte")) {
                System.out.println("espresso shot and milk");
            } else if (UserInput.equals("white chocolate mocha")) {
                System.out.println("espresso shot, white mocha, milk and top with wiped cream");
            } else if (UserInput.equals("caramel macchiato")) {
                System.out.println("espresso shot, vanilla syrup, milk and topped with wiped cream and caramel sauce");
            } else if (UserInput.equals("london fog tea latte")) {
                System.out.println("english breakfast tea bag topped with steam milk");

//            } else if(UserInput.equals("exit")) {
//
//                System.out.println("Thanks for Visiting");

            } else if (UserInput.equals("exit")) {
              HaveCoffee =false;
            }
        }
        }
        }


