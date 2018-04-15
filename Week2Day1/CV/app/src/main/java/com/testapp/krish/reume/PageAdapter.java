package com.testapp.krish.reume;

import android.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.Switch;

/**
 * Created by Krishna on 4/11/2018.
 */
public class PageAdapter extends FragmentPagerAdapter{
    public PageAdapter(FragmentManager fm) {
        super(fm);
    }

    private String tabs[] = new String[] {"Home","About Me","Experience","Contact"};



    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new HomeFragment();
            case 1: return new AboutMeFragment();
            case 2: return new ExperienceFragment();
            case 3: return new ContactFragment();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return tabs.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }
}
