package com.anibalosorio.colombiaturisticavfinal;

import android.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.PagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;


public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(pagerAdapter);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        ActionBar.TabListener tabListener = new ActionBar.TabListener() {
            @Override
            public void onTabSelected(ActionBar.Tab tab, android.support.v4.app.FragmentTransaction ft) {
                mViewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(ActionBar.Tab tab, android.support.v4.app.FragmentTransaction ft) {

            }

            @Override
            public void onTabReselected(ActionBar.Tab tab, android.support.v4.app.FragmentTransaction ft) {

            }
        };

        ActionBar.Tab tab = actionBar.newTab().setText("Parque").setTabListener(tabListener);
        actionBar.addTab(tab);
        tab = actionBar.newTab().setTabListener(tabListener).setText("Iglesia");
        actionBar.addTab(tab);
        tab = actionBar.newTab().setText("Fincas").setTabListener(tabListener);
        actionBar.addTab(tab);

        tab = actionBar.newTab().setText("Barra").setTabListener(tabListener);
        actionBar.addTab(tab);
        tab = actionBar.newTab().setTabListener(tabListener).setText("Kiosco");
        actionBar.addTab(tab);
        tab = actionBar.newTab().setText("Talanquera").setTabListener(tabListener);
        actionBar.addTab(tab);

        tab = actionBar.newTab().setText("Villa").setTabListener(tabListener);
        actionBar.addTab(tab);
        tab = actionBar.newTab().setTabListener(tabListener).setText("Hotel");
        actionBar.addTab(tab);
        tab = actionBar.newTab().setText("V. Sofía").setTabListener(tabListener);
        actionBar.addTab(tab);

        mViewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            public void onPageSelected(int position) {
                getSupportActionBar().setSelectedNavigationItem(position);
            }

        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        android.app.FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        if (id == R.id.mTurismo) {

            class PagerAdapter extends FragmentPagerAdapter {
                public PagerAdapter(FragmentManager fm) {
                    super(fm);
                }

                @Override
                public Fragment getItem(int position) {
                    switch (position){
                        case 0: return new ParqueFragment();
                        case 1: return new IglesiaFragment();
                        case 2: return new FincasFragment();
                        default: return null;
                    }

                }

                @Override
                public int getCount() {
                    return 3;
                }
            }

        }

        if (id == R.id.mHoteles) {

            class PagerAdapter extends FragmentPagerAdapter {
                public PagerAdapter(FragmentManager fm) {
                    super(fm);
                }

                @Override
                public Fragment getItem(int position) {
                    switch (position){
                        case 0: return new FamiFragment();
                        case 1: return new SofiaFragment();
                        case 2: return new VillaFragment();
                        default: return null;
                    }

                }

                @Override
                public int getCount() {
                    return 3;
                }
            }

        }

        if (id == R.id.mBares) {

            class PagerAdapter extends FragmentPagerAdapter {
                public PagerAdapter(FragmentManager fm) {
                    super(fm);
                }

                @Override
                public Fragment getItem(int position) {
                    switch (position){
                        case 0: return new BarraFragment();
                        case 1: return new KioscoFragment();
                        case 2: return new TalanqueraFragment();
                        default: return null;
                    }

                }

                @Override
                public int getCount() {
                    return 3;
                }
            }

        }
        return super.onOptionsItemSelected(item);
    }


}
