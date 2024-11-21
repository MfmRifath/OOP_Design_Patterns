public class Main {
    public static void main(String[] args) {
       Message message = new TextMessage("Hi I am Rifath");
       System.out.println(message.getMessage());

       Message decorator = new HtmlEncodedMessage(message);
       System.out.println(decorator.getMessage());

       Message decorator2 = new Base64EncodeMessage(decorator);
       System.out.println(decorator2.getMessage());
    }
}