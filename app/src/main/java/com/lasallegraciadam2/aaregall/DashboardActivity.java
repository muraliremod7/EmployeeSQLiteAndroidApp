package com.lasallegraciadam2.aaregall;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import views.MainActivity;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Button employee = (Button)findViewById(R.id.employee);
        Button student = (Button)findViewById(R.id.student);
    }
    public void employee(View view){
        startActivity(new Intent(DashboardActivity.this, MainActivity.class));
        finish();
    }
    public void student(View view){
        startActivity(new Intent(DashboardActivity.this, MainActivity.class));
        finish();
    }
}
