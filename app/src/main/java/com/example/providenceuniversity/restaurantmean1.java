package com.example.providenceuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class restaurantmean1 extends AppCompatActivity {


    Button buttonxxx,button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15,button16,button17,button18,button19,button20,button21,button22,button23,button24,button25,button26;
    TextView text1;
    int x = 0;
    int sum = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantmean1);
        text1 = findViewById(R.id.textView4);
        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);
        button3 = findViewById(R.id.btn3);
        button4 = findViewById(R.id.btn4);
        button5 = findViewById(R.id.btn5);
        button6 = findViewById(R.id.btn6);
        button7 = findViewById(R.id.btn7);
        button8 = findViewById(R.id.btn8);
        button9 = findViewById(R.id.btn9);
        button10 = findViewById(R.id.btn10);
        button11 = findViewById(R.id.btn11);
        button12 = findViewById(R.id.btn12);
        button13 = findViewById(R.id.btn13);
        button14 = findViewById(R.id.btn14);
        button15 = findViewById(R.id.btn15);
        button16 = findViewById(R.id.btn16);
        button17 = findViewById(R.id.btn17);
        button18 = findViewById(R.id.btn18);
        button19 = findViewById(R.id.btn19);
        button20 = findViewById(R.id.btn20);
        button21 = findViewById(R.id.btn21);
        button22 = findViewById(R.id.btn22);
        button23 = findViewById(R.id.btn23);
        button24 = findViewById(R.id.btn24);
        button25 = findViewById(R.id.btn25);
        button26 = findViewById(R.id.btn26);
        buttonxxx= findViewById(R.id.btnxxx);


        View.OnClickListener myonclicklistener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(x == 0) {
                    switch (view.getId()){
                        case R.id.btn1:
                            sum = sum + 65;

                            Toast.makeText(restaurantmean1.this, "熱量為65", Toast.LENGTH_SHORT).show();
                            break;
                        case R.id.btn2:
                            sum = sum +60;
                            break;
                        case R.id.btn3:
                            sum = sum +60;
                            break;
                        case R.id.btn4:
                            sum = sum +70;
                            break;
                        case R.id.btn5:
                            sum = sum +70;
                            break;
                        case R.id.btn6:
                            sum = sum +70;
                            break;
                        case R.id.btn7:
                            sum = sum +70;
                            break;
                        case R.id.btn8:
                            sum = sum +70;
                            break;
                        case R.id.btn9:
                            sum = sum +70;
                            break;
                        case R.id.btn10:
                            sum = sum +60;
                            break;
                        case R.id.btn11:
                            sum = sum +70;
                            break;
                        case R.id.btn12:
                            sum = sum +60;
                            break;
                        case R.id.btn13:
                            sum = sum +60;
                            break;
                        case R.id.btn14:
                            sum = sum +60;
                            break;
                        case R.id.btn15:
                            sum = sum +60;
                            break;
                        case R.id.btn16:
                            sum = sum +60;
                            break;
                        case R.id.btn17:
                            sum = sum +60;
                            break;
                        case R.id.btn18:
                            sum = sum +60;
                            break;
                        case R.id.btn19:
                            sum = sum +60;
                            break;
                        case R.id.btn20:
                            sum = sum +60;
                            break;
                        case R.id.btn21:
                            sum = sum +550;
                            break;
                        case R.id.btn22:
                            sum = sum +60;
                            break;
                        case R.id.btn23:
                            sum = sum +60;
                            break;
                        case R.id.btn24:
                            sum = sum +60;
                            break;
                        case R.id.btn25:
                            sum = sum +60;
                            break;
                        case R.id.btn26:
                            sum = sum +60;
                            break;
                        case R.id.btnxxx:
                            sum = 0;
                            break;

                    }
                    text1.setText("熱量總共是" + sum);
                }
            }
        };
        button1.setOnClickListener(myonclicklistener);
        button2.setOnClickListener(myonclicklistener);
        button3.setOnClickListener(myonclicklistener);
        button4.setOnClickListener(myonclicklistener);
        button5.setOnClickListener(myonclicklistener);
        button6.setOnClickListener(myonclicklistener);
        button7.setOnClickListener(myonclicklistener);
        button8.setOnClickListener(myonclicklistener);
        button9.setOnClickListener(myonclicklistener);
        button10.setOnClickListener(myonclicklistener);
        button11.setOnClickListener(myonclicklistener);
        button12.setOnClickListener(myonclicklistener);
        button13.setOnClickListener(myonclicklistener);
        button14.setOnClickListener(myonclicklistener);
        button15.setOnClickListener(myonclicklistener);
        button16.setOnClickListener(myonclicklistener);
        button17.setOnClickListener(myonclicklistener);
        button18.setOnClickListener(myonclicklistener);
        button19.setOnClickListener(myonclicklistener);
        button20.setOnClickListener(myonclicklistener);
        button21.setOnClickListener(myonclicklistener);
        button22.setOnClickListener(myonclicklistener);
        button23.setOnClickListener(myonclicklistener);
        button24.setOnClickListener(myonclicklistener);
        button25.setOnClickListener(myonclicklistener);
        button26.setOnClickListener(myonclicklistener);
        buttonxxx.setOnClickListener(myonclicklistener);
    }
}