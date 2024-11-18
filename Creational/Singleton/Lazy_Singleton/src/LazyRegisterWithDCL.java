public class LazyRegisterWithDCL {
    private LazyRegisterWithDCL() {

    }

    private static volatile   LazyRegisterWithDCL INSTANCE;

     public static  LazyRegisterWithDCL getInstance() {
         if (INSTANCE == null) {
             synchronized (LazyRegisterWithDCL.class) {
                 if (INSTANCE == null) {
                     INSTANCE = new LazyRegisterWithDCL();
                 }
             }

         }
          return INSTANCE;
     }
}
