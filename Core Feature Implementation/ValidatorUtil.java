import javax.validation.*;
import java.util.Set;

public class ValidatorUtil {

    private static Validator validator;

    static {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    public static void validateUser(User user) {
        // Get validation errors
        Set<ConstraintViolation<User>> violations = validator.validate(user);

        if (!violations.isEmpty()) {
            // Print each error message
            for (ConstraintViolation<User> violation : violations) {
                System.out.println("Validation Error: " + violation.getMessage());
            }
        } else {
            System.out.println("User data is valid!");
        }
    }
}
