import java.time.LocalDateTime;

// klasa uruchomieniowa dla całego programu
public class Main {
    // psvm -> public static void main(String[] args)
    // sout -> System.out.println()
    public static void main(String[] args) {
        // Typ nazwaObiektu = new Typ();
        User user1 = new User();
//        user1.name = "Michał";
        user1.setName("Michał");
//        user1.email = "mk@mk.pl";
        user1.setEmail("mk@mk.pl");
        User user2 = new User(
                1,
                "Anna",
                "Kot", "" +"ak@ak.pl",
                "aaa",
                true,
                LocalDateTime.now(),
                12_000.);

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user1.getName());



    }
}
