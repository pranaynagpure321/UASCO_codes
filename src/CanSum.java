public class CanSum {

    public static boolean canSum(int targetSum, int[] numbers, boolean [] memo)
    {
        if ( targetSum > 0 && memo[targetSum]) return true;
        if (targetSum == 0 ) return true;
        if (targetSum < 0 ) return false;
        
        for (var num :numbers)
        {
            int remainder = targetSum - num;

            if (canSum(remainder, numbers,memo)== true) {
             memo[targetSum] =true;
                return true;
            }
        }

        memo[targetSum] = false;
        return  false;
    }


    public static void main(String[] args) {

        int[] arr = {7,14};
        int n =300;
        boolean[] memo = new boolean[n+1];
        System.out.println(canSum(n,arr,memo));

    }
}
