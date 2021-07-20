package co.joaoemanuel;

public class User {
    // PROPIEDADES (PRIVATE)
    private String firstName;
    private String lastName;
    private String fullName;
    private Integer age;
    //CONSTRUTOR

    public User(String firstName, String lastName, Integer age){
        this.firstName = firstName.toUpperCase();
        this.lastName = lastName.toUpperCase();
        this.age = age;
    }
    //MÉTODOS
    // SETTER
    public void setFirstName (String firstName){
        this.firstName = firstName.toUpperCase();
    }

    public void setLastName (String lastName){
        this.lastName = lastName.toUpperCase();
    }

    public void setAge (Integer age){
        this.age = age;
    }

    // GETTER
    public String getFirstName (){
        return firstName;
    }

    public String getLastName (){
        return lastName;
    }

    public Integer getAge (){
        return age;
    }

    public String getFullName (){
        this.fullName = firstName + " " + lastName;
        return fullName;
    }
}
