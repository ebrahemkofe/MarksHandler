package com.colleg.project.markshandler.Activitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.colleg.project.markshandler.R;

public class Assignment extends AppCompatActivity {

    Button upload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment);

        upload = findViewById(R.id.upload_pic);

        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_GET_CONTENT);
        intent.setType("image/*");
        startActivityForResult(intent, 2);
            }
        });
    }
}
