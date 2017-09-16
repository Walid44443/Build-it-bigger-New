package com.udacity.gradle.builditbigger;


import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.concurrent.ExecutionException;

import walid44443.fb.mylib.Jokes;

import static junit.framework.Assert.assertNotNull;

/**
 * Created by walid4444 on 9/15/17.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {


    private Context instrumentationCtx;

    @Before
    public void setup() {
        instrumentationCtx = InstrumentationRegistry.getContext();
    }

    @Test
    public void MainActivityTestMethod(){


        new EndpointsAsyncTask(instrumentationCtx, "joke", new onFinishTask() {
            @Override
            public void onSucess(String result) {
                Log.i("result", result);
                if (Arrays.asList(Jokes.joke_arr).contains(result) && !result.isEmpty() && result != null) {
                    assertNotNull(result);
                    Log.i("result", "done");
                }
            }

            @Override
            public void onError() {
                Log.d("result : ", "no connection , please check your connection");
            }
        }).execute();

    }


}
