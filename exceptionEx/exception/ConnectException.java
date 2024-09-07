package exception.exceptionEx.exception;

public class ConnectException extends NetworkClientException {
    private final String address;

    public ConnectException(String message, String address) {
        super(message);
        this.address = address;
    }

    public String getAddress(){
        return address;
    }
}
