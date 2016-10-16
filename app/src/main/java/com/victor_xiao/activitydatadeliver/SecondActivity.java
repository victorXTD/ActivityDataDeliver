package com.victor_xiao.activitydatadeliver;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Victor_Xiao on 16/08/31.
 */
public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);

        Intent intent = getIntent();
        String str = intent.getStringExtra("exdata");
        int num = intent.getIntExtra("exnum", -1);

        TextView textView = (TextView) findViewById(R.id.text_passed);
        textView.setText("The text you jest input is \"" + str + " \".\n" +
                "and the random number is " + num + ".");
    }
}
