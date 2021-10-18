package Task7;

public class DataStorage {

    private double[] storage;
    private int size;
    private int fullness;

    public DataStorage(int size) {
        storage = new double[size];
        this.size = size;
        this.fullness = 0;
    }

    public void push(double value) throws PushException {
        if (fullness == size){
            throw new PushException("Storage is full: ", this.size);
        }
        else{
            for (int i = fullness - 1; i >= 0; i--){
                storage[i + 1] = storage[i];
            }
            storage[0] = value;
            fullness++;
        }

    }

    public double pop() throws PopException {
        if (fullness == 0){
            throw new PopException("Storage is empty");
        }
        else{
            double popElem = storage[0];
            for (int i = 0; i < fullness - 1; i++){
                storage[i] = storage[i + 1];
            }
            fullness--;
            return popElem;
        }
    }

    public boolean find(double value) throws PopException {
        if (fullness == 0){
            throw new PopException("Storage is empty");
        }
        else{
            boolean result = false;
            for (int i = 0; i < fullness - 1; i++){
                if (storage[i] == value){
                    result = true;
                    break;
                }
            }

            return result;
        }
    }
}
