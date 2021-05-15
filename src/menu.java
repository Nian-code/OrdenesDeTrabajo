import java.util.ArrayList;
import java.util.Scanner;

public class menu {

    public static void ShowMenu(ArrayList Engineers, ArrayList Tecnics, ArrayList Clients, ArrayList Orders){
        System.out.println("\n*~~~~~~~* *~~~~~~~* *~~~~~~~* *~~~~~~~*");
        System.out.println("Welcome, Create a OrderWork ");
        System.out.println("*~~~~~~~* *~~~~~~~* *~~~~~~~* *~~~~~~~* \n");
        int i = 0;
        int response;
        Engineer actual = (Engineer) Engineers.get(0);
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
                    crearOrderWork(actual, Tecnics, Clients, Orders);
                    break;
                case 2:
                    int id = changeEngineer(Engineers);
                    actual = (Engineer) Engineers.get(id);
                    break;
                case 3:
                    createEngineer(Engineers);
                    break;
                case 4:
                    showOrders(Orders);
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

    private static void addOrder(ArrayList Orders, OrderWork order){
        Orders.add(order);
    }

    private static void  showOrders(ArrayList Orders){
        for (int x = 0; x < Orders.size(); x++){
            OrderWork j = (OrderWork) Orders.get(x);
            System.out.println(
                                "\nDate" + j.getDate() +
                                "\nID: "+ j.getOrderID() + " " +
                               "\nName client: " + j.getClientName() +
                                "\nName Tecnic: "  + j.getTecnicName() +
                                "\nName Engineer: " + j.getEngineerName());
        }
        System.out.println("\n");
    }

    private static void crearOrderWork(Engineer actual, ArrayList Tecnics, ArrayList Clients, ArrayList Orders){

        for (int x = 0; x < Tecnics.size(); x++){
            Tecnic j = (Tecnic) Tecnics.get(x);
            System.out.println("ID: "+ j.getID() + " " + j.getName());
        }
        System.out.print("Select one ID del tecnico: ");

        int response;
        Scanner t = new Scanner(System.in);
        response = Integer.valueOf(t.next());

        for (int x = 0; x < Clients.size(); x++){
            Client j = (Client) Clients.get(x);
            System.out.println("ID: "+ j.getID() + " " + j.getName() + " " + j.getLastname());
        }
        System.out.print("Select one ID del cliente: ");

        int response1;
        Scanner t1 = new Scanner(System.in);
        response1 = Integer.valueOf(t1.next());

        OrderWork order = new OrderWork((Tecnic) Tecnics.get(response), (Client) Clients.get(response1), actual);
        addOrder(Orders, order);
        System.out.println("Order was create! \n");
    }
    private static void createEngineer(ArrayList Engineers) {
        Scanner re = new Scanner(System.in);
        System.out.print("Name engineer: ");
        String response = String.valueOf(re.nextLine());
        Engineer engineer = new Engineer(response);
        Engineers.add(engineer);
    }

    private static int changeEngineer(ArrayList Engineers) {
        for (int x = 0; x < Engineers.size(); x++){
            Engineer j = (Engineer) Engineers.get(x);
            System.out.println("ID: "+ j.getID() + " " + j.getName());
        }
        System.out.print("Select one ID: ");

        int response;
        Scanner re = new Scanner(System.in);
        response = Integer.valueOf(re.nextLine());

        if (response > Engineers.size() -1) {
            System.out.println("Select one correct");
            changeEngineer(Engineers);
        }
        return response;
    }


}
