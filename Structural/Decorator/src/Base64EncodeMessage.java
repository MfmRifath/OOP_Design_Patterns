import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64EncodeMessage implements Message{

    private Message message;

    public Base64EncodeMessage(Message message) {
        this.message = message;
    }
    @Override
    public String getMessage(){
        return Base64.getEncoder().encodeToString(message.getMessage().getBytes(StandardCharsets.UTF_8));
    }
}
