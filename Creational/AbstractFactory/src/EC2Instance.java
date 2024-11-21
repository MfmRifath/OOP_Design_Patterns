public class EC2Instance implements Instance {
    public EC2Instance() {
        System.out.println("Creating EC2 instance");
    }


    @Override
    public void start() {
        System.out.println("Starting EC2 instance");
    }

    @Override
    public void attachStorage(Storage storage) {
    System.out.println("Attaching Storage instance");
    }

    @Override
    public void stop() {
    System.out.println("Stopping EC2 instance");
    }

    @Override
    public String toString() {
        return "EC2 instance";
    }
}
