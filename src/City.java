public class City extends State{
    private String nickname;


    public City(String name, String language, Climate climate, LegislatureBody legislatureBody, String timeZone, String nickname) {
        super(name, language, climate, legislatureBody, timeZone);
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }
    @Override
    public String getInfo() {
        return super.getInfo() + " Nickname " + nickname;
    }
}
