package ec.edu.epn.service.exceptions;

public class ErrorMessage {
    private final int errorcode;
    private final String errormessage;

    public ErrorMessage(int errorcode, String errormessage) {
        this.errorcode = errorcode;
        this.errormessage = errormessage;
    }

    public int getErrorcode() {
        return errorcode;
    }

    public String getErrormessage() {
        return errormessage;
    }

    @Override
    public String toString() {
        return "ErrorMessage{" +
                "errorcode=" + errorcode +
                ", errormessage='" + errormessage + '\'' +
                '}';
    }
}
