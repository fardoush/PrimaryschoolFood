package com.example.adminprimaryschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

public class GridViewActivity extends AppCompatActivity {
    private Button btn;
    GridView gridView;
    String[]countryName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        btn=findViewById(R.id.testbtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), SummaryActivity.class);
                startActivity(i);

            }
        });
//        gridView=findViewById(R.id.simpleGridView);
//       countryName=getResources().getStringArray(R.array.country_name);
//       CustomAdapter adapter= new CustomAdapter(this,countryName);
//       gridView.setAdapter(adapter);
    }
}
