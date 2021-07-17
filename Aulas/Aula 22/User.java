package co.joaoemanuel;

public class User {
    public String firstName;
    public String lastName;
    private String fullName;

    public String getFullName(){
        fullName = firstName + " " + lastName;
        return firstName + " " + lastName;
    }
}
