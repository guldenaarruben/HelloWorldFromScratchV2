package nl.lambda.excersises;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private int count=0;

    public Person(String firstName, String lastName, int age) {
        super();
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        count++;
        return "\nPerson [ firstName="+firstName+"; lastName="+lastName+"; age="+age+ "; count="+count+"]";

        //return "Person [firstName="+firstName +/*+"lastName="+lastName+"age="+age+ */"count="+count+"]\n";
    }
}
