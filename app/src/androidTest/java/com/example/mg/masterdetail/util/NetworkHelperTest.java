package com.example.mg.masterdetail.util;

import com.example.mg.masterdetail.screens.dayList.DayListActivity;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

import static junit.framework.Assert.assertTrue;

public class NetworkHelperTest {
    /*@Rule
    public ActivityTestRule<DayListActivity> mActivityTestRule =
            new ActivityTestRule<>(DayListActivity.class);*/

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();
    private DayListActivity mDayListActivity;


    @Before
    public void setUp() {
        //mDayListActivity = mActivityTestRule.getActivity();

    }


    @Test
    public void isNetworkAvailableTest() {

        NetworkHelper networkHelper = new NetworkHelper();
        assertTrue("Result", networkHelper.isNetworkAvailable(mDayListActivity));
    }

    @Test
    public void folder() throws IOException {
        File createFolder = folder.newFolder("new folder");
        File createFile = folder.newFile("myfile.txt");
        assertTrue(createFile.exists());
    }
}