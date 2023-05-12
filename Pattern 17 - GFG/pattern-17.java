//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printTriangle(int n) {
        
        char ch = 'A';
        
        for(int i=1;i<=n;i++){ //how many rows we need to print.
            
            for(int j=0;j<n-i;j++){ // how many spaces in a row.
                  System.out.print(" ");
              }  
            
            int letters = (2*i)-1; // how many letters we need in a row
            int breakPoint = ((2*i)-1) /2;
              
            for(int j=0;j<letters;j++){
                  System.out.print(ch);
                  if(j < breakPoint){
                      ch++;
                  }
                  else{
                      ch--;
                  }
              }
              for(int j=0;j<n-i;j++){
                       System.out.print(" ");
              }
              System.out.println();
              ch = 'A';
        }
    }
}