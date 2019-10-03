public class beads {

    public static void main(String[] args) {


        System.out.println(helper("wwwbbrwrbrbrrbrbrwrwwrbwrwrrb"));


    }

    public static int helper(String str){

        int count =0;

        for (int i =0 ;i< str.length() ;i++){


            char c = str.charAt(i);
            int countF = 0,j=i;

            while (j!=i-1){

                if (j==str.length()-1) j = j%str.length();

                if(str.charAt(j)==c || str.charAt(j)=='w') countF++;

                else break;

                j++;

            }



            if (i==0)
            c = str.charAt(str.length()-1);

            else c=str.charAt(i-1);
            int countB=0,k=i-1;

            while (k!=i){

                if (k==-1) k =str.length()-1;

                if(str.charAt(k)==c || str.charAt(k)=='w') countB++;

                else break;



                k--;

            }


            if (countB+countF>count)
                count = countB+countF;


        }


        return count;
    }
}
