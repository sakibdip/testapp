package bskbd.org.schoolofenlightenment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Dip on 2/10/2015.
 */
public class RecentReads extends Fragment {

    public RecentReads(){}
    View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.recent_reads_layout, container, false);

        return rootView;
    }
}
