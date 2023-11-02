package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bp,bm,bmul,bd,be,bpo,bcan,bb;
    String a;
    TextView cal,res;
    double a1=0.0;
    int c=0,flag=0,flag2=0;

    public void btnclk(String n) {


            String s = cal.getText().toString();
            cal.setText(s+n);



    }
    public void bsp(){
        String s=cal.getText().toString();
        s=s.substring(0,s.length()-1);
        cal.setText(s);
    }


    public void clc(String n){

        String s=cal.getText().toString();

        String j = s.substring(c,s.length());
        if(res.getText().toString() != "") {
            s=res.getText().toString();
            res.setText("");
            j="0";
        }

        double k = Double.parseDouble(j);
        switch (flag){
            case 0:
                a1=a1+k;
                break;
            case 2:
                a1=a1+k;
                break;
            case 4:
                a1=a1-k;
                break;
            case 6:
                a1=a1*k;
                break;
            case 8:
                a1=a1/k;
                break;

        }
        c=s.length()+1;
        cal.setText(s+n);
        switch (n){
            case "+":
                flag=2;
                break;
            case"-":
                flag=4;
                break;
            case "x":
                flag=6;
                break;
            case "/":
                flag=8;
                break;
            default:
                flag=0;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.one);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnclk("1");
            }
        });
        b2=findViewById(R.id.two);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnclk("2");
            }
        });
        b3=findViewById(R.id.three);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnclk("3");
            }
        });
        b4=findViewById(R.id.four);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnclk("4");
            }
        });
        b5=findViewById(R.id.five);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnclk("5");
            }
        });
        b6=findViewById(R.id.six);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnclk("6");
            }
        });
        b7=findViewById(R.id.seven);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnclk("7");
            }
        });
        b8=findViewById(R.id.eight);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnclk("8");
            }
        });
        b9=findViewById(R.id.nine);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnclk("9");
            }
        });
        b0=findViewById(R.id.zero);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnclk("0");
            }
        });
        bcan=findViewById(R.id.c);
        bcan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cal.setText("");
                res.setText("");
                c=0;
                a1=0;
                flag=0;
            }
        });

        bb=findViewById(R.id.bs);
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bsp();
                c--;
            }
        });
        bpo=findViewById(R.id.point);
        bpo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnclk(".");
            }
        });
        be=findViewById(R.id.eq);
        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flag2++;
                String s = cal.getText().toString();
                s=s.substring(c,s.length());
                switch(flag){
                    case 2:
                        a1=a1+Double.parseDouble(s);
                        break;
                    case 4:
                        a1=a1-Double.parseDouble(s);
                        break;
                    case 6:
                        a1 = a1 * Double.parseDouble(s);
                        break;
                    case 8:
                        a1=a1/Double.parseDouble(s);
                        break;
                }
                res.setText(String.valueOf(a1));
                c=s.length();
                flag=0;
            }
        });
        bp=findViewById(R.id.plus);
        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clc("+");
            }
        });
        bm=findViewById(R.id.minus);
        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clc("-");
            }
        });
        bmul=findViewById(R.id.mul);
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clc("x");
            }
        });
        bd=findViewById(R.id.div);
        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clc("/");
            }
        });
        cal=findViewById(R.id.cal);
        res=findViewById(R.id.res);

        a=cal.getText().toString();

    }
}