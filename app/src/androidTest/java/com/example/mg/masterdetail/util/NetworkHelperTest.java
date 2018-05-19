package com.example.mg.masterdetail.util;

import com.example.mg.masterdetail.screens.dayList.dayListActivity;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

import static junit.framework.Assert.assertTrue;

public class NetworkHelperTest {
    /*@Rule
    public ActivityTestRule<dayListActivity> mActivityTestRule =
            new ActivityTestRule<>(dayListActivity.class);*/

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();
    private dayListActivity mDayListActivity;


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