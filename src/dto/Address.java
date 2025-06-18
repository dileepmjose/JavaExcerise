package dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address {
    private String street;
    private String city;
    private String country;



    // toString() for easy printing
    @Override
    public String toString() {
        return street + ", " + city + ", " + country;
    }
}