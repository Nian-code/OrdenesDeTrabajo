import java.util.ArrayList;

public class Main {
    public static void main(String[] arg){

        ArrayList<Engineer> Engineers = new ArrayList<>();

        Engineer Diego = new Engineer("Diego");
        Engineer Johantan = new Engineer("Jonathan");
        Engineer Maicol = new Engineer("Maicol");

        Tecnic  Sebastian = new Tecnic("Sebastian", 12323);
        Tecnic  Yeison    = new Tecnic("Yeison", 1231321);
        Tecnic  Jhon      = new Tecnic("Jhon", 12332);

        Engineers.add(Diego);
        Engineers.add(Johantan);
        Engineers.add(Maicol);

        Client mariaDelSocorro = new Client("Maria", 312213233L, "Amarillas");
        Client esteban         = new Client("Esteban", "Gonzales", 323423233L, "Cruz");
        Client mario           = new Client("Mario", "Portela", 3234232333L,
                                    "Chucuni", "4.451734962432897" , "-75.14418769724239");

        menu.ShowMenu(Engineers);
    }

}







