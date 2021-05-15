public class Tecnic {
    public static int id = 0;
    private String name;
    private String lastname;
    private int ID;
    private String tel;

    Tecnic(String name, String tel){
        this.ID = id;
        this.name = name;
        this.tel  = tel;
        id++;
    }

    Tecnic(String name, String lastname, String tel){
        this.ID = id;
        this.name = name;
        this.lastname = lastname;
        this.tel  = tel;
        id++;
    }

    public static int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getID() {
        return ID;
    }

    public String getTel() {
        return tel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return  "ID= " + ID + " " +
                "name= '" + name + '\'' +
                ", lastname= '" + lastname + '\'' +
                ", tel= '" + tel + '\'' +
                "\n";
    }
}


