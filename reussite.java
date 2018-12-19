package com.example.guill.moyenne;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.guill.moyenne.MainActivity.EXTRA_MESSAGE;

public class reussite extends AppCompatActivity {
    TextView felicitation;
    TextView votreMoyenne;
    TextView moyenne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reussite);
        this.felicitation = findViewById(R.id.felicitaion);
        this.votreMoyenne = findViewById(R.id.votreMoyenne);
        this.moyenne = findViewById(R.id.moyenne);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity. EXTRA_MESSAGE);
        moyenne.setText(message);
    }
}
