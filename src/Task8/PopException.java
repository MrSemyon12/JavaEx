package Task8;

public class PopException extends Exception{

    private String message;

    public PopException(String message){
        this.message = message;
    }

    public void GetMessage(){
        System.err.println(message);
    }
}
