
package com.example.solis.numberthree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button mSubmitButton;
    TextView mDisplayTextView;
    Spinner mMonths;
    String[] mSmonths = new String[] {
            "January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "October",
            "November",
            "December"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSubmitButton = findViewById(R.id.submit_Button);
        mDisplayTextView = findViewById(R.id.displayText_TextView);
        mMonths = findViewById(R.id.month_Spinner);

        ArrayAdapter<String> sMonth = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, mSmonths);

        sMonth.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mMonths.setAdapter(sMonth);

        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "submit button has been clicked", Toast.LENGTH_SHORT).show();

                String item = mMonths.getSelectedItem().toString();
                mDisplayTextView.setText(item);

            }
        });
    }
}
