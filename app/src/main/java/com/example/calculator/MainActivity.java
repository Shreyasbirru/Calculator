package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;



public class MainActivity extends AppCompatActivity {
static float v1,v2,res;
static String str;
    TextView text;
    Button clear,r1b1,r1b2,r1b3,r1b4,r2b1,r2b2,r2b3,r2b4,r3b1,r3b2,r3b3,r3b4,r4b1,r4b2,r4b3,r4b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text);
        clear = findViewById(R.id.clear);
        r1b1 = findViewById(R.id.r1b1);
        r1b2 = findViewById(R.id.r1b2);
        r1b3 = findViewById(R.id.r1b3);
        r1b4 = findViewById(R.id.r1b4);

        r2b1 = findViewById(R.id.r2b1);
        r2b2 = findViewById(R.id.r2b2);
        r2b3 = findViewById(R.id.r2b3);
        r2b4 = findViewById(R.id.r2b4);

        r3b1 = findViewById(R.id.r3b1);
        r3b2 = findViewById(R.id.r3b2);
        r3b3 = findViewById(R.id.r3b3);
        r3b4 = findViewById(R.id.r3b4);

        r4b1 = findViewById(R.id.r4b1);
        r4b2 = findViewById(R.id.r4b2);
        r4b3 = findViewById(R.id.r4b3);
        r4b4 = findViewById(R.id.r4b4);


        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("");



            }
        });

        r1b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"1");



            }
        });

        r1b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"2");


            }
        });

        r1b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"3");

            }
        });


        r1b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Float.parseFloat(text.getText().toString());
                text.setText("");
                str = "+";

            }
        });



        r2b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"4");


            }
        });

        r2b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"5");

            }
        });

        r2b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"6");



            }
        });


        r2b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Float.parseFloat(text.getText().toString());
                text.setText("");
                str = "-";

            }
        });

        r3b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"7");



            }
        });

        r3b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"8");
            }
        });
        r3b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"9");
            }
        });
        r3b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Float.parseFloat(text.getText().toString());
                text.setText("");
                str = "/";
            }
        });
        r4b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+".");
            }
        });
        r4b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText()+"0");
            }
        });
        r4b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Float.parseFloat(text.getText().toString());
                text.setText("");
                str = "*";

            }
        });
        r4b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (str == "+"){
                    v2 = Float.parseFloat(text.getText().toString());
                    res = v1+v2;
                    text.setText(""+res);
                } else if (str=="-") {
                    v2 = Float.parseFloat(text.getText().toString());
                    res = v1-v2;
                    text.setText(""+res);
                } else if (str=="*") {
                    v2 = Float.parseFloat(text.getText().toString());
                    res = v1*v2;
                    text.setText(""+res);
                }else if (str== "/"){
                    v2 = Float.parseFloat(text.getText().toString());
                    res = v1/v2;
                    text.setText(""+res);
                } else {
                    text.setText("Enter numbers");
                }
            }
        });
    }
}