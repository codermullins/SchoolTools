package net.androidbootcamp.schooltools.model;
import android.content.ContentValues;
import net.androidbootcamp.schooltools.database.loginTable;
public class Users {

    private String username;
    private String firstName;
    private String lastName;
    private String password;
    private String email;

    public Users() {
    }

    public Users(String username, String firstName, String lastName, String password, String email) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public ContentValues toValues() {
        ContentValues values = new ContentValues(5);

        values.put(loginTable.username, username);
        values.put(loginTable.firstName, firstName);
        values.put(loginTable.lastName, lastName);
        values.put(loginTable.password, password);
        values.put(loginTable.email, email);
        return values;
    }

    @Override
    public String toString() {
        return "Users{" +
                "username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
