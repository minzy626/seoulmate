package android.dohyun.projectannie;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FoldersFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FoldersFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TrashFragment extends Fragment {

    public TrashFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_trash, container, false);
    }
}
