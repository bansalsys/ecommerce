package tbansal.java.lessons.ecommerce.model;

public class Address {
    private String postalCode;
    private String houseNumber;
    private String city;

    public Address(String postalCode, String houseNumber, String city) {

        this.postalCode = postalCode;
        this.houseNumber = houseNumber;
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getCity() {
        return city;
    }
}
