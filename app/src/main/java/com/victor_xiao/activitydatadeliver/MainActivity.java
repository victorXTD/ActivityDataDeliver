package com.victor_xiao.activitydatadeliver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.pass_the_info);

        final int num = (int) (1 + Math.random() * (10 - 1 + 1));
        TextView textView = (TextView) findViewById(R.id.ran_num);
        textView.setText("The random num is " + num + ".");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText = (EditText) findViewById(R.id.text_to_pass);
                String str = editText.getText().toString();
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("exdata", str);
                intent.putExtra("exnum", num);
                startActivity(intent);
            }
        });
    }
}
