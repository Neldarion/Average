package com.example.guill.moyenne;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.guill.moyenne.MESSAGE";
    TextView titre;
    EditText op1;
    EditText op2;
    EditText op3;
    Button btnCalcul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.titre = findViewById(R.id.titre);
        this.op1 = findViewById(R.id.op1);
        this.op2 = findViewById(R.id.op2);
        this.op3 = findViewById(R.id.op3);
        this.btnCalcul = findViewById(R.id.btnCalcul);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
    }

    public void calculer(View view){
        float fn1 = Float.parseFloat(this.op1.getText().toString());
        float fn2 = Float.parseFloat(this.op2.getText().toString());
        float fn3 = Float.parseFloat(this.op3.getText().toString());
        float fmoy = (fn1+fn2+fn3)/3;
        String moy = String.valueOf(fmoy);
        Toast.makeText(this, moy, Toast.LENGTH_SHORT).show();
        if(fmoy >= 10){
            Intent intent = new Intent(this, reussite.class);
            String message = String.valueOf(fmoy);
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        }
        else {
            Intent intent = new Intent(this, recale.class);
            String message = String.valueOf(fmoy);
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        }
    }
}
