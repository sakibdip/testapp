package bskbd.org.schoolofenlightenment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Dip on 2/10/2015.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 3;
    // Tab Titles
    private String tabtitles[] = new String[] { "Recent Reads", "Library", "Recent Books"};
    Context context;

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {

            // Open FragmentTab1.java
            case 0:
                RecentReads recentReads = new RecentReads();
                return recentReads;

            // Open FragmentTab2.java
            case 1:
                Library mLibrary = new Library();
                return mLibrary;

            // Open FragmentTab2.java
            case 2:
                RecentBooks recentBooks = new RecentBooks();
                return recentBooks;
        }
        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabtitles[position];
    }
}
