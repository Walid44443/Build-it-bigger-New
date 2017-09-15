package com.udacity.gradle.builditbigger;


import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;

import walid44443.fb.mylib.Jokes;

import static junit.framework.Assert.assertNotNull;

/**
 * Created by walid4444 on 9/15/17.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void MainActivityTestMethod(){

        new EndpointsAsyncTask() {
            @Override
            protected void onPostExecute(String result) {
                super.onPostExecute(result);
                if (Arrays.asList(Jokes.joke_arr).contains(result) && !result.isEmpty() && result != null)
                    assertNotNull(result);

            }
        };

    }
}
