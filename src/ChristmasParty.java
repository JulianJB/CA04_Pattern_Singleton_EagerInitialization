// In the year there are many parties,
// but there is only one Christmas party every year.
class ChristmasParty {

    // Providing the singleton with an eager initialization
    private static ChristmasParty _instance = new ChristmasParty();

    // The private access modifier prevent the creation of
    // additional instances from this class.
    private ChristmasParty() {
        ; // Do nothing
    }

    public static ChristmasParty getInstance() {
        // Return the singleton static instance
        return _instance;
    }

    @Override
    public String toString() { // Comment this method to see the actual allocation in memory
        // Return the name for this year's Christmas party
        return "Christmas Party 2020";
    }
}