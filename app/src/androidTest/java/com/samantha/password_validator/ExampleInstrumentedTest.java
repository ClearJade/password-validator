package com.samantha.password_validator;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.rule.ActivityTestRule;


import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class ExampleInstrumentedTest {

    private String strongText;
    private String weakText;

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.samantha.password_validator", appContext.getPackageName());
    }

    @Before
    public void initString()
    {
        strongText = "Password is strong";

        weakText = "Password is not strong enough";
    }

    @Test
    public void testStrong()
    {
        //Test strong test
        // Type text and then press the button.
        onView(withId(R.id.editText))
                .perform(typeText("TesTinG123"), closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());

        //Does test match
        onView(withId(R.id.textView)).check(matches(withText(strongText)));

    }


    @Test
    public void testWeak()
    {
        //Test strong test
        // Type text and then press the button.
        onView(withId(R.id.editText))
                .perform(typeText("test"), closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());

        //Does test match
        onView(withId(R.id.textView)).check(matches(withText(weakText)));

    }
}
