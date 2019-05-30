package student;

public class Students {
    protected String name;
    protected String email;
    protected Integer idNumber;

    public void Students(String name, String email, Integer idNumber){
        this.name = name;
        this.email = email;
        this.idNumber = idNumber;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(Integer idNumber) {
        this.idNumber = idNumber;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}