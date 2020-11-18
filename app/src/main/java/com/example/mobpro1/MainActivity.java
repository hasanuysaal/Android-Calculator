package com.example.mobpro1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Double sonuc;
    String islem;
    String giris = "";
    Double deger1,deger2;
    TextView text;
    TextView editText;
    Button sifir,bir,iki,uc,dort,bes,alti,yedi,sekiz,dokuz,toplama,cikarma,carpma,bolme,nokta, esittir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        text = findViewById(R.id.text);
        editText = (TextView)findViewById(R.id.edittext);
        sifir = findViewById(R.id.sifir);
        bir= findViewById(R.id.bir);
        iki = findViewById(R.id.iki);
        uc = findViewById(R.id.uc);
        dort = findViewById(R.id.dort);
        bes = findViewById(R.id.bes);
        alti = findViewById(R.id.alti);
        yedi = findViewById(R.id.yedi);
        sekiz = findViewById(R.id.sekiz);
        dokuz = findViewById(R.id.dokuz);
        toplama = findViewById(R.id.toplama);
        cikarma = findViewById(R.id.cikarma);
        carpma = findViewById(R.id.carpma);
        bolme = findViewById(R.id.bolme);
        nokta = findViewById(R.id.nokta);
        esittir = findViewById(R.id.sonuc);

        sifir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(giris + "0");
                giris = editText.getText().toString();

            }
        });
        bir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(giris + "1");
                giris = editText.getText().toString();

            }
        });
        iki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(giris + "2");
                giris = editText.getText().toString();

            }
        });
        uc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(giris + "3");
                giris = editText.getText().toString();

            }
        });
        dort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(giris + "4");
                giris = editText.getText().toString();

            }
        });
        bes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(giris + "5");
                giris = editText.getText().toString();

            }
        });
        alti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(giris + "6");
                giris = editText.getText().toString();

            }
        });
        yedi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(giris + "7");
                giris = editText.getText().toString();

            }
        });
        sekiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(giris + "8");
                giris = editText.getText().toString();

            }
        });
        dokuz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(giris + "9");
                giris = editText.getText().toString();

            }
        });
        nokta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(giris + ".");
                giris = editText.getText().toString();

            }
        });
        toplama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                giris = editText.getText().toString();
                deger1 = Double.parseDouble(editText.getText().toString());
                islem = "+";
                editText.setText("");
                text.setText(giris);
                giris="";

            }
        });
        carpma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                giris = editText.getText().toString();
                deger1 = Double.parseDouble(editText.getText().toString());
                islem = "x";
                editText.setText("");
                text.setText(giris);
                giris="";



            }
        });
        bolme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                giris = editText.getText().toString();
                deger1 = Double.parseDouble(editText.getText().toString());
                islem = "/";
                editText.setText("");
                text.setText(giris);
                giris="";

            }
        });
        cikarma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                giris = editText.getText().toString();
                deger1 = Double.parseDouble(editText.getText().toString());
                islem = "-";
                editText.setText("");
                text.setText(giris);
                giris="";

            }
        });

        esittir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                deger2 = Double.parseDouble(editText.getText().toString());
                text.setText(deger1 + islem + deger2);
                giris="";

                switch (islem) {

                    case "+": sonuc = deger1+deger2;
                            break;
                    case "-": sonuc = deger1-deger2;
                            break;
                    case "/": sonuc = deger1/deger2;
                            break;
                    case "x": sonuc = deger1*deger2;
                            break;
                }


                editText.setText(sonuc.toString());


            }
        });



    }
}