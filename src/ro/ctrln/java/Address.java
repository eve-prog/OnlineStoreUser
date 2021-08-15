package ro.ctrln.java;

import java.util.Objects;

public class Address {
    private int addressId;
    private String city;
    private String streetName;
    private String streetNumber;

    public Address(int addressId, String city, String streetName, String streetNumber) {
        this.addressId = addressId;
        this.city = city;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", city='" + city + '\'' +
                ", streetName='" + streetName + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return addressId == address.addressId && city.equals(address.city) && streetName.equals(address.streetName) && streetNumber.equals(address.streetNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressId, city, streetName, streetNumber);
    }
}