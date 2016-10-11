package jobgar.prakhar.example.com.jobgar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by Prakhar Gupta on 10/10/2016.
 */

public class Profile extends AppCompatActivity {

    TabFragment1 tabFragment1;
    TabFragment2 tabFragment2;
    TabFragment3 tabFragment3;
    TabFragment4 tabFragment4;
    TabLayout tabLayout;
    ViewPager viewPager;
    TabAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tabFragment1 = new TabFragment1();
        tabFragment2 = new TabFragment2();
        tabFragment3 = new TabFragment3();
        tabFragment4 = new TabFragment4();

        viewPager = (ViewPager) findViewById(R.id.profileViewPager);
        adapter = new TabAdapter(getSupportFragmentManager());
        adapter.addFragment(tabFragment1, "Fragment 1");
        adapter.addFragment(tabFragment2, "Fragment 2");
        adapter.addFragment(tabFragment3, "Fragment 3");
        adapter.addFragment(tabFragment4, "Fragment 4");
        viewPager.setOffscreenPageLimit(1);
        viewPager.setAdapter(adapter);

        tabLayout = (TabLayout) findViewById(R.id.profileTabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
