import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User {

    // Username should not be null or empty, and should have a minimum length of 4 characters.
    @NotBlank(message = "Username is required")
    @Size(min = 4, max = 15, message = "Username must be between 4 and 15 characters")
    private String username;

    // Email should be in a valid email format and should not be null or empty.
    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;

    // Password should not be null or empty, and should have a minimum length of 8 characters.
    @NotBlank(message = "Password is required")
    @Size(min = 8, message = "Password must be at least 8 characters")
    private String password;

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
