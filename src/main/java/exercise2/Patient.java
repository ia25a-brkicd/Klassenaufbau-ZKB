package exercise2;

public class Patient {

    //TODO: Declare Private Attributes
    private String firstname;
    private String lastname;
    private int age;
    private String gender;
    double height;
    double weight;


    //TODO: Create Constructor
    public Patient(String firstname, String lastname, int age, String gender, double height, double weight) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    //TODO: Add Getter and Setter Methods

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 100) {
            this.age = age;
        }
        else {
            System.out.println("Invalid Age");
        }

    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //TODO: Add toString Method

    public String toString() {
        return firstname + " " + lastname + " is " + age + gender;
    }

}
