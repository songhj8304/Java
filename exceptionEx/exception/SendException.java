package exception.exceptionEx.exception;

public class SendException extends NetworkClientException {
    private final String sendData;

    public SendException(String message, String sendData) {
        super(message);
        this.sendData = sendData;
    }

    public String getSendData(){
        return sendData;
    }
}
