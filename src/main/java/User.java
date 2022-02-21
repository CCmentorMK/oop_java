import java.time.LocalDateTime;

// klasa modelu - determinuje strukturędanych
// co to jest klasa -> szablon/foremka
// -> pola klasowe - zmienne i obiekty
// każda klasa dziedziczy metody z nadklasy Object

// Model java beans
// -> prywatne pola klasowe
// -> konstruktor/y
// -> metoda toString
// -> publiczne get/set
public class User  {
    private int userId;
    private String name;
    private String lastName;    // camelStyle
    private String email;
    private String password;
    private boolean status;
    private LocalDateTime registrationDateTime;
    private double salary;
    // konstruktor klasy -> metoda spejalna która konstruuje obiekt klasy
    // domyślny
    public User(){}
    // własny (ALT+Enter -> generate + constructor)
    public User(int userId, String name, String lastName, String email, String password, boolean status, LocalDateTime registrationDateTime, double salary) {
        this.userId = userId;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.status = status;
        this.registrationDateTime = registrationDateTime;
        this.salary = salary;
    }
    public String toString(String myFromat) {
        return "???";
    }
    // ALT + Ins -> toString
    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", status=" + status +
                ", registrationDateTime=" + registrationDateTime +
                ", salary=" + salary +
                '}';
    }
    // ALT + Ins -> getters & setters
    public int getUserId() {                    // pobieranie aktualnej wartośći
        return userId;
    }
    public void setUserId(int userId) {         // modyfikowanie wartośći pola
        // tu można dodać validacje
        this.userId = userId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public LocalDateTime getRegistrationDateTime() {
        return registrationDateTime;
    }

    public void setRegistrationDateTime(LocalDateTime registrationDateTime) {
        this.registrationDateTime = registrationDateTime;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
