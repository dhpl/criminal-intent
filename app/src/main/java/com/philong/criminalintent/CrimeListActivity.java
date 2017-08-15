package com.philong.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Long on 8/15/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity{

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }

}
