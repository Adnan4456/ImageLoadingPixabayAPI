package com.example.codingtask.ui.fragments


import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click

import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
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
    fun progressbar_is_not_showing() {
        onView(withId(R.id.progressBar))
            .check(matches(withEffectiveVisibility(Visibility.GONE)))
    }

    @Test
    fun searchbarisInvisibile(){
        onView(withId(R.id.search))
            .check(matches(withEffectiveVisibility(Visibility.GONE)))
    }

    @Test
    fun clickFab(){
        //in start it is GONE
        onView(withId(R.id.search))
            .check(matches(withEffectiveVisibility(Visibility.GONE)))

        //click on FAB
        onView(withId(R.id.searchViewFab))
            .perform(click())

        //check layout is visibile
        onView(withId(R.id.search))
            .check(matches(withEffectiveVisibility(Visibility.VISIBLE)))

        //again click on FAB
        onView(withId(R.id.searchViewFab))
            .perform(click())

        //then start it is again visibility.GONE
        onView(withId(R.id.search))
            .check(matches(withEffectiveVisibility(Visibility.GONE)))
    }
}