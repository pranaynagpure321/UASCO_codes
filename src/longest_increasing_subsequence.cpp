// Input:
// N = 16
// A[]={0,8,4,12,2,10,6,14,1,9,5
//      13,3,11,7,15}
// Output: 6
// Explanation:Longest increasing subsequence
// 0 2 6 9 13 15, which has length 6


class Solution
{
    public:
    //Function to find length of longest increasing subsequence.
    int longestSubsequence(int n, int a[])
    {
       // your code here
       int len[n] = {0};
       len[0]=1;
       for(int i=1; i<n ;i++)
       {
           for(int j=0;j<i;j++)
           {
               if(a[i]>a[j] && len[j]>len[i])
               len[i] =len[j];
           }
           
           len[i]++;
       }
       
         int max =0;
      for(int i=1; i<n ;i++)
      {
        if(max<len[i])
          max=len[i];
      }
    
    
    return max;
    }
    
  
};

// { Driver Code Starts.
int main()
{
    //taking total testcases
    int t,n;
    cin>>t;
    while(t--)
    {
        //taking size of array
        cin>>n;
        int a[n];
        
        //inserting elements to the array
        for(int i=0;i<n;i++)
            cin>>a[i];
        Solution ob;
        //calling method longestSubsequence()
        cout << ob.longestSubsequence(n, a) << endl;
