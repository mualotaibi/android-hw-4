package com.example.gradecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText x;
    EditText y;
    Button cal;
    TextView s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText x = findViewById(R.id.height);
        final EditText y = findViewById(R.id.weight);
        final Button cal = findViewById(R.id.button1);
        final TextView s = findViewById(R.id.TextView);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.parseDouble(x.getText().toString());
                double n2 = Double.parseDouble(y.getText().toString());
                double n3 = Double.parseDouble(cal.getText().toString());
                double n4 = Double.parseDouble(s.getText().toString());

                double m = n1 + n2 + n3 + n4;

                if (m >= 90) {
                    s.setText('A');
                } else if (m >= 80) {
                    s.setText('B');
                } else if (m >= 70) {
                    s.setText('C');
                } else if (m >= 60) {
                    s.setText('D');
                }

                String heightString = x.getText().toString();
                double height = Double.parseDouble(heightString);

                String weightString = y.getText().toString();
                double weight = Double.parseDouble(weightString);
                ;


                Double bmi = (weight / (height * height)) * 10000;
                System.out.println(bmi);

                Toast.makeText(MainActivity.this, "this is your BMi; " + bmi, Toast.LENGTH_LONG).show();
            }
        });
        Toast toast = Toast.makeText(getApplicationContext(), 'a', Toast.LENGTH_SHORT);
        toast.show();

    }
}

