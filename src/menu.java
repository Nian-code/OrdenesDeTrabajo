import java.util.ArrayList;
import java.util.Scanner;

public class menu {

    public static void ShowMenu(ArrayList Engineers){
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
            System.out.println("[9] Salir");

            Scanner re = new Scanner(System.in);
            response = Integer.valueOf(re.nextLine());

            switch (response){
                case 2:
                    int id = changeEngineer(Engineers);
                    actual = (Engineer) Engineers.get(id);
                    break;
                case 3:
                    createEngineer(Engineers);
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
