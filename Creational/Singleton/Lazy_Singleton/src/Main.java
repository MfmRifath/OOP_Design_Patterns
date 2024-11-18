public class Main {
    public static void main(String[] args) {
       LazyRegisterWithDCL lazyRegisterWithDCL = LazyRegisterWithDCL.getInstance();

       LazyRegisterWithDCL lazyRegisterWithDCL2 = LazyRegisterWithDCL.getInstance();
       System.out.println(lazyRegisterWithDCL==lazyRegisterWithDCL2);


    }
}