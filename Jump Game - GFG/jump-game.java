// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S1[] = read.readLine().split(" ");
            
            int[] A = new int[N];
            
            for(int i=0; i<N; i++)
                A[i] = Integer.parseInt(S1[i]);

            Solution ob = new Solution();
            System.out.println(ob.canReach(A,N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int canReach(int[] A, int N) {
       
       //if the length is 1
      if(N==1) return 1;
      
      //initialising curStep and hop variable
      int curStep = A[0];
      int i = 0;
      
      //while step next step to be taken is not zero, and hop count is < N
      while(curStep!= 0 && i < N){
          curStep--; // decrement the step by 1 for index setting
          curStep = Math.max(A[i],curStep); // set the next step = Max(next element at hopped index, this step)
          i++; // increment hop by 1
      }
      if(i == N) return 1;
      
      return 0;
      
    }
};