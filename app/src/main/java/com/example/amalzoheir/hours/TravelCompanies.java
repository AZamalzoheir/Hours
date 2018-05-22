package com.example.amalzoheir.hours;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableRow;

public class TravelCompanies extends AppCompatActivity {
    TableRow showComany1DetialsTbaleRow;
    TableRow showComany2DetialsTbaleRow;
    TableRow showComany3DetialsTbaleRow;
    TableRow showComany4DetialsTbaleRow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_companies);
        showComany1DetialsTbaleRow=(TableRow) findViewById(R.id.company1_tr);
        showComany2DetialsTbaleRow=(TableRow) findViewById(R.id.company2_tr);
        showComany3DetialsTbaleRow=(TableRow) findViewById(R.id.company3_tr);
        showComany4DetialsTbaleRow=(TableRow) findViewById(R.id.company4_tr);
        showComany1DetialsTbaleRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TravelCompanies.this, LuxorDescripionActivity.class));
            }
        });
        showComany2DetialsTbaleRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TravelCompanies.this, LuxorDescripionActivity.class));
            }
        });
        showComany3DetialsTbaleRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TravelCompanies.this, LuxorDescripionActivity.class));
            }
        });
        showComany4DetialsTbaleRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TravelCompanies.this, LuxorDescripionActivity.class));
            }
        });
    }
}
