package com.example.collapsingtoolbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.example.collapsingtoolbar.Adapter.ListAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class HealthActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<Integer> images;
    private ArrayList<String> titles;

    private ListAdapter listAdapter;

    private FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);

        floatingActionButton = (FloatingActionButton) findViewById(R.id.addReportFab);

        images = getImages();
        titles = getTitles();

        listView = (ListView) findViewById(R.id.listView);
        listAdapter = new ListAdapter(getApplicationContext(), images, titles);
        listView.setAdapter(listAdapter);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HealthActivity.this, CreateHealthReport.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Now to create a new report", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private ArrayList<Integer> getImages(){
        images = new ArrayList<>();
        images.add(R.drawable.fa);
        return images;
    }

    private ArrayList<String> getTitles(){
        titles = new ArrayList<>();
        titles.add("Report 1 Title");
        titles.add("Report 2 Title");
        titles.add("Report 3 Title");
        titles.add("Report 4 Title");
        return titles;
    }
}
