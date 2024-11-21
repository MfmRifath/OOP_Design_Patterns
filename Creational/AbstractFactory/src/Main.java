public class Main {
    private ResourceFactory factory;

    public Main(ResourceFactory factory) {
        this.factory = factory;

    }

    public Instance createInstance(Instance.Capacity capacity,int storageMib) {

        Instance instance = factory.createInstance(capacity);
        Storage storage = factory.createStorage(storageMib);
        instance.attachStorage(storage);
        return instance;

    }
    public static void main(String[] args) {
        Main aws = new Main(new AWSResourceFactory());
        Instance il = aws.createInstance(Instance.Capacity.micro,20480);
        il.start();
        il.stop();

        System.out.println("*****************************************************");

        Main google = new Main(new GoogleResourceFactory());
        Instance gl= google.createInstance(Instance.Capacity.micro,20480);
        gl.start();
        gl.stop();
    }
}