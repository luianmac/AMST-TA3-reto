package com.example.amst_ta3_reto;


import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.CalendarContract;

import java.util.Calendar;
import java.util.Date;

import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;


public class calendario_view extends AppCompatActivity {
    CalendarView calendarView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario_view);
        calendarView = (CalendarView) findViewById(R.id.calendarView);
        button = (Button) findViewById(R.id.button_event);
    }
    public void onclick2(View view){
        addEventToCalendar(this);
    }
    protected void addEventToCalendar(Activity activity){

        Calendar cal = Calendar.getInstance();
        Date today = cal.getTime();
        cal.set(Calendar.DAY_OF_MONTH, 21);
        cal.set(Calendar.MONTH, 06);
        cal.set(Calendar.YEAR, 2019);

        cal.set(Calendar.HOUR_OF_DAY, 1);
        cal.set(Calendar.MINUTE, 0);

        Intent intent = new Intent(Intent.ACTION_EDIT);
        intent.setType("vnd.android.cursor.item/event");

        intent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, cal.getTimeInMillis());
        intent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME, cal.getTimeInMillis()+60*60*1000);

        intent.putExtra(CalendarContract.Events.ALL_DAY, false);
        intent.putExtra(CalendarContract.Events.RRULE , "FREQ=DAILY");
        intent.putExtra(CalendarContract.Events.TITLE, "Título de vuestro evento");
        intent.putExtra(CalendarContract.Events.DESCRIPTION, "Descripción");
        intent.putExtra(CalendarContract.Events.EVENT_LOCATION,"Calle ....");

        activity.startActivity(intent);
    }
}
