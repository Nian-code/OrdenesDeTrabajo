public class personalData {
    private String name;
    private String lastname;
    private String tell;

    public personalData(String name, String lastname, String tell) {
        this.name = name;
        this.lastname = lastname;
        this.tell = tell;
    }

    public personalData(String name, String tell) {
        this.name = name;
        this.tell = tell;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }
}
