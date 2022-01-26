package com.cookandroid.week11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    FragmentA fragmentA;
    FragmentB fragmentB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentA = new FragmentA();
        fragmentB = new FragmentB();

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.container_a, fragmentA);
        fragmentTransaction.add(R.id.container_b, fragmentB);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void getDataFromA(CharSequence input){
        //((FragmentB)getSupportFragmentManager().findFragmentById(R.id.container_b)).updateFragBEditText(input);
        fragmentB.updateFragBEditText(input);
    }

    public void getDataFromB(CharSequence input){
        //((FragmentA)getSupportFragmentManager().findFragmentById(R.id.container_a)).updateFragAEditText(input);
        fragmentA.updateFragAEditText(input);
    }

//    @Override
//    public void onInputASent(CharSequence input) {
//        fragmentB.updateFragBEditText(input);
//    }
//
//    public void onInputBSent(CharSequence input) {
//        fragmentA.updateFragAEditText(input);
//    }
}