package DiaLogApp;

/**
 * e
 *
 * @author oldwai
 */
public enum ErrorCode {

    SUCCESS(0, "ok"),
    PARAMS_ERROR(40000, "1"),
    NOT_LOGIN_ERROR(40100, "1"),
    NO_AUTH_ERROR(40101, "1"),
    NOT_FOUND_ERROR(40400, "1"),
    FORBIDDEN_ERROR(40300, "1"),
    SYSTEM_ERROR(50000, "1"),
    OPERATION_ERROR(50001, "1");

    /**
     * e
     */
    private final int code;

    /**
     * e
     */
    private final String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
