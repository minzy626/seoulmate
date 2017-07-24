package android.dohyun.projectannie;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FoldersFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FoldersFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FoldersFragment extends Fragment {

    public FoldersFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        View view = inflater.inflate(R.layout.fragment_folders, null);

        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.fab_folders);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Folders",
                        Toast.LENGTH_LONG).show();
            }
        });

        return view;

    }
}
