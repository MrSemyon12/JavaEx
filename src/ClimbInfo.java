public class ClimbInfo {

    private String peakName;
    private int climbTime;

    public ClimbInfo(String peakName, int climbTime){
        this.peakName = peakName;
        this.climbTime = climbTime;
    }

    public String getName(){
        return this.peakName;
    }

    public int getTime(){
        return this.climbTime;
    }

}
