package com.harrington.richard.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

public class CrimeLab {
    private static CrimeLab crimeLab;
    private Context appContext;

    private ArrayList<Crime> crimes;

    public static CrimeLab get(Context c) {
        if (crimeLab == null) {
            crimeLab = new CrimeLab(c.getApplicationContext());
        }
        return crimeLab;
    }

    public ArrayList<Crime> getCrimes() {
        return crimes;
    }

    public Crime getCrime(UUID id) {
        for (Crime crime : crimes) {
            if (crime.getId().equals(id)) {
                return crime;
            }
        }
        return null;
    }

    public void addCrime(Crime crime) {
        crimes.add(crime);
    }

    private CrimeLab(Context appContext) {
        this.appContext = appContext;
        this.crimes = new ArrayList<Crime>();
    }
}
