package com.example.rajn.helpplusplus;

/**
 * Created by rajn on 2/1/2018.
 */

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Button;


public class log_a_ticket extends Activity {
    protected void onCreate(Bundle BundleSavedInstance){
        super.onCreate(BundleSavedInstance);
        setContentView(R.layout.log_a_ticket);

        Button logit = (Button) findViewById(R.id.logit);
        logit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "The ticket is logged", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}
