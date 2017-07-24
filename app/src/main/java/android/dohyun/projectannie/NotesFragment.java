package android.dohyun.projectannie;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by Dohyun on 2016-07-20.
 */
public class NotesFragment extends Fragment {

    public static TabLayout tabLayout;
    public static ViewPager viewPager;
    public static int int_items = 3;

    private int[] tabIcons = {
            R.drawable.ic_home,
            R.drawable.ic_pets,
            R.drawable.ic_location_on
    };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_notes, null);
        tabLayout = (TabLayout) view.findViewById(R.id.tabs);
        viewPager = (ViewPager) view.findViewById(R.id.view_pager);
        viewPager.setAdapter(new MyAdapter(getChildFragmentManager()));

        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.fab_notes);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Notes",
                        Toast.LENGTH_LONG).show();

            }
        });

        tabLayout.post(new Runnable() {
            @Override
            public void run() {
                tabLayout.setupWithViewPager(viewPager);
            }
        });

        for (int i = 0; i < tabLayout.getTabCount(); i++) {
            tabLayout.getTabAt(i).setIcon(tabIcons[i]);
        }

        return view;
    }



    private class MyAdapter extends FragmentPagerAdapter {
        public MyAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            switch(position) {
                case 0 : return new PichuFragment();
                case 1 : return new PikachuFragment();
                case 2 : return new RaichuFragment();
            }
            return null;
        }

        @Override
        public int getCount() {
            return int_items;
        }

        public CharSequence getPageTitle(int position) {
            switch(position) {
                case 0 :
                    return "Pichu";
                case 1 :
                    return "Pikachu";
                case 2 :
                    return "Raichu";
            }
            return null;
        }
    }
}
