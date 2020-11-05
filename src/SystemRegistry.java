// A computer has many system files and registries,
// but there is only one system registry file.
class SystemRegistry {

    // Providing the singleton with an eager initialization
    private static SystemRegistry _instance = new SystemRegistry();

    // The private access modifier prevent the creation of
    // additional instances from this class.
    private SystemRegistry() {
        ; // Do nothing
    }

    public static SystemRegistry getInstance() {
        // Return the singleton static instance
        return _instance;
    }

    // Other useful methods of the system registry singleton
    void writeEntry() {}

    void deleteEntry() {}

    void backupRegistry() {}
}