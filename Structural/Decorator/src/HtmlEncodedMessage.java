

public class HtmlEncodedMessage implements Message {
    Message msg;

    public HtmlEncodedMessage(Message msg) {
        this.msg = msg;
    }
    @Override
    public String getMessage() {
        return "Html Encoded Message"+ msg.getMessage();
    }
}
