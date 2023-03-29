//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            int N = Integer.parseInt(br.readLine().trim());
            int K = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            System.out.println(ob.countWaystoDivide(N, K));
        }

    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    

    // Function to count the number
    // of ways to divide the number N
    // in groups such that each group
    // has K number of elements
    public int calculate(int pos, int prev, int left, int K, int[][][] dp) {
        // Base Case
        if (pos == K) {
            if (left == 0)
                return 1;
            else
                return 0;
        }
        // if N is divides completely
        // into less than K groups
        if (left == 0) return 0;

        // If the subproblem has been
        // solved, use the value
        if (dp[pos][prev][left] != -1) return dp[pos][prev][left];

        int answer = 0;
        // put all possible values
        // greater equal to prev
        for (int i = prev; i <= left; i++) {
            answer += calculate(pos + 1, i, left - i, K, dp);
           
        }

        return dp[pos][prev][left] = answer;
    }

    // Function to count the number of
    // ways to divide the number N in groups
    int countWaystoDivide(int N, int K) {
        // Intialize DP Table as -1
        int dp[][][] = new int[K + 1][N + 1][N + 1];
        for (int i = 0; i <= K; i++) {
            for (int j = 0; j <= N; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }

        return calculate(0, 1, N, K, dp);
    }
};