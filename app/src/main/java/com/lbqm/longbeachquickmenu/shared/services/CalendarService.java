package com.lbqm.longbeachquickmenu.shared.services;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import com.lbqm.longbeachquickmenu.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by jin on 25/02/2018.
 */

public class CalendarService {

    private Button dateview;

    private DatePickerDialog.OnDateSetListener mDateSetListener;

    private Context context;

    /* Date variable that will be used to display view */
    public static String Date =  new SimpleDateFormat("MMMM dd, yyyy").format(new Date());

    public CalendarService(Context context) {
        this.context = context;
    }

    /* TODO Make dateview with the Text working for MainActivity and other menu view  */

    public void setCalendar() {
        /* variable set with the id "dateViewButton" */
        dateview = ((Activity)context).findViewById(R.id.dateViewButton);

        dateview.setText(Date);

        Button dateView = ((Activity) context).findViewById(R.id.dateViewButton);
        Button calendarView = ((Activity) context).findViewById(R.id.CalendarViewButton);

        calendarView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                java.util.Calendar cal = java.util.Calendar.getInstance();
                int year = cal.get(java.util.Calendar.YEAR);
                int month = cal.get(java.util.Calendar.MONTH);
                int day = cal.get(java.util.Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        context,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mDateSetListener,
                        year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });

        dateView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                java.util.Calendar cal = java.util.Calendar.getInstance();
                int year = cal.get(java.util.Calendar.YEAR);
                int month = cal.get(java.util.Calendar.MONTH);
                int day = cal.get(java.util.Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        context,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mDateSetListener,
                        year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });

        mDateSetListener = new DatePickerDialog.OnDateSetListener() {
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
        };

    }
}