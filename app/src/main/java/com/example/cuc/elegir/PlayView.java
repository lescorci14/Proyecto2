package com.example.cuc.elegir;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

public class PlayView extends AppCompatActivity {
    private Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_view);

    }

    public void comienzaEmpacar(View v){
        i=new Intent(PlayView.this, Pregunta1.class);
        startActivity(i);
    }

    public void volverPrincipal(View v){
        i = new Intent(PlayView.this, Principal.class);
        startActivity(i);
    }
}
