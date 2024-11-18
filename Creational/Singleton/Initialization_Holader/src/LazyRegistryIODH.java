public class LazyRegistryIODH {
    private LazyRegistryIODH() {
System.out.println("LazyRegistryIODH");
    }
     private static class RegistryHolder {
        static LazyRegistryIODH INSTANCE = new LazyRegistryIODH();
     }

     public static LazyRegistryIODH getInstance() {
        return RegistryHolder.INSTANCE;
     }
}
