public class Address{

    private String city;
    private String country;

    Address(String city, String country){
        this.city=city;
        this.country=country;
    }
    Address(String city){
        this(city,"Unknown Country");
    }

    Address(){
        this("Unknown City");
    }

    public String getCity(){
        return city;
    }
    public String getCountry(){
        return country;
    }
    public void setCity(String city){
        this.city=city;
    }
    public void setCountry(String country){
        this.country=country;
    }

    @Override
    public Address clone(){
        return new Address(city, country);
    }

    @Override
    public String toString(){
        return String.format("City: %s\n Country: %s\n", city, country);
    }
}
