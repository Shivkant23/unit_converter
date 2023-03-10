package com.example.unitconvert;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button btn;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();


        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(editText.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Input is empty!", Toast.LENGTH_LONG).show();
                }
                double kilos_entered = Double.parseDouble(editText.getText().toString());
                double asd = convertToPounds(kilos_entered);
                textView.setText(String.format("%.2f", asd));
            }
        });

    }

    public void onClickButton(View view){
        EditText editText = findViewById(R.id.editText);
        TextView textView = findViewById(R.id.textView);
        String str = editText.getText().toString();
        textView.setText(str);
    }

    public double convertToPounds(double kilos){
        return kilos * 2.20462;
    }
}