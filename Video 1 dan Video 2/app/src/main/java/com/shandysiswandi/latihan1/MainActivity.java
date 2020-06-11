package com.shandysiswandi.latihan1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // private
        final TextView text1 = (TextView) findViewById(R.id.text1);
        final EditText edit1 = (EditText) findViewById(R.id.edit1);
        Button btn   = (Button)findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edit = edit1.getText().toString();
                text1.setText(edit);
            }
        });


    }
}
