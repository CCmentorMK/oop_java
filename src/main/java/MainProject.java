import java.time.LocalDateTime;

public class MainProject {
    public static void main(String[] args) {
        UserControllerImpl usc = new UserControllerImpl();
        usc.registerUser(
                1,
                "Anna",
                "Kot", "" +"ak@ak.pl",
                "aaa",
                true,
                LocalDateTime.now(),
                12_000.
        );
        usc.registerUser(
                2,
                "Jan",
                "Kot", "" +"jk@jk.pl",
                "sss",
                false,
                LocalDateTime.now(),
                10_000.
        );
        usc.getAllUsers();
    }
}
