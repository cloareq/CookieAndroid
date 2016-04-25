package com.nutricloud.cloare_q.cookieandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("hello");
        String username = "patient1"; //get this from user input
        String password = "patient1"; //get this from user input
        new PostAsync().execute(username, password);
        new GetAsync().execute();
    }
}
