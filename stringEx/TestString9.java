package lang.string.stringEx;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";
        String[] splitStr = email.split("@");
        String idPart = splitStr[0];
        String domainPart = splitStr[1];
        System.out.println("ID: " + idPart);
        System.out.println("Domain: " + domainPart);
    }
}
