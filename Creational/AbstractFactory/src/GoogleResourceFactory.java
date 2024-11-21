public class GoogleResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEnginInstance(capacity);
    }

    @Override
    public Storage createStorage(int capacity) {
        return new GoogleCloudStorage(capacity);
    }
}
