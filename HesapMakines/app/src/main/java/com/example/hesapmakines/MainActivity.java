package com.example.hesapmakines;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView value;
    String d1="";
    String d2;
    String sembol=null;
    float x,y,z;
    int w;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sifir=(Button) findViewById(R.id.b0);
        Button bir = (Button) findViewById(R.id.b1);
        Button iki = (Button) findViewById(R.id.b2);
        Button üc = (Button) findViewById(R.id.b3);
        Button dört = (Button) findViewById(R.id.b4);
        Button bes = (Button) findViewById(R.id.b5);
        Button alti = (Button) findViewById(R.id.b6);
        Button yedi = (Button) findViewById(R.id.b7);
        Button sekiz = (Button) findViewById(R.id.b8);
        Button dokuz = (Button) findViewById(R.id.b9);

        Button clear = (Button) findViewById(R.id.clear);
        Button plus = (Button) findViewById(R.id.plus);
        Button minus = (Button) findViewById(R.id.minus);
        Button multi = (Button) findViewById(R.id.multi);
        Button divide = (Button) findViewById(R.id.divide);
        Button dot = (Button) findViewById(R.id.dot);
        Button equal = (Button) findViewById(R.id.equal);

        value=(TextView) findViewById(R.id.value);

        sifir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hesapla("0");
            }
        });
        bir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hesapla("1");
            }
        });
        iki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hesapla("2");
            }
        });
        üc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hesapla("3");
            }
        });
        dört.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hesapla("4");
            }
        });
        bes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hesapla("5");
            }
        });
        alti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hesapla("6");
            }
        });
        yedi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hesapla("7");
            }
        });
        sekiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hesapla("8");
            }
        });
        dokuz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hesapla("9");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sembol==null){
                    sembol="+";
                    x=Float.parseFloat(d1);
                    d1=d1+sembol;
                    d2=d1;
                    d1="";
                }


            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sembol==null){
                    sembol="-";
                    x=Float.parseFloat(d1);
                    d1=d1+sembol;
                    d2=d1;
                    d1="";
                }

            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(sembol==null){
                    sembol="x";
                    x=Float.parseFloat(d1);
                    d1=d1+sembol;
                    d2=d1;
                    d1="";
                }
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sembol==null){
                    sembol="/";
                    x=Float.parseFloat(d1);
                    d1=d1+sembol;
                    d2=d1;
                    d1="";
                }
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hesapla(".");

            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Result();

            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value.setText("0");
                d1="";
                sembol=null;

            }
        });

    }
    public void Result(){
        y=Float.parseFloat(d1);
        z=x+y;
        if (sembol=="+")
        {
            z=x+y;
        }
        if (sembol=="-")
        {
            z=x-y;
        }
        if (sembol=="x")
        {
            z=x*y;
        }
        if (sembol=="/")
        {
            z=x/y;
        }
        if(z-Math.floor(z)==0)
        {
            w=Math.round(z);
            value.setText(""+w);

        }else
            value.setText(""+z);


    }
    public void Hesapla(String deger){
        switch(deger){
                case "0":
                    if (d1=="")
                        return;
                d1=d1+deger;
                break;
                case "1":
                    d1=d1+deger;
                break;
                case "2":
                    d1=d1+deger;
                break;
                case "3":
                    d1=d1+deger;
                break;
                case "4":
                    d1=d1+deger;
                break;
                case "5":
                    d1=d1+deger;
                break;
                case "6":
                    d1=d1+deger;
                break;
                case "7":
                    d1=d1+deger;
                break;
                case "8":
                    d1=d1+deger;
                break;
                case "9":
                    d1=d1+deger;
                break;
                 case".":
                    d1=d1+deger;
                break;
        }
        value.setText(""+d1);

    }
}