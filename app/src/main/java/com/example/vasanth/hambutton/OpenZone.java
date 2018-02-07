package com.example.vasanth.hambutton;

import android.content.Intent;
import android.graphics.Path;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.vasanth.hambutton.openZone.BrickChallenge;
import com.example.vasanth.hambutton.openZone.ClayMoulding;
import com.example.vasanth.hambutton.openZone.CreativeSelfie;
import com.example.vasanth.hambutton.openZone.Dandiya;
import com.example.vasanth.hambutton.openZone.Fabulous;
import com.example.vasanth.hambutton.openZone.KingOfDice;
import com.example.vasanth.hambutton.openZone.MatlabMania;
import com.example.vasanth.hambutton.openZone.MirrorWalk;
import com.example.vasanth.hambutton.openZone.MockCID;
import com.example.vasanth.hambutton.openZone.Painting;
import com.example.vasanth.hambutton.openZone.Rangoli;

public class OpenZone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_zone);


    }

    public void clay(View v){
        startActivity(new Intent(OpenZone.this, ClayMoulding.class));
    }
    public void paint(View v){
        startActivity(new Intent(OpenZone.this, Painting.class));
    }
    public void rangoli(View v){
        startActivity(new Intent(OpenZone.this, Rangoli.class));
    }
    public void dandiya(View v){
        startActivity(new Intent(OpenZone.this, Dandiya.class));
    }
    public void matlab(View v){
        startActivity(new Intent(OpenZone.this, MatlabMania.class));
    }
    public void fabulous(View v){
        startActivity(new Intent(OpenZone.this, Fabulous.class));
    }
    public void brick(View v){
        startActivity(new Intent(OpenZone.this, BrickChallenge.class));
    }public void selfie(View v){
        startActivity(new Intent(OpenZone.this, CreativeSelfie.class));
    }
    public void king(View v){
        startActivity(new Intent(OpenZone.this, KingOfDice.class));
    }
    public void cid(View v){
        startActivity(new Intent(OpenZone.this, MockCID.class));
    }public void mirror(View v){
        startActivity(new Intent(OpenZone.this, MirrorWalk.class));
    }



}