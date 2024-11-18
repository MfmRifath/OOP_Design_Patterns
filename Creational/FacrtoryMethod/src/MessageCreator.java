public abstract class MessageCreator {
    public Message getMessage() {
        Message msg = createMessage();

        msg.addDefauldHeaders();
        msg.encrypt();

        return msg;

    }
    //Factory Methode
    public abstract Message createMessage();
}
