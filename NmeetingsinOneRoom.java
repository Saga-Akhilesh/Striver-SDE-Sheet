//Greedy problem
import java.util.*;
class meeting{
    int starttime;
    int endtime;
    int position;
    meeting(int starttime,int endtime,int position){
        this.starttime = starttime;
        this.endtime=endtime;
        this.position=position;
    }
}
class meetingComparator implements Comparator<meeting>{
    public int compare (meeting obj1,meeting obj2){
        if(obj1.endtime<obj2.endtime)
            return -1;
        else if(obj1.endtime>obj2.endtime)
            return 1;
        else if (obj1.position<obj2.position)
            return -1;
        return 1;
    }
}
public class NmeetingsinOneRoom
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        ArrayList<meeting>meet=new ArrayList<>();
        for(int i=0;i<start.length;i++)
            meet.add(new meeting(start[i],end[i],i+1));
        meetingComparator mc =new meetingComparator();
        Collections.sort(meet,mc);
        ArrayList<Integer>Answer=new ArrayList<>();
        Answer.add(meet.get(0).position);
        int endlimit=meet.get(0).endtime;
            
            for(int i=1;i<start.length;i++){
                if(meet.get(i).starttime>endlimit){
                    endlimit=meet.get(i).endtime;
                    Answer.add(meet.get(i).position);
                }
            }
            
            return Answer.size();
    }
}
