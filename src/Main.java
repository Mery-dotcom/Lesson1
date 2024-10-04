public class Main {
    public static void main(String[] args) {
LegislatureBody legislatureBody = new LegislatureBody("Arizona Senate",
        "Arizona House of Representatives");
Country country = new Country("USA", "English", Climate.HIGHLY_DIVERSE, legislatureBody);
State objectA = new State("Arizona", "English", Climate.TEMPERATE_CLIMATE, legislatureBody,
        "UTC−7:00");
City objectB = new City("Phoenix", "English", Climate.ARID, legislatureBody, "UTC-7",
        "Sun Valley");
City objectC = new City("Cheyenne", "English", Climate.CONTINENTAL_SEMIARID, legislatureBody,
        "Mountain time: UTC 7, summer UTC 6", "Equality State");

        System.out.println(objectA.getInfo());
        System.out.println(objectB.getInfo());
        System.out.println(objectC.getInfo());

        objectA.stateMotto("Equal rights");
        objectA.stateMotto();
    }
}

