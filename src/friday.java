
/*
        ID: pranayn2
        LANG: JAVA
        PROG: friday
        */

import java.io.*;


public class friday {


   static int[] is31th = {1,0,1,0,1,0,1,1,0,1,0,1};


    public static void main(String[] args) throws Exception{

        BufferedReader f = new BufferedReader(new FileReader("friday.in"));

        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));

        int N = Integer.parseInt(f.readLine());

        int[] ans =helper(N);

        out.println(ans[6] + " "+ans[7] + " "+ans[1] + " "+ans[2] + " "+ans[3] + " "+ans[4] + " "+ans[5]);

        out.close();
    }

    public static int get13thofMonth(int FirstDay){

        int day = (FirstDay+5)%7;

        return day==0?7:day;
    }

    public static boolean isLeap(int year){


        if (year%100==0)
        {
            if (year%400 == 0)
                return true;
            else return false;
        }
        else if (year%4==0)
            return true;

        else return false;

    }

    public static int getFistDayOfnextmonth(int FirstDay,int year, int month){

        boolean isleap = isLeap(year);

        int nextMonthFirstDay = 0;


        if (isleap && month == 2)
              nextMonthFirstDay=FirstDay + 1;

        else if (month==2)
            nextMonthFirstDay= FirstDay;

        else if(is31th[month-1]==1)
            nextMonthFirstDay = FirstDay+3;

        else  nextMonthFirstDay = FirstDay+2;


        nextMonthFirstDay = nextMonthFirstDay%7;

        return  nextMonthFirstDay==0?7:nextMonthFirstDay;


    }

    public static int[] helper(int N){

        int[] ans = new int[8];

        int FirstDay = 1;

        int year = 1900;

        while (N>0){



            for (int i =1 ;i<=12 ;i++){

                int day13thOfMonth =get13thofMonth(FirstDay);
                FirstDay = getFistDayOfnextmonth(FirstDay,year,i);

                ans[day13thOfMonth]++;

            }

            N--;
            year++;




        }

        return ans;

    }





}
