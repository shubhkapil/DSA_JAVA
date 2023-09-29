import java.util.*;

public class Job_seq_prob {

    static class Job
    {
        int deadline;
        int profit;
        char id; 

        public Job(char i,int d,int p)
        {
            id=i;
            deadline = d;
            profit = p;
        }
    }
    public static void main(String[] args)
    {
        int jobsInfo[][] = {{4,60},{1,10},{1,40},{1,30}};
        // int jobsInfo[][] = {{2,100},{1,110},{2,27},{1,25},{3,15}};
        ArrayList<Job> jobs = new ArrayList<>();
        int n = jobsInfo.length;
        for(int i =0 ;i<n;i++)
        {
            char c = (char)(i+65);
            jobs.add(new Job(c,jobsInfo[i][0],jobsInfo[i][1]));
        }

        Collections.sort(jobs, (a,b)->b.profit-a.profit);

        int res[] = new int[n];
        boolean slot[] = new boolean[n];
        
        for(int i = 0;i<n;i++)
        {
            for(int j = Math.min(n,jobs.get(i).deadline)-1;j>=0;j--)
            {
                if(slot[j]==false)
                {
                    slot[j] = true;
                    res[j] = i;
                    break;
                }
            }
        }

        for(int i = 0;i<n;i++)
        {
            if(slot[i])
            {
                System.out.print(jobs.get(res[i]).id+" ");
            }
        }
        

    }
    
}
