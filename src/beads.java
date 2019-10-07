/*
        ID: pranayn2
        LANG: JAVA
        PROG: beads
        */



import java.io.*;

public class beads {

    public static void main(String[] args) throws Exception{

        BufferedReader f = new BufferedReader(new FileReader("beads.in"));

        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("beads.out")));

        f.readLine();
        String str = f.readLine();

        int ans =  helper(str);
        out.println(ans);                           // output result
        out.close();
        //System.out.println(helper("rrr"));


    }


    public static int helper(String str){

        int count =0;

        for (int i =0 ;i< str.length() ;i++){


            char c =str.charAt(i);
            int countF = 0,k=i;
            boolean colorFound =false;

            if (c!='w') colorFound =true;

            while (k!=i-1){
                if (k==str.length()) k=k%str.length();

                if (c=='w' && str.charAt(k)=='w') countF++;

                else if (c=='w' && str.charAt(k)!='w' && !colorFound){
                    colorFound=true; c=str.charAt(k); countF++;
                }

                else if (c==str.charAt(k) || str.charAt(k)=='w') countF++;

                else break;

                if (i==0 && k==str.length()-1) break;

                k++;

            }


            if (countF == str.length()) return countF;

            int j =i-1;
            if (i==0) j=str.length()-1;

            c= str.charAt(j);
            int countB = 0;

            if (c!='w') colorFound =true;

            while (j!=i && j!=k-1){

                if (j==-1) j=str.length()-1;

                if (c=='w' && str.charAt(j)=='w') countB++;

                else if (c=='w' && str.charAt(j)!='w' && !colorFound){
                    colorFound=true; c=str.charAt(j); countB++;
                }
                else if (c==str.charAt(j) || str.charAt(j)=='w') countB++;

                else break;

                if (i==str.length()-1 && j==0) break;

                j--;

            }


            if (count<countB+countF) count = countB+countF;


        }


        return count;
    }
}
