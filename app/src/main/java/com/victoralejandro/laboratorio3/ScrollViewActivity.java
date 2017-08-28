package com.victoralejandro.laboratorio3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ScrollViewActivity extends AppCompatActivity {
    Button btn1, btn2, btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20,btn21,btn22,btn23,btn24,btn25;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view);

        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn3 = (Button) findViewById(R.id.btn3);
        Button btn4 = (Button) findViewById(R.id.btn4);
        Button btn5 = (Button) findViewById(R.id.btn5);
        Button btn6 = (Button) findViewById(R.id.btn6);
        Button btn7 = (Button) findViewById(R.id.btn7);
        Button btn8 = (Button) findViewById(R.id.btn8);
        Button btn9 = (Button) findViewById(R.id.btn9);
        Button btn10 = (Button) findViewById(R.id.btn10);
        Button btn11 = (Button) findViewById(R.id.btn11);
        Button btn12 = (Button) findViewById(R.id.btn12);
        Button btn13 = (Button) findViewById(R.id.btn13);
        Button btn14 = (Button) findViewById(R.id.btn14);
        Button btn15 = (Button) findViewById(R.id.btn15);
        Button btn16 = (Button) findViewById(R.id.btn16);
        Button btn17 = (Button) findViewById(R.id.btn17);
        Button btn18 = (Button) findViewById(R.id.btn18);
        Button btn19 = (Button) findViewById(R.id.btn19);
        Button btn20 = (Button) findViewById(R.id.btn20);
        Button btn21 = (Button) findViewById(R.id.btn21);
        Button btn22 = (Button) findViewById(R.id.btn22);
        Button btn23 = (Button) findViewById(R.id.btn23);
        Button btn24 = (Button) findViewById(R.id.btn24);
        Button btn25 = (Button) findViewById(R.id.btn25);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scrollviewhorizontal();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AndroidButtonActivity();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ScrollViewActivity.this, ImageButtonActivity.class);
                startActivity(intent1);

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ScrollViewActivity.this, EditTextActivity.class);
                startActivity(intent1);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ScrollViewActivity.this, CheckBoxActivity.class);
                startActivity(intent1);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ScrollViewActivity.this, RadioButtontActivity.class);
                startActivity(intent1);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ScrollViewActivity.this, SwitchButtonActivity.class);
                startActivity(intent1);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ScrollViewActivity.this, ToggleButtonActivity.class);
                startActivity(intent1);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ScrollViewActivity.this, RatingBarActivity.class);
                startActivity(intent1);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ScrollViewActivity.this, SpinnerActivity.class);
                startActivity(intent1);
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ScrollViewActivity.this, ProgressBarActivity.class);
                startActivity(intent1);
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ScrollViewActivity.this, DatePickerActivity.class);
                startActivity(intent1);
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ScrollViewActivity.this, TimePickerActivity.class);
                startActivity(intent1);
            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ScrollViewActivity.this, FloatingActionButtonActivity.class);
                startActivity(intent1);
            }
        });
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ScrollViewActivity.this, FloatingLabelsActivity.class);
                startActivity(intent1);
            }
        });
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ScrollViewActivity.this, SeekBarActivity.class);
                startActivity(intent1);
            }
        });
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ScrollViewActivity.this, SimpleDialogActivity.class);
                startActivity(intent1);
            }
        });
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ScrollViewActivity.this, CustomAlertDialogActivity.class);
                startActivity(intent1);
            }
        });
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ScrollViewActivity.this, SnackbarActivity.class);
                startActivity(intent1);
            }
        });
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ScrollViewActivity.this, NotificationActivity.class);
                startActivity(intent1);
            }
        });
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ScrollViewActivity.this, ImageViewActivity.class);
                startActivity(intent1);
            }
        });
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ScrollViewActivity.this, VideoViewActivity.class);
                startActivity(intent1);
            }
        });
        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ScrollViewActivity.this, WebViewActivity.class);
                startActivity(intent1);
            }
        });
        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ScrollViewActivity.this, SearchViewActivity.class);
                startActivity(intent1);
            }
        });
        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ScrollViewActivity.this, CalendarViewActivity.class);
                startActivity(intent1);
            }
        });
    }

    public void scrollviewhorizontal(){
        Intent intent1 = new Intent(this, ScrollViewHorizontalActivity.class);
        startActivity(intent1);
    }
    public void AndroidButtonActivity(){
        Intent intent2 = new Intent(this, AndroidButtonActivity.class);
        startActivity(intent2);
    }

}
