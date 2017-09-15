package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.util.Pair;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import walid44443.fb.androidlibrary.DisplayJokeActivity;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.AllOf.allOf;

/**
 * Created by walid4444 on 9/15/17.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void MainActivityTestMethod(){

        ViewInteraction appCompatButton = onView(
                allOf(withText("Tell Joke"),
                        withParent(allOf(withId(R.id.fragment),
                                withParent(withId(android.R.id.content)))),
                        isDisplayed()));

        //appCompatButton.perform(click());
    }
}
