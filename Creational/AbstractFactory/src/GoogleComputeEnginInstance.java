public class GoogleComputeEnginInstance implements Instance{

    public GoogleComputeEnginInstance(Capacity capacity) {
        System.out.println("Created Google Compute Engine instance");
    }

    @Override
    public void start() {
    System.out.println("Starting Google Compute Engine instance");
    }

    @Override
    public void attachStorage(Storage storage) {
    System.out.println("Attached Google Compute Engine instance");
    }

    @Override
    public void stop() {
System.out.println("Stopping Google Compute Engine instance");
    }
}
