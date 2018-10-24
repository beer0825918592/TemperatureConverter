package com.example.temperatureconverter;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.temperatureconverter.model.Temperature;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button ctof =findViewById(R.id.ctof);
        Button ftoc =findViewById(R.id.ftoc);



        ctof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText e=findViewById(R.id.editText);
                float number=Integer.parseInt(e.getText().toString());
                Temperature t=new Temperature(number);

                TextView text=findViewById(R.id.textView2);
                DecimalFormat df=new DecimalFormat();
                df.setMaximumFractionDigits(2);
                String s=""+df.format(t.calCtoF());

                text.setText(s);
            }
        });

        ftoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText e=findViewById(R.id.editText);
                float number=Integer.parseInt(e.getText().toString());
                Temperature t=new Temperature(number);

                TextView text=findViewById(R.id.textView2);
                DecimalFormat df=new DecimalFormat();
                df.setMaximumFractionDigits(2);

                String s=""+df.format(t.calFtoC());

                text.setText(s);


            }
        });
    }

}
