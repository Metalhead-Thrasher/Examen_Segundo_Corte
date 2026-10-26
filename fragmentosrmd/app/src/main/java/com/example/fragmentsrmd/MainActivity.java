package com.example.fragmentsrmd;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {
    Button sumita, restita, multiplicadita, partidita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        sumita = findViewById(R.id.fragment1btn);
        sumita.setOnClickListener(this);

        restita = findViewById(R.id.fragment2btn);
        restita.setOnClickListener(this);

        multiplicadita = findViewById(R.id.fragment3btn);
        multiplicadita.setOnClickListener(this);
        partidita = findViewById(R.id.fragment4btn);
        partidita.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String cadenita = ((Button) v).getText().toString();
        if (cadenita.equals("+")) {
            sumitas fragmentito = new sumitas();
            reemplazarFragmento(fragmentito);
        }
        else
            if (cadenita.equals("-")) {
                restita fragmentito = new restita();
                reemplazarFragmento(fragmentito);
            }
            else
               if (cadenita.equals("*")) {
                    multiplicadita fragmentito = new multiplicadita();
                    reemplazarFragmento(fragmentito);
               }
               else
                   if (cadenita.equals("/")){
                       divisionsita fragmentito = new divisionsita();
                       reemplazarFragmento(fragmentito);
                   }
    }
        private void reemplazarFragmento(Fragment fragment){
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction =
                    fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.basesita,fragment);
            fragmentTransaction.commit();
        }
}