//Luis Martinez Subsage
//https://www.hackerrank.com/challenges/time-conversion
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        String hour = time.substring(0,2);
        boolean isAm = time.charAt(8) == 'A';
        
        if(isAm) {
            if(hour.equals("12")) {
                System.out.print("00" + time.substring(2,8));
            }
            else {
                System.out.print(time.substring(0,8));
            }
        }
        else {
            if(hour.equals("12")) {
                System.out.print("12" + time.substring(2,8));
            }
            else {
                System.out.print((12+Integer.parseInt(hour)) + "" + time.substring(2,8));
            }
        }
    }
}
