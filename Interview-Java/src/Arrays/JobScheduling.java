package Arrays;
import java.util.*;


public class JobScheduling {
	
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        int[][] jobs = new int[n][3];
        for (int i = 0; i < n; i++) {
            jobs[i] = new int[] {startTime[i], endTime[i], profit[i]};
        }
        Arrays.sort(jobs, (a, b) -> a[1] - b[1]);
        
        TreeMap<Integer, Integer> dp = new TreeMap<>(); // [endtime, profit]
        dp.put(0, 0);
        
        for (int[] job : jobs) {
            int newProfit = job[2] + dp.floorEntry(job[0]).getValue();
            if (newProfit > dp.lastEntry().getValue()) {
                dp.put(job[1], newProfit);
            }
        }
        return dp.lastEntry().getValue();
    }

	public static void main(String[] args) {
		JobScheduling obj = new JobScheduling();
		int[] startTime = {1, 2, 3, 3};
		int[] endTime = {3, 4, 5, 6};
		int[] profit = {50, 10, 40, 70};
		int ans = obj.jobScheduling(startTime, endTime, profit);
		System.out.println(ans);
	}

}
