// A computer has many system files and registries,
// but there is only one system registry file.
class SystemRegistry {

    // Eager initialization in singletons works with the Java Virtual Machine
    // creating the unique instance of the singleton as soon as the SystemRegistry class is loaded.
    // This allows to provide a thread-safe implementation of the singleton pattern,
    // as it guarantees an instance creation before any thread gets access to the _instance variable.
    // This approach can represent however, an impact on the performance of the application
    // as it would always create the unique instance for the singleton regardless on whether the
    // singleton is requested or not by a thread, ultimately leading to a waste of resources.
    private static SystemRegistry _instance = new SystemRegistry(); // Providing the singleton with an eager initialization

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