public class AWSResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
         return new EC2Instance();
    }

    @Override
    public Storage createStorage(int capacity) {
        return new S3Storage(capacity );
    }
}
