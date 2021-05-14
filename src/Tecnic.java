public class Tecnic {
    public static int id = 0;
    private String name;
    private String lastname;
    private int ID;
    private long tel;

    Tecnic(String name, int tel){
        this.ID = id;
        this.name = name;
        this.tel  = tel;
        id++;
    }

    Tecnic(String name, String lastname, int tel){
        this.ID = id;
        this.name = name;
        this.lastname = lastname;
        this.tel  = tel;
        id++;
    }
}

