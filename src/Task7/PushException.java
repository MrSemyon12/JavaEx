package Task7;

public class PushException extends Exception{

    private String message;
    private int size;

    public PushException(String message, int size){
        this.message = message;
        this.size = size;
    }

    public void GetMessage(){
        System.err.println(message + size);
    }
}
