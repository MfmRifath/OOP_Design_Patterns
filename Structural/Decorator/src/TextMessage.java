public class TextMessage implements Message{

    String msg;
    public TextMessage(String msg){
        this.msg = msg;
    }

    @Override
    public String getMessage() {
        return msg;
    }
}
