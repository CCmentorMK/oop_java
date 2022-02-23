import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


// interfejs
// -> nie jest to klasa
// -> nie możemy utworzyć obiektu
// -> może zawierać metody abstrakcyjne -> bez implementacji
// -> może zawierać składowe statyczne
public interface UserController {
    public static List<User> users = new ArrayList<>();
    public void registerUser();
    public void registerUser(
            int userId,
            String name,
            String lastName,
            String email,
            String password,
            boolean status,
            LocalDateTime registrationDateTime,
            double salary);

    public void getAllUsers();
}
