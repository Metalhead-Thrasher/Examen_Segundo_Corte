package com.example.fragmentsrmd;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class sumitas extends Fragment implements View.OnClickListener {
    View view;
    Button botoncito;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_sumiitas,
                container, false);
        botoncito = view.findViewById(R.id.boton);
        botoncito.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getContext(), "hola",
                Toast.LENGTH_LONG).show();
    }
}