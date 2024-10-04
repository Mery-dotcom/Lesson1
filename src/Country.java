public class Country {
    private String name;
    private String language;
    private Climate climate;
    private  LegislatureBody legislatureBody;

    public Country(String name, String language, Climate climate, LegislatureBody legislatureBody) {
        this.name = name;
        this.language = language;
        this.climate = climate;
        this.legislatureBody = legislatureBody;
    }

    public String getName() {
        return name;
    }

    public String getLanguage() {
        return language;
    }

    public Climate getClimate() {
        return climate;
    }

    public LegislatureBody getLegislatureBody() {
        return legislatureBody;
    }
}
