import java.util.ArrayList;

public class Main {
    public static void main(String[] arg){

        ArrayList<Engineer> Engineers = new ArrayList<>();
        ArrayList<Tecnic> Tecnics = new ArrayList<>();
        ArrayList<Client> Clients = new ArrayList<>();
        ArrayList<OrderWork> Orders = new ArrayList<>();

        Engineer Diego = new Engineer("Diego", "3177777777");
        Engineer Johantan = new Engineer("Jonathan", "320000000");
        Engineer Maicol = new Engineer("Maicol", "3424231111");

        Engineers.add(Diego);
        Engineers.add(Johantan);
        Engineers.add(Maicol);

        String [] tools  = new String[] {"RJ", "Cable"};
        Tecnic  Sebastian = new Tecnic("Sebastian", "Martinez", "3242313465");
        Tecnic  Yeison    = new Tecnic("Yeison", "Villa", "3002343289");
        Tecnic  Jhon      = new Tecnic("Jhon", "Naranja","3908238487", true, tools);

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







