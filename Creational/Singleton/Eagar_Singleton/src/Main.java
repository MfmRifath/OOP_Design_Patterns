public class Main {
    public static void main(String[] args) {
        EagerRegistry registry = EagerRegistry.getInstance();
        EagerRegistry registry2 = EagerRegistry.getInstance();

        System.out.println(registry == registry2);
    }
}