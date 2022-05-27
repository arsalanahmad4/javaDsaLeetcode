package com.arsalan.recursion;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String args[]) throws ParseException {

        System.out.println(v("2022-05-27"));
    }

    static boolean valid(String date){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String data = df.format(new Date());
        System.out.println(data);
        String currentDate = data;
        String userDate = date;


        LocalDate localDate1 = LocalDate.parse(currentDate);

        LocalDate localDate2 = LocalDate.parse(userDate);
        if (localDate1.isAfter(localDate2)) {
            return false;
        }
        else if (localDate1.isBefore(localDate2)) {
            return true;
        }
        else {
            return true;
        }
    }

    static boolean v(String date){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String data = df.format(new Date());
        String currentDate = data;
        String userDate = date;
        String[] cDate = currentDate.split("-");
        int[] ciDate = new int[3];
        for(int i =0; i<cDate.length;i++){
            int intVal = Integer.parseInt(cDate[i]);
            ciDate[i]= intVal;
        }
        String[] uDate = userDate.split("-");
        int[] uiDate = new int[3];
        for(int i =0; i<uDate.length;i++){
            int intVal = Integer.parseInt(uDate[i]);
            uiDate[i]= intVal;
        }
        if(ciDate[0]>uiDate[0]){
            return false;
        }
        if(ciDate[0]<uiDate[0]){
            return true;
        }
        if(ciDate[0]==uiDate[0]){
            if(ciDate[1]>uiDate[1]){
                return false;
            }
            if(ciDate[1]<uiDate[1]){
                return true;
            }
            if(ciDate[1]==uiDate[1]){
                if(ciDate[2]>uiDate[2]){
                    return false;
                }
                else{
                    return true;
                }
            }
        }
        return false;
    }


}
