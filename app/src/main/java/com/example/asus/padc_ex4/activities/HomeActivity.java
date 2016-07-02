package com.example.asus.padc_ex4.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ShareActionProvider;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.asus.padc_ex4.PADCExApp;
import com.example.asus.padc_ex4.R;
import com.example.asus.padc_ex4.fragments.PADCCinemaFragment;
import com.example.asus.padc_ex4.fragments.PADCJobsearchFragment;
import com.example.asus.padc_ex4.fragments.PADCLinkedinFragment;
import com.example.asus.padc_ex4.fragments.PADCPulseFragment;
import com.example.asus.padc_ex4.fragments.PADCWinzinFragment;

public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener,
        MenuItemCompat.OnActionExpandListener{
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private FrameLayout flContainer;
    private ShareActionProvider mShareActionProvider;
    Toolbar mActionBarToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayShowTitleEnabled(false);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        if(savedInstanceState ==null){
            PADCLinkedinFragment linkedinFragment=PADCLinkedinFragment.newInstance();
            getSupportFragmentManager().beginTransaction()
                .replace(R.id.fl_container, linkedinFragment)
                .commit();
        }
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.navigation_view);
        Menu leftMenu = navigationView.getMenu();
        navigationView.setNavigationItemSelectedListener(this);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id) {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
            case R.id.action_settings:
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void navigateToJobSearch() {
        PADCJobsearchFragment jobsearchFragment=PADCJobsearchFragment.newInstance();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fl_container, jobsearchFragment)
                .commit();
        TextView title = (TextView) findViewById(R.id.tv_title);
        title.setText("PADC - JobSearch");
    }

    private void navigateToPulse() {
        PADCPulseFragment pulseFragment=PADCPulseFragment.newInstance();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fl_container, pulseFragment)
                .commit();
        TextView title = (TextView) findViewById(R.id.tv_title);
        title.setText("PADC - Pulse");
    }
    private void navigateToCinema() {
        PADCCinemaFragment cinemaFragment=PADCCinemaFragment.newInstance();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fl_container, cinemaFragment)
                .commit();
        TextView title = (TextView) findViewById(R.id.tv_title);
        title.setText("PADC - Cinema");
    }
    private void navigateToWinzin() {
        PADCWinzinFragment winzinFragment=PADCWinzinFragment.newInstance();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fl_container, winzinFragment)
                .commit();
        TextView title = (TextView) findViewById(R.id.tv_title);
        title.setText("PADC - Winzin");
    }
    private void navigateToLinkedin() {
        PADCLinkedinFragment linkedinFragment=PADCLinkedinFragment.newInstance();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fl_container, linkedinFragment)
                .commit();
        TextView title = (TextView) findViewById(R.id.tv_title);
        title.setText("PADC - Linkedin");
    }
    @Override
    public boolean onNavigationItemSelected(final MenuItem menuItem) {
        menuItem.setChecked(true);
        drawerLayout.closeDrawers();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                switch (menuItem.getItemId()) {
                    case R.id.left_menu_linkedin:
                        navigateToLinkedin();
                        break;
                    case R.id.left_menu_jobsearch:
                        navigateToJobSearch();
                        break;
                    case R.id.left_menu_pulse:
                        navigateToPulse();
                        break;
                    case R.id.left_menu_cinema:
                        navigateToCinema();
                        break;
                    case R.id.left_menu_winzin:
                        navigateToWinzin();
                        break;

                }
            }
        }, 100); //to close drawer smoothly.
        return false;
    }

    @Override
    public boolean onMenuItemActionExpand(MenuItem item) {
        return false;
    }

    @Override
    public boolean onMenuItemActionCollapse(MenuItem item) {
        return false;
    }
}
