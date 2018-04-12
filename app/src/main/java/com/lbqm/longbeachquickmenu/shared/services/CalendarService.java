package com.lbqm.longbeachquickmenu.shared.services;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.design.internal.BottomNavigationItemView;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.DatePicker;

import com.lbqm.longbeachquickmenu.R;
import com.lbqm.longbeachquickmenu.shared.Singleton;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by jin on 25/02/2018.
 */

public class CalendarService {

    private Button dateview;

    private Context context;

    private static Boolean initialized = false;

    private final Calendar calendar = Calendar.getInstance();

    /* Date variable that will be used to display view */
    private static Date Date =  new Date();


    public CalendarService(Context context) {
        this.context = context;
        if (!initialized) initializeDay();
        initialized = true;
    }

    private void initializeDay(){
        Singleton.day = convertDay(Calendar.getInstance().get(Calendar.DAY_OF_WEEK));
        Singleton.weekOfYear = Calendar.getInstance().get(Calendar.WEEK_OF_YEAR);
        System.out.println("Initialize CalendarService Singleton day = " + Singleton.day);
    }

    public void setCalendar() {
        dateview = ((Activity)context).findViewById(R.id.dateViewButton);

        // Used simpleDate format to change date format and to convert date into string to setText
        dateview.setText(new SimpleDateFormat("MMMM dd, yyyy", Locale.getDefault()).format(Date));

        Button dateView = ((Activity) context).findViewById(R.id.dateViewButton);
        BottomNavigationItemView navigationDateView = ((Activity) context).findViewById(R.id.navigation_calendar);

        dateView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calendar.setTime(Date);
                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH);
                int day = calendar.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(context, android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker datePicker, int year, int month, int day) {

                                calendar.set(Calendar.YEAR, year);
                                calendar.set(Calendar.MONTH, month);
                                calendar.set(Calendar.DAY_OF_MONTH, day);

                                Date = calendar.getTime();
                                Singleton.day = convertDay(calendar.get(Calendar.DAY_OF_WEEK));
                                Singleton.weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);

                                // Used simpleDate format to change date format and to convert date into string to setText
                                dateview.setText(new SimpleDateFormat("MMMM dd, yyyy", Locale.getDefault()).format(Date));
                            }
                        }, year, month, day);
                Window window = dialog.getWindow();
                if (window != null) {
                    dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                }
                dialog.show();
            }
        });

        navigationDateView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calendar.setTime(Date);
                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH);
                int day = calendar.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(context, android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker datePicker, int year, int month, int day) {

                                calendar.set(Calendar.YEAR, year);
                                calendar.set(Calendar.MONTH, month);
                                calendar.set(Calendar.DAY_OF_MONTH, day);

                                Date = calendar.getTime();

                                Singleton.day = convertDay(calendar.get(Calendar.DAY_OF_WEEK));
                                System.out.println("setCalendar from NavView Singleton day = " + Singleton.day);
                                Singleton.weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);

                                // Used simpleDate format to change date format and to convert date into string to setText
                                dateview.setText(new SimpleDateFormat("MMMM dd, yyyy", Locale.getDefault()).format(Date));
                            }
                        }, year, month, day);
                Window window = dialog.getWindow();
                if (window != null) {
                    dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                }
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