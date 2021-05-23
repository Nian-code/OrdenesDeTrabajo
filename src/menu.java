import Model.Client;
import Model.Engineer;
import Model.OrderWork;
import Model.Tecnic;

import java.util.ArrayList;
import java.util.Scanner;

public class menu {
    static Engineer actual = Main.Engineers.get(0);

    public static void ShowMenu(){
        System.out.println("\n*~~~~~~~* *~~~~~~~* *~~~~~~~* *~~~~~~~*");
        System.out.println("Welcome, Create a Model.OrderWork ");
        System.out.println("*~~~~~~~* *~~~~~~~* *~~~~~~~* *~~~~~~~* \n");
        int i = 0;
        int response;
        do {
            System.out.println("Actual engineer is: "+ actual.getName());
            System.out.println("\nMenu:");
            System.out.println("[1] Create order work");
            System.out.println("[2] Change Engineer");
            System.out.println("[3] Create Engineer");
            System.out.println("[4] Show orders");
            System.out.println("[9] Salir");

            Scanner re = new Scanner(System.in);
            try{
                response = Integer.valueOf(re.nextLine());
            }
            catch (NumberFormatException e){
                break;
            }
            switch (response){
                case 1:
                    crearOrderWork();
                    break;
                case 2:
                    int id = showItems(Main.Engineers);
                    actual = Main.Engineers.get(id);
                    break;
                case 3:
                    createEngineer();
                    break;
                case 4:
                    System.out.println(Main.Orders);
                    break;

                case 9:
                    System.out.println("Thanks!");
                    break;
                default:
                    System.out.println("Select one correct");
            }
        }while (response !=0 && response != 9);

        Scanner menu = new Scanner(System.in);

    }

    public static void crearOrderWork(){
        ArrayList Tecnics = Main.Tecnics;
        ArrayList Clients = Main.Clients;

        int response = showItems(Tecnics);
        int response1 = showItems(Clients);
        OrderWork order = new OrderWork((Tecnic) Tecnics.get(response), (Client) Clients.get(response1), actual);
        Main.Orders.add(order);
    }
    private static void createEngineer() {
        Scanner re = new Scanner(System.in);
        System.out.print("Name engineer: ");
        String response = String.valueOf(re.nextLine());
        System.out.print("Phone engineer: ");
        String response1 = String.valueOf(re.nextLine());
        Engineer engineer = new Engineer(response, response1);
        Main.Engineers.add(engineer);
    }
    private static int showItems(ArrayList Array) {
        System.out.println(Array);
        System.out.print("Select one ID: ");

        int response = 0;
        Scanner re = new Scanner(System.in);
        response = Integer.valueOf(re.nextLine());

        if (response > Array.size() - 1) {
            System.out.println("Select one correct");
            response  = showItems(Array);
        }
        return response;
    }
}
