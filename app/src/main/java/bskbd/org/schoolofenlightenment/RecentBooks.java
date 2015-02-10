package bskbd.org.schoolofenlightenment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Dip on 2/10/2015.
 */
public class RecentBooks extends Fragment {

    public RecentBooks(){}

    View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.recent_books_layout, container, false);

        return rootView;
    }
}
