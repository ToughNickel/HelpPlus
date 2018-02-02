package com.example.rajn.helpplusplus;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

/**
 * Created by rajn on 2/1/2018.
 */

public class reserve extends Activity {
    @Override
    protected void onCreate(Bundle BundleInstance){
        super.onCreate(BundleInstance);
        setContentView(R.layout.reserve);

        TimePicker appointment = (TimePicker) findViewById(R.id.appointment);

        final TextView record = (TextView) findViewById(R.id.record);

        final int hour = appointment.getCurrentHour();
        final int minute = appointment.getCurrentMinute();

        appointment.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                // display a toast with changed values of time picker
                //Snackbar.make(view, "The appointment is booked for -> " + hourOfDay + " : " + minute, Snackbar.LENGTH_LONG)
                 //       .setAction("Action", null).show();
                record.setText(hourOfDay+":"+minute);
            }
        });



        Button book = (Button) findViewById(R.id.book);
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "The appointment is booked for -> " +record.getText(), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}
