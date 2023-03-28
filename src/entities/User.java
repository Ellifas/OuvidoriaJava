package entities;

public class User extends Admin {

    private Long id;
    private String firstName;
    private String lastName;
    private String cpf;
    private String birthDate;
    private String password;

    public User(Long id, String firstName, String lastName, String cpf, String birthDate, String password) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cpf = cpf;
        this.birthDate = birthDate;
        this.password = password;
    }

    public User() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String passsword) {
        this.password = passsword;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cpf='" + cpf + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
