package com.colleg.project.markshandler;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SubjectDetilsActivity extends AppCompatActivity {
    private Fragment fragment;
    private FragmentTransaction transaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_detils);

        fragment = new AttendFragment();
        transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.user_fragment, fragment, "Med_Data_Fragment");
        transaction.commitNow();
    }

    public void Attendis(View view) {
        fragment = new AttendFragment();
        transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.user_fragment, fragment, "Med_Data_Fragment");
        transaction.commitNow();


    }

    public void Assaiments(View view) {
        fragment = new AssimentsFragment();
        transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.user_fragment, fragment, "Med_Data_Fragment");
        transaction.commitNow();


    }
}
