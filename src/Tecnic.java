

public class Tecnic extends personalData{
    public static int id = 0;
    private int ID;

    private boolean disponibiliy;
    private String[] tools;
    private String bonus;
    //Clase anidada como productividad

    Tecnic(String name, String lastname, String tell){
        super(name, lastname, tell);
        this.ID = id;
        id++;
    }

    Tecnic(String name, String lastname, String tell, boolean disponibiliy, String[] tools){
        super(name, lastname, tell);
        this.ID = id;
        this.disponibiliy = disponibiliy;
        this.tools = tools;
        id++;
    }

    public static int getId() {
        return id;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return  "ID= " + ID + " " +
                "name= '" + super.getName() + '\'' +
                ", lastname= '" + super.getLastname() + '\'' +
                ", tel= '" + super.getTell() + '\'' +
                "\n";
    }
}


