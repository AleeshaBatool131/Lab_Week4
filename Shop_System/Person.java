import java.util.Objects;
public class Person{
    private String name;
    private String email;
    private Address personAddress;

    public Person(String name, String email, Address personAddress) {
        this.name = name;
        this.email = email;
        this.personAddress = personAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(Address personAddress) {
        this.personAddress = personAddress;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\n Email: %s\n",name, email);
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj) return true;
        if (obj==null|| getClass()!=obj.getClass()) return false;
        Person temp = (Person) obj;
        return Objects.equals(name,temp.name);
    }

    @Override
    public Person clone(){
        return new Person(name, email, personAddress);
    }
}