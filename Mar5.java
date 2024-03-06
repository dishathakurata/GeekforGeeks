package gfg;

//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
  
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim()); // size of array
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]); // input elements of array
		    }
		    
		    Solution ob = new Solution();
		    
		    System.out.println(ob.maxIndexDiff(arr, n)); // print the result
		}
	}
}
//} Driver Code Ends


class Solution{
  
  // A[]: input array
  // N: size of array
  // Function to find the maximum index difference.
  static int maxIndexDiff(int a[], int n) { 
      
      // Your code here
      int[] maxArr = new int[n];
      maxArr[n - 1] = a[n - 1];
      for(int i = n - 2; i >= 0; i--) {
          maxArr[i] = Math.max(a[i], maxArr[i + 1]);
      }
      
      int i = 0;
      int j = 0;
      int ans = 0;
      
      while(i < n && j < n) {
          if(a[i] <= maxArr[j]) {
              ans = Math.max(ans , (j - i));
              j++;
          }
          
          else {
              i++;
          }
      }
      
      return ans;
      
  }
}


