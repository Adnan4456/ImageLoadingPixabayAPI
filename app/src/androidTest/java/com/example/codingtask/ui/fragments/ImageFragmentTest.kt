package com.example.codingtask.ui.fragments

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.codingtask.R
import com.example.codingtask.ui.activity.MainActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class ImagesFragmentTest {

    @Rule
    @JvmField
    var activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun recyclerview_is_showing() {
        onView(withId(R.id.imageRecycler))
            .check(matches(isDisplayed()))
    }

    @Test
    fun searchView_is_showing() {
        onView(withId(R.id.search))
            .check(matches(isDisplayed()))
    }
    @Test
    fun testNaivagtion(){

        //Nav direction
//        onView(withId(R.id.imageRecycler))
//            .perform(click())

        //verify
//        onView(withId(R.id.fragment_dialog))
//            .check(matches(isDisplayed()))

    }
}