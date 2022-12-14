package task;

public final class Address {
    String cityName;
    int zipCode;
    String streetName;
    int buildingNumber;
    int buildingLetter;
    int apartmentNumber;
    public Address Empty_ADDRESS()
    {
        return null;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public int getBuildingLetter() {
        return buildingLetter;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getCityName() {
        return cityName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public void setBuildingLetter(int buildingLetter) {
        this.buildingLetter = buildingLetter;
    }

    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
}
