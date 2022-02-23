import java.time.LocalDateTime;

// klasa kontrolera implementuje logikębiznesową aplikacji
// insterfejs jeśli jest zaimpleemntowany w klasie wymusza implementacje wszystkich jego metod
public class UserControllerImpl implements UserController{
    @Override
    public void registerUser() {

    }

    @Override
    public void registerUser(int userId, String name, String lastName, String email, String password, boolean status, LocalDateTime registrationDateTime, double salary) {
        User user = new User(userId, name, lastName, email, password, status, registrationDateTime, salary);
        // dodaje użytkownika do listy użytkowników
        users.add(user);
        System.out.println("Poprawnie dodano użytkownika do listy!");
    }

    @Override
    public void getAllUsers() {
        for (User user : users) {
            System.out.println(user.toString());
        }
    }

}
