package com.harrington.richard.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class CrimeFragment extends Fragment {
    private Crime crime;
    private EditText titleField;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        crime = new Crime();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_crime, parent, false);

        titleField = (EditText) v.findViewById(R.id.crime_title);
        titleField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {
                // it is total bullshit that we have to implement this
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int count, int after) {
                crime.setTitle(charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable c) {
                // it is total bullshit that we have to implement this
            }
        });

        return v;

    }



}
