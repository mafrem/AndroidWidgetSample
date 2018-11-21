package com.example.hordesk.myapplication.Drawer;

import android.support.test.rule.ActivityTestRule;
import android.view.View;

import com.example.hordesk.myapplication.Cards.CardActivity;
import com.example.hordesk.myapplication.R;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class DrawerActivityTest {


    @Rule
    public ActivityTestRule<CardActivity> cardActivityActivityTestRule = new ActivityTestRule<CardActivity>(CardActivity.class);

    public CardActivity cardActivity = null;


    @Before
    public void setUp() throws Exception {
        cardActivity = cardActivityActivityTestRule.getActivity();
    }

    @Test
    public void testLaunch() {
        View view = cardActivity.findViewById(R.id.imageView);
        assertEquals(1,1);

    }

    @After
    public void tearDown() throws Exception {
        cardActivity = null;
    }

}
