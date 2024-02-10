package co.com.qvision.conduit.models;

public class Login {

    String email;
    String password;

    String username;

    public Login( String email, String password, String username) {

        this.email = email;
        this.password = password;
        this.username = username;
    }
    public String getUsername() {
        return username;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
