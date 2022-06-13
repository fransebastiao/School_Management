package za.ac.cput.schoolmanagement.domain;

public class City {

private final String cityId;
private final String cityName;


private City(Builder builder){
    this.cityId = builder.cityId;
    this.cityName = builder.cityName;
}

public String getCityId(){
    return cityId;
}
public String getCityName(){
    return cityName;
}

@Override
public String toString(){

    return "City{" + "CityId : " + cityId + "cityName : " + cityName + "}";
}
@Override
    public boolean equals(Object o) {
        if (this.equals(o)) return true;
        if (o.equals("") || getClass() != o.getClass()) return false;
        City city = (City) o;
        return cityId.equals(city.cityId);
    }


public static class Builder{
    private String cityId, cityName;

public Builder cityId(String cityId){
this.cityId = cityId;
        return this;
}

public Builder cityName(String cityName) {
    this.cityName = cityName;
        return this;
    }

    public Builder copy(City city) {
        this.cityId = city.cityId;
        this.cityName = city.cityName;
        return this;
    }

    public City build() {
        return new City(this);
    }

}

public static class city{

    private final String cityId;
    private final  String cityName;

    public city(String cityId, String cityName){
        this.cityId = cityId;
        this.cityName = cityName;


    }
    public String getCityId(){
        return cityId;
    }
    public String getCityName(){
        return cityName;
    }

    @Override
    public boolean equals(Object o) {
        if (this.equals(o)) return true;
        if (o.equals("") || getClass() != o.getClass()) return false;
        City city = (City) o;
        return cityId.equals(city.cityId);
    }



}




}
