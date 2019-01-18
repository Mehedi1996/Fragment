package com.example.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void ChangeActivity(View view) {
        Fragment fragment = null;
        switch (view.getId()){
            case R.id.btStdent:
                fragment = new StudentFragment();
                break;
            case R.id.btRegistration:
                fragment = new StudentRegistrationFragment();
                break;

        }
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.FragmentContainer,fragment);
        fragmentTransaction.addToBackStack(null); //this use to back page
        fragmentTransaction.commit();
    }



}
