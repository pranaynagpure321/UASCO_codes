/*
        ID: pranayn2
        LANG: JAVA
        PROG: ride
        */
import java.io.*;

class ride {
    public static void main (String [] args) throws IOException {
        // Use BufferedReader rather than RandomAccessFile; it's much faster
        BufferedReader f = new BufferedReader(new FileReader("ride.in"));
        // input file name goes above
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
        // Use StringTokenizer vs. readLine/split -- lots faster
        //StringTokenizer st = new StringTokenizer(f.readLine());
        // Get line, break into tokens
        String comet = f.readLine();    // first integer
        String group = f.readLine();    // second integer

        String ans =  helper(comet,group);
        out.println(ans);                           // output result
        out.close();                                  // close the output file
    }


    public static String helper(String comet, String group){

        long comet_num= 1,grup_num=1;

        long mod = 47;

        comet_num = code(comet)%mod;
        grup_num =code(group)%mod;

        return comet_num==grup_num?"GO":"STAY";



    }

    public static long code(String str){

        long ans = 1;

        for (char c : str.toCharArray()){

            //int m = c-64;

            ans = ans * (c-64);
        }

        return ans;

    }
}