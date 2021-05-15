public class Engineer {

    public static int id = 0;
    private String name;
    private int ID;

    Engineer(String name){
        this.name = name;
        this.ID   = id;
        id++;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public void AgendarTecnico(){

    }

    public void LlamarClientes(){

    }

    public void RecibirOrdenes(){

    }

    public void CrearOrdenes(){

    }

    @Override
    public String toString() {
        return "ID= " + ID + " " +
                "name='" + name ;
    }
}
