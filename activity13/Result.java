/**
 * Generic wrapper class for displaying operation results.
 * Encapsulates data, status message, and if it is success.
 * 
 * @param <T> : the type of data being wrapped
 */
public class Result<T> {
    private T data;
    private String message;
    private boolean isSuccess;

    /**
     * Parameterized constructor that Results with data, message, and success
     * status.
     * 
     * @param data      : the data object to wrap
     * @param message   : the status of message
     * @param isSuccess : whether the operation was successful
     */
    public Result(T data, String message, boolean isSuccess) {
        this.data = data;
        this.message = message;
        this.isSuccess = isSuccess;
    }

    /**
     * Gets the wrapped data.
     * 
     * @return data object
     */
    public T getData() {
        return data;
    }

    /**
     * Gets the status message.
     * 
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Checks if operation was successful.
     * 
     * @return true if successful, false if not
     */
    public boolean isSuccess() {
        return isSuccess;
    }

    /**
     * Displays the result data, message, and success status
     */
    public void display() {
        System.out.println("Data: " + data.toString());
        System.out.println("Message: " + message);
        System.out.println("Success: " + isSuccess);
    }

}