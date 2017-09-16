package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import walid44443.fb.androidlibrary.DisplayJokeActivity;


public class MainActivity extends AppCompatActivity implements onFinishTask {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new EndpointsAsyncTask(this, "joke", this).execute();


    }

    private String result = "null";
    public void tellJoke(View view) {
                Intent intent =new Intent(getApplicationContext(),DisplayJokeActivity.class);
                intent.putExtra("joke", result);
                startActivity(intent);
    }


    @Override
    public void onSucess(String result) {
        this.result = result;
    }

    @Override
    public void onError() {
        Toast.makeText(this, "an error occurred, please check connection", Toast.LENGTH_LONG);
    }
}
