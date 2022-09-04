package com.example.codingtask.ui.fragments

import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.codingtask.R
import com.example.codingtask.ui.activity.MainActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class DetailFragmentTest {

    @Rule
    @JvmField
    var activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)



    @Test
    fun username_is_showing() {

        onView(withId(R.id.textView6))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun image_is_showing() {
        onView(withId(R.id.imageViewUser))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun checkExpandableLayout(){

        //it is invisibile
        onView(withId(R.id.expandableLayout))
            .check(ViewAssertions.matches(ViewMatchers.withEffectiveVisibility(ViewMatchers.Visibility.GONE)))

        //onClick dropdown imageView show expandable layout
        onView(withId(R.id.dropdown))
            .perform(ViewActions.click())

        //it willl visibile
        onView(withId(R.id.expandableLayout))
            .check(ViewAssertions.matches(ViewMatchers.withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE)))

        //again onClick dropdown imageView Gone expandable layout
        onView(withId(R.id.dropdown))
            .perform(ViewActions.click())

        //it is invisibile
        onView(withId(R.id.expandableLayout))
            .check(ViewAssertions.matches(ViewMatchers.withEffectiveVisibility(ViewMatchers.Visibility.GONE)))


    }
}