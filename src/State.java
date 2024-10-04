public class State extends  Country{
    private String timeZone;


    public State(String name, String language, Climate climate, LegislatureBody legislatureBody, String timeZone) {
        super(name, language, climate, legislatureBody);
        this.timeZone = timeZone;
    }

    public String getTimeZone() {
        return timeZone;
    }
    public void stateMotto (){
        System.out.println("Ditat Deus");
    }
    public void stateMotto (String motto){
        System.out.println(motto);
    }
    public final void printTimeZone () {
        System.out.println("Time Zone: " + timeZone);
    }
    public String getInfo() {
        return "State: " + getName() +
                "\nLanguage: " + getLanguage() +
                "\nClimate: " + getClimate() +
                "\nLegislature Body. Upper house: " + getLegislatureBody().getUpperHouse() +
                "\nLegislature Body. Lower house: " + getLegislatureBody().getLowerHouse() +
                "\nTimeZone: " + timeZone;
    }
}
