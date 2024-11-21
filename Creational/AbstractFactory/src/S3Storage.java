public class S3Storage implements Storage {
    public S3Storage(int capacityInMinb) {
        System.out.println("Allocated "+capacityInMinb+" on S3");
    }

    @Override
    public String getId() {
        return "S31";
    }

    @Override
    public String toString() {
        return "S3 Storage";
    }
}
