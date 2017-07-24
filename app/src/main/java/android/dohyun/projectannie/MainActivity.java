package android.dohyun.projectannie;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    DrawerLayout mDrawerLayout;
    NavigationView mNavigationView;
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mNavigationView = (NavigationView) findViewById(R.id.navigation_view);

        mFragmentManager = getSupportFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.replace(R.id.frame_layout, new NotesFragment()).commit();



        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                mDrawerLayout.closeDrawers();

                if(menuItem.getItemId() == R.id.menu_notes) {
                    FragmentTransaction fragmentTransactionNotes = mFragmentManager.beginTransaction();
                    fragmentTransactionNotes.replace(R.id.frame_layout, new NotesFragment()).commit();
                }
                if(menuItem.getItemId() == R.id.menu_folders) {
                    FragmentTransaction fragmentTransactionFolders = mFragmentManager.beginTransaction();
                    fragmentTransactionFolders.replace(R.id.frame_layout, new FoldersFragment()).commit();
                }
                if(menuItem.getItemId() == R.id.menu_trash) {
                    FragmentTransaction fragmentTransactionTrash = mFragmentManager.beginTransaction();
                    fragmentTransactionTrash.replace(R.id.frame_layout, new TrashFragment()).commit();
                }
                if(menuItem.getItemId() == R.id.menu_settings) {
                    FragmentTransaction fragmentTransactionSettings = mFragmentManager.beginTransaction();
                    fragmentTransactionSettings.replace(R.id.frame_layout, new SettingsFragment()).commit();
                }
                if(menuItem.getItemId() == R.id.menu_info) {
                    FragmentTransaction fragmentTransactionInfo = mFragmentManager.beginTransaction();
                    fragmentTransactionInfo.replace(R.id.frame_layout, new InfoFragment()).commit();
                }

                return false;
            }
        });



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        ActionBarDrawerToggle mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar, R.string.app_name, R.string.app_name);

        mDrawerLayout.setDrawerListener(mDrawerToggle);
        mDrawerToggle.syncState();

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
