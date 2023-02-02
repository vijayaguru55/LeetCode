package org.LeetCode;
/*
 * 2224. Minimum Number of Operations to Convert Time
 * You are given two strings current and correct representing two 24-hour times.
 * 24-hour times are formatted as "HH:MM", where HH is between 00 and 23, and MM is between 00 and 59.
 * The earliest 24-hour time is 00:00, and the latest is 23:59.
 * In one operation you can increase the time current by 1, 5, 15, or 60 minutes.
 * You can perform this operation any number of times.
 * Return the minimum number of operations needed to convert current to correct.
 */
public class ConvertTime {
    public int convertTime(String current, String correct) {
        if(current.equals(correct))return 0;
        
        int curHr =Integer.parseInt(current.substring(0,2));
        int curMm =Integer.parseInt(current.substring(3,current.length()));
        int curt = curHr*60+curMm;
        
        int corHr =Integer.parseInt(correct.substring(0,2));
        int corMm =Integer.parseInt(correct.substring(3,correct.length()));
        int cort = corHr*60+corMm;

        int need= Math.max(cort,curt)-Math.min(cort,curt);

        int ways=0;
        if(need>=60){
            ways+=need/60;
            need%=60;
        }
         if(need>=15){
             ways+=need/15;
             need%=15;
         }
         if(need>=5){
             ways+=need/5;
             need%=5;
         }   
         if(need>=1)
              ways+=need;
             
         return ways;
     }
    public static void main(String[] args) {
        String currentTime ="00:00";
        String corectTime ="23:59";
        ConvertTime convertTime = new ConvertTime();
        System.out.println(convertTime.convertTime(currentTime, corectTime));
    }
}
