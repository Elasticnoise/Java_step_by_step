package src.ru.skillbox;

public class Country {
    private String   name;
    private int      population;
    private int      countryArea;
    private String   capital;
    private boolean  seaAccess;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getCountryArea() {
        return countryArea;
    }

    public void setCountryArea(int countryArea) {
        this.countryArea = countryArea + "m^2";
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public boolean isSeaAccess() {
        return seaAccess;
    }

    public void setSeaAccess(boolean seaAccess) {
        this.seaAccess = seaAccess;
    }

    public Country(String name) {
        this.name = name;
    }
}
