package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount;
    TextView mShowCount;
    Button btnZero;
    Button btnCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCount = 0;
        mShowCount = findViewById(R.id.show_count);
        btnZero = findViewById(R.id.button_zero);
        btnCount = findViewById(R.id.button_count);

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.GRAY);
                mCount = 0;
                mShowCount.setText("0");
            }
        });


    }

    public void showToast(View view) {
        Toast.makeText(MainActivity.this, R.string.toast_message, Toast.LENGTH_SHORT).show();
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
        if (mCount % 2 == 0) {
            view.setBackgroundColor(Color.RED);
        } else {
            view.setBackgroundColor(Color.GREEN);
        }

        btnZero.setBackgroundColor(Color.CYAN);
    }
}