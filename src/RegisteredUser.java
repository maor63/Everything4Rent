public class RegisteredUser extends User{

    String eMail;
    String firstName;
    String lastName;
    String password;

    public RegisteredUser(String eMail, String firstName, String lastName, String password){
        this.eMail = eMail;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }

}
