package com.harrington.richard.criminalintent;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class CrimeListFragment extends ListFragment {
    private static final String TAG = "CrimeListFragment";

    private ArrayList<Crime> crimes;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(R.string.crimes_title);
        crimes = CrimeLab.get(getActivity()).getCrimes();

        ArrayAdapter<Crime> adapter = new ArrayAdapter<Crime>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                crimes);
        setListAdapter(adapter);

    }

    @Override
    public void onListItemClick(ListView list, View view, int position, long id) {
        Crime crime = (Crime)(getListAdapter()).getItem(position);
        Log.d(TAG, crime.getTitle() + " was clicked");
    }
}
