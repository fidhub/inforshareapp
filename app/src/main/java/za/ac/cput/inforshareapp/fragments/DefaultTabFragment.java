package za.ac.cput.inforshareapp.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import za.ac.cput.inforshareapp.R;

/**
 * Created by Hunter on 19/01/2018.
 */

public class DefaultTabFragment extends Fragment {
    Button btn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.default_fragment_layout, container, false);
    }
}