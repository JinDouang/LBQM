package com.lbqm.longbeachquickmenu.shared.services;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import com.lbqm.longbeachquickmenu.MainActivity;
import com.lbqm.longbeachquickmenu.MapsActivity;
import com.lbqm.longbeachquickmenu.R;
import com.lbqm.longbeachquickmenu.shared.Singleton;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by jin on 25/02/2018.
 */

public class CalendarService {

    private Button dateview;

    private Context context;

    /* Date variable that will be used to display view */
    public static String Date =  new SimpleDateFormat("MMMM dd, yyyy").format(new Date());

    public CalendarService(Context context) {
        this.context = context;
    }

    /* TODO optimize date, when calendar is clicked, the selected (black hover) day must be the current value and not currentDate */

    public void setCalendarFromBottomNav() {
        dateview = ((Activity)context).findViewById(R.id.dateViewButton);
        dateview.setText(Date);

        java.util.Calendar cal = java.util.Calendar.getInstance();
        int year = cal.get(java.util.Calendar.YEAR);
        int month = cal.get(java.util.Calendar.MONTH);
        int day = cal.get(java.util.Calendar.DAY_OF_MONTH);

        DatePickerDialog dialog = new DatePickerDialog(context, android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                Calendar calendar = Calendar.getInstance();
                calendar.set(Calendar.YEAR, year);
                calendar.set(Calendar.MONTH, month);
                calendar.set(Calendar.DAY_OF_MONTH, day);


                Date = new SimpleDateFormat("MMMM dd, yyyy").format(calendar.getTime());

                // change variable into service variable?
                dateview.setText(Date);
            }
        }, year, month, day);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }

    public void setCalendar() {
        dateview = ((Activity)context).findViewById(R.id.dateViewButton);
        dateview.setText(Date);
        Singleton.day = convertDay(Calendar.getInstance().get(Calendar.DAY_OF_WEEK));
        System.out.println("Singleton day = " + Singleton.day);

        Button dateView = ((Activity) context).findViewById(R.id.dateViewButton);

        dateView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                java.util.Calendar cal = java.util.Calendar.getInstance();
                int year = cal.get(java.util.Calendar.YEAR);
                int month = cal.get(java.util.Calendar.MONTH);
                int day = cal.get(java.util.Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(context, android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                                Calendar calendar = Calendar.getInstance();
                                calendar.set(Calendar.YEAR, year);
                                calendar.set(Calendar.MONTH, month);
                                calendar.set(Calendar.DAY_OF_MONTH, day);

                                Date = new SimpleDateFormat("MMMM dd, yyyy").format(calendar.getTime());

                                // change variable into service variable?
                                dateview.setText(Date);
                            }
                        }, year, month, day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });
    }

    //Java.util.Calendar counts the days starting from Sunday, so Sunday is 1 and Saturday is 7. Our calendar starts with Monday on 0 and Sunday on 6, so this converts it to that format
    private int convertDay(int d){
        if (d == 1) return 6;
        if (d == 2) return 0;
        if (d == 3) return 1;
        if (d == 4) return 2;
        if (d == 5) return 3;
        if (d == 6) return 4;
        if (d == 7) return 5;
        else return -1;
    }

}