package co.joaoemanuel;

public class User {
    // PROPIEDADES (PRIVATE)
    private String firstname;
    private String lastname;
    //CONSTRUTOR
    public User(String firstname, String lastname){
        this.firstname = firstname.toUpperCase();
        this.lastname = lastname.toUpperCase();
    }

    //MÉTODOS

    // SETTER

    public void setFirstname(String firstname){ this.firstname = firstname.toUpperCase(); }

    public void setLastname(String lastname){ this.lastname = lastname.toUpperCase(); }

    // GETTER

    public String getFullname(){return firstname + " " + lastname;}

    public String getFullname(boolean showLastName) {
        if (showLastName) {
            return getFullname();
        }  return firstname; }
}
