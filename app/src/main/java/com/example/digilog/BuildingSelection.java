package com.example.digilog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BuildingSelection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_building_selection);
    }

    public void openLRoom(View view) {
        startActivity(new Intent(this, LibraryPage.class));
    }

    public void openLab(View view) {
        startActivity(new Intent(this, LabPage.class));
    }
}