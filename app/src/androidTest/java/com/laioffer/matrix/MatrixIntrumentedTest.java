package com.laioffer.matrix;

import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class MatrixIntrumentedTest {
    @Rule
    public ActivityTestRule<ControlPanel> activityTestRule =
            new ActivityTestRule<>(ControlPanel.class);
/*
    @Test
    public void verifyMatrix() {
        onView(withText("Matrix")).check(matches(isDisplayed()));
    }

    @Test
    public void verifyLogin() {
        onView(withId(R.id.fab)).perform(click());

        onView(withText("Police")).perform(click());

        onView(withText("SEND")).check(matches(isDisplayed()));
    }*/

}
