public class Engineer extends personalData{

    public static int id = 0;
    private int ID;
    private String speciality;
    private String email;

    Engineer(String name, String tell){
        super(name, tell);
        this.ID   = id;
        id++;
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
        return "ID = " + ID + " " +
                "name = '" + super.getName() +
                "lastname = '" + super.getLastname();
    }
}
