import java.util.ArrayList;

public class ClimbingClub {

    private ArrayList<ClimbInfo> climbList;

    public ClimbingClub(){
        climbList = new ArrayList<ClimbInfo>();
    }

    public void addClimb(String peakName, int climbTime){
        climbList.add(new ClimbInfo(peakName, climbTime));
    }
}
