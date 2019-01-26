package location.model;

public class Location {
    private int id;
    private String city;
    private String postalCode;
    private String street;
    private String streetNo;

    public Location(int id, String city, String postalCode, String street, String streetNo) {
        this.id = id;
        this.city = city;
        this.postalCode = postalCode;
        this.street = street;
        this.streetNo = streetNo;
    }
}
