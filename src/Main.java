import java.util.ArrayList;

public class Main {
    public static void main(String[] arg){

        ArrayList<Engineer> Engineers = new ArrayList<>();
        ArrayList<Tecnic> Tecnics = new ArrayList<>();
        ArrayList<Client> Clients = new ArrayList<>();
        ArrayList<OrderWork> Orders = new ArrayList<>();

        Engineer Diego = new Engineer("Diego");
        Engineer Johantan = new Engineer("Jonathan");
        Engineer Maicol = new Engineer("Maicol");

        Engineers.add(Diego);
        Engineers.add(Johantan);
        Engineers.add(Maicol);

        Tecnic  Sebastian = new Tecnic("Sebastian", "3242313465");
        Tecnic  Yeison    = new Tecnic("Yeison", "3002343289");
        Tecnic  Jhon      = new Tecnic("Jhon", "3908238487");

        Tecnics.add(Sebastian);
        Tecnics.add(Yeison);
        Tecnics.add(Jhon);

        Client mariaDelSocorro = new Client("Maria", "312213233", "Amarillas");
        Client esteban         = new Client("Esteban", "Gonzales", "323423233", "Cruz");
        Client mario           = new Client("Mario", "Portela", "3234232333",
                                    "Chucuni", "4.451734962432897" , "-75.14418769724239");

        Clients.add(mariaDelSocorro);
        Clients.add(esteban);
        Clients.add(mario);

        menu.ShowMenu(Engineers, Tecnics, Clients, Orders);

    }

}







