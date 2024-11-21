public class GoogleCloudStorage implements Storage {
    public GoogleCloudStorage(int capacityInMib) {
        System.out.println("Allocated "+capacityInMib+ " on Google Cloud Storage");
    }

    @Override
    public String getId() {
        return "gcpc1";
    }

    @Override
    public String toString(){
        return "Google Cloud Storage";
    }
}
