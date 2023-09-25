package com.example.zoo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText nameEditText;
    private Button sayHelloBtn;
    private TextView sayHelloTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        // Inisialisasi komponen
        nameEditText = findViewById(R.id.nameEditText);
        sayHelloBtn = findViewById(R.id.sayHelloBtn);

        sayHelloBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ambil teks dari EditText
                String teks = nameEditText.getText().toString();

                // Set teks yang diambil ke TextView
                setContentView(R.layout.home);
                sayHelloTextView = findViewById(R.id.sayHelloTextView);
                sayHelloTextView.setText(teks);
            }
        });
    }
}