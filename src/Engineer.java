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

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ID = " + ID + " " + super.toString() +
                "name = '" + this.getSpeciality() +
                "lastname = '" + this.getEmail();
    }
}
